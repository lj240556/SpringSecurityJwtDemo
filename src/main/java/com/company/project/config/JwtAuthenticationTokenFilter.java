package com.company.project.config;

import com.company.project.utils.TokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TokenFilter 用于每次从请求中验证token
 */
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtAuthenticationTokenFilter.class);

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String authHeader = httpServletRequest.getHeader("Authorization");// 从 http 请求头中取出 token
        // The part after "Bearer"  获取"Bearer"后面的token部分
        if (authHeader != null && authHeader.startsWith("Bearer")) {
            String token = authHeader.substring("Bearer".length());
            //从token中获取用户信息
            String username = TokenUtil.getInfoFromToken(token);
            LOGGER.info("checking username:{}", username);
            //username不为空  并且spring security中没有存入过认证对象
            if(username!=null && SecurityContextHolder.getContext().getAuthentication() == null){
                try{
                    UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
                    //验证token
                    if (TokenUtil.verifyToken(token, userDetails)) {
                        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
                        LOGGER.info("authenticated user:{}", username);
                        //将用户对象放入spring security中
                        SecurityContextHolder.getContext().setAuthentication(authentication);
                    }
                }
                catch (Exception e){
                    LOGGER.error("token中的信息不正确:{}",e.getMessage());
                }
            }
        }
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }

}

