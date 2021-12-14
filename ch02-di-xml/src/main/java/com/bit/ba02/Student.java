package com.bit.ba02;

public class Student {

    private String name;
    private int age;

    //声明一个引用类型
    private School school;

    public void setSchool(School school) {
        System.out.println("setschool:"+school);
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
