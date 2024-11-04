package com.victor.spring.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.victor.spring.aspects.Pointcuts;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @AfterThrowing(pointcut = "Pointcuts.getCourseMethods()"
    , throwing = "exception")
    public void afterThrowingGetCourseAdvice(Throwable exception){
        System.out.println("afterThrowingGetCourseAdvice: logging exception throw " + exception);
    }
}
