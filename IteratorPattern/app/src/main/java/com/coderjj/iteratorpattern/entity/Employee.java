package com.coderjj.iteratorpattern.entity;

/**
 * Created by Administrator on 2019/4/15.
 */

public class Employee {
    private String name;
    private int age;
    private String position;

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name: " + name +
                ",age: " + age +
                ",position: " + position;
    }
}
