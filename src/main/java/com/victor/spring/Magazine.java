package com.victor.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("magazineBean")
public class Magazine {
    @Value("Shonen Jump")
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
}
