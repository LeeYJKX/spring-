package com.bit;

import com.bit.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student Student = (Student) ctx.getBean("myStudent");
        //Student Student = (Student) ctx.getBean("student");
        System.out.println(Student);
    }
}
