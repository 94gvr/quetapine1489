package com.victor.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Student student = context.getBean("studentBean", Student.class);
        int course = student.getCourse();
        System.out.println("Course has been got: " + course);
        context.close();
    }
}
