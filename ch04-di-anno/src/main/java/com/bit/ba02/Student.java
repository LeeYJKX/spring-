package com.bit.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
    /*
     * 简单类型属性赋值
     * @Value:简单类型赋值
     * 属性:value是String类型的，表示简单类型的属性值的
     * 位置:1.在属性定义上面，无需set方法，推荐使用
     *   2.在set方法的上面
     * */
    //@Value(value = "张飞")
    @Value("张飞")
    private String name;
    //@Value(value = "29")
    //@Value("29")
    private Integer age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
    @Value("29")
    public void setAge(Integer age) {
        this.age = age;
    }
}
