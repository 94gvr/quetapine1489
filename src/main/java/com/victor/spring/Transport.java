package com.victor.spring;

public class Transport {
    String model;
    int power;

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
