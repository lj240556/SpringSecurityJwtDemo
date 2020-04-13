package com.company.project.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author  LiuJiang
 * @create  2020/3/6 18:10
 * @desc 自定义注解    使用该注解的地方进行日志记录
 **/
@Target(ElementType.METHOD) // 方法注解
@Retention(RetentionPolicy.RUNTIME) // 运行时可见
public @interface WebLog {
    String operateType();// 记录日志的操作类型
}
