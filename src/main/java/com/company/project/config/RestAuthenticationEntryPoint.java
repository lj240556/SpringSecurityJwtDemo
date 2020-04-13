package com.company.project.config;

import com.company.project.core.ResultGenerator;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author  LiuJiang
 * @create  2020/3/3 16:44
 * @desc 当未登录或者token失效访问接口时，返回的结果
 **/
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(ResultGenerator.getUnAuthorizedResult("未登录或者token失效!!!"));
        response.getWriter().flush();
    }
}
