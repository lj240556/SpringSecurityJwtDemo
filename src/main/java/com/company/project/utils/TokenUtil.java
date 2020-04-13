package com.company.project.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
/**
 * 生成token和验证token
 */
public class TokenUtil {
    private static final Logger LOG = LoggerFactory.getLogger(TokenUtil.class);

    // 密钥
    public static final String SECRET = "companiontek.com";

    /**
     * 获取TOKEN
     * @param username  将username写入payload中
     * @return
     */
    public static String getToken(String  username) {
        Date iatDate = new Date();

        // 过期时间 3个小时
        Calendar nowDate = Calendar.getInstance();
        nowDate.add(Calendar.HOUR_OF_DAY, 3);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date expireTime = nowDate.getTime();


        LOG.info("token过期时间={}", df.format(expireTime));

        // header
        Map<String, Object> headerMap = new HashMap<>();
        headerMap.put("alg", "HS256");
        headerMap.put("typ", "JWT");

        //payload
        JWTCreator.Builder tokenBuilder = JWT.create().withHeader(headerMap);
        tokenBuilder.withIssuer("JWT Service");
        //放入过期时间
        tokenBuilder.withExpiresAt(expireTime);
        //发放时间
        tokenBuilder.withIssuedAt(iatDate);
        //放入自己需要的字段
      //  tokenBuilder.withClaim("uid", uid).withClaim("username",username);
        //放入自己需要的字段
        tokenBuilder.withAudience(username);

        //sign 生成token
        String token = tokenBuilder.sign(Algorithm.HMAC256(SECRET));

        return token;
    }

    /**
     * 解密TOKEN--解析失败返回false
     * 成功返回  true
     * @param token
     * @return
     */
    public static  Boolean verifyToken(String token, UserDetails userDetails)  {
        DecodedJWT jwt = null;
        try {
            JWTVerifier verify = JWT.require(Algorithm.HMAC256(SECRET)).build();
            jwt = verify.verify(token);
        } catch (Exception e) {
            LOG.error("解析TOKEN失败,token为空!!或者Token 已过期！！");
            return false; //
        }

        //是否过期
        Date expiredDate = jwt.getExpiresAt();
        if (expiredDate.before(new Date())&&getInfoFromToken(token)==userDetails.getUsername())  {
            LOG.error("Token 已过期！！！！");
            return false;
        }

        return true;
    }

    /**
     * 从TOKEN中获取数据 usrname
     * @param
     * @return
     */
    public static String getInfoFromToken(String token) {
          String name= null;
        try {
            name= JWT.decode(token).getAudience().get(0);
        }catch (Exception e){
            LOG.info("从token获取信息异常={}", e);
        }
        return name;
}





}
