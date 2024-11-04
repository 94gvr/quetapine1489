package com.victor.spring.aspects;

import com.victor.spring.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.victor.spring.aspects.Pointcuts;

@Component
@Aspect
@Order(33)
public class LoggingAspect {
    @Around("Pointcuts.getCourseMethods()")
    public Integer aroundReturningGetCourseAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturningGetCourseAdvice: course is getting get.");
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e){
            System.out.println("Exception caughted in aroundReturningGetCourseAdvice" +
                    " during proceedingJoinPoint.proceed() method: " + e);
            targetMethodResult = 0;
        }
        System.out.println("aroundReturningGetCourseAdvice: course is successfully got.");
        return (Integer) targetMethodResult;
    }
}
