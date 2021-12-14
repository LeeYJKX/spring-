package com.bit.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
    @Value("张飞")
    private String name;
    @Value("29")
    private Integer age;

    /*

    *
    * @Autowired默认使用的是byType自动注入。(找同源)
    *
    *   属性:required,是一个boolean类型的，默认true
    *       required=true:表示引用类型赋值失败，程序报错，并终止执行。
    *       required=false:引用类型如果赋值失败，程序正常执行，引用类型是null.

            一般用true，好调试，如果没赋值mull的话，后续可能空指针异常。
    *

    *
    * 如果使用byName方式，，需要做的是:
    * 1.在属性上面加入@Autowired
    * 2.在属性上面加入@Qualifier(value="bean的id"):表示使用指定名称的bean完成赋值
    *
    * */

    @Autowired
    @Qualifier("mySchool")
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
    public void setAge(Integer age) {
        this.age = age;
    }
}
