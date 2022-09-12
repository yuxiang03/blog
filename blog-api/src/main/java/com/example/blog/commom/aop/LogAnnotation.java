package com.example.blog.commom.aop;

import java.lang.annotation.*;

//Type 代表可以放在类上面Method 代表可以放在方法上
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String module() default "";
    String operator() default "";
}
