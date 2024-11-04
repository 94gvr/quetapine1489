package com.victor.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("studentBean")
@Scope("prototype")
public class Student {
    @Value("John Doe")
    private String name;
    @Value("2")
    private Integer course;

    public String getName() {
        return name;
    }

    public Integer getCourse() {
        String str = null;
        str.length();
        System.out.println("Getting course");
        return course;
    }
    public void goNextCourse(){
        ++course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
