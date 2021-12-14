package com.bit;

import com.bit.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    @Test
    public void test01(){
        String config="ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获得student对象
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);

        Date myDate = (Date) ac.getBean("mydate");
        System.out.println(myDate);
    }
}
