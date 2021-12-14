package com.bit.ba03;

import org.springframework.beans.factory.annotation.Autowired;
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

    /*
    * 引用类型
    * @Autowired:spring框架中提供的注解，实现引用类型的赋值
    * spring中通过注解给引用类型赋值，使用的是自动注入原理,支持byName,byType
    *
    * @Autowired默认使用的是byType自动注入。(找同源)
    *
    * 位置:1.在属性定义的上面，无需set方法，推荐使用
    *       2.在set方法上面
    * */
    @Autowired
    private School school;


    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
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