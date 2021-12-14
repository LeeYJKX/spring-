package com.bit;

import com.bit.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {

    @Test
    public void test01(){
        String config="ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获得student对象
        Student myStudent = (Student) ac.getBean("myStudent2");
        System.out.println(myStudent);

        File myFile = (File) ac.getBean("myfile");
        System.out.println("myFile=="+myFile.getName());

    }
}
