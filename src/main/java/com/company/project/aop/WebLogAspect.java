package com.company.project.aop;

import com.company.project.annotation.WebLog;
import com.company.project.model.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author  LiuJiang
 * @create  2020/3/31 9:31
 * @desc   统一日志处理切面
 **/
@Aspect
@Component
public class WebLogAspect {

    private final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

//    @Resource
//    private LogTableMapper sysLogMapper;
//
//    @Resource
//    private UserTabService userTabService;

    @Around("@annotation(com.company.project.annotation.WebLog)")
    public Object   logAfterController(ProceedingJoinPoint pjp) {
        //获取当前请求对象
        //这个RequestContextHolder是Springmvc提供来获得请求的东西
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();

        // 获取方法签名
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();

        // 请求的方法
        String methodname = methodSignature.getMethod().getName();

        //请求的类名
        String ClassName=pjp.getSignature().getDeclaringTypeName();

        //请求的参数
        String ArgsName=Arrays.toString(pjp.getArgs());

        //IP地址
        String ipdress=request.getRemoteAddr();

        //请求URL
        String URL=request.getRequestURL().toString();

        //请求方式
        String WebMethod=request.getMethod();

        // 创建一个日志对象(准备记录日志)
        Log logSys  = new Log();
        //logSys.setLoginip(request.getRemoteAddr());

        // 获取指定方法上面的注解
        WebLog logAnno = methodSignature.getMethod().getAnnotation(WebLog.class);
        // 获取操作描述的属性值
        String operateType = logAnno.operateType();

        logSys.setContent(operateType);
        //logSys.setLoginip(ipdress);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date d= new Date();
        String opertime = sdf.format(d);
        //logSys.setOperationtime(opertime);
        logSys.setCtime(new Date());

        //获取用户名
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
//            UserTab userTabvo=  userTabService.findBy("phone",authentication.getName());
//            logSys.setUsername(userTabvo.getUsername());
        }
        else {
//            logSys.setUsername("Anonymity");
        }
        // 记录下请求内容
        logger.info("################请求地址为URL : " + URL);
        logger.info("################请求方式为 : " + WebMethod);
        logger.info("################IP地址为 : " + ipdress);
        logger.info("################传递的参数为 : " + ArgsName);
        logger.info("################调用的方法名 : " +methodname);
        logger.info("################完整类名为 : " + ClassName + "." + methodname);
        logger.info("################操作时间 : "+opertime );
        logger.info("################操作类型 : "+operateType);
        Object result =null;
        try {
            //代理方法执行
            result= pjp.proceed();
//            logSys.setRemark("操作成功");
//            sysLogMapper.insertSelective(logSys);
            logger.info("################备注 : "+"操作成功");
        } catch (Throwable throwable) {
//            logSys.setRemark("操作失败");
//            sysLogMapper.insertSelective(logSys);
            logger.info("################备注 : "+"操作失败"+throwable.getMessage().toString());
        }
        return result;
    }

}
