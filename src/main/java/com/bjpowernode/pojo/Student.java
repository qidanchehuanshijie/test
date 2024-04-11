package com.bjpowernode.pojo;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("学生的无参的构造方法。。。。。。");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
