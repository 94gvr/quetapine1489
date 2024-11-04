package com.victor.spring.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods(){}
    @Pointcut("execution(void goNextCourse())")
    public void nextCourseMethods(){}
    @Pointcut("execution(Integer getCourse())")
    public void getCourseMethods(){}
}
