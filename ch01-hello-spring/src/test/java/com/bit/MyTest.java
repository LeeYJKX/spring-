package com.bit;

import com.bit.service.SomeService;
import com.bit.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }
/*
* spring默认创建对象的时间：在创建spring的容器时，会创建配置文件中的所有对象***
*
* spring创建对象：默认调用的是无参构造方法***
*
* */


    @Test
    public void test02(){
        //1.指定spring配置文件名称
        String config="beans.xml";
        //2.创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示Spring容器，通过容器获取对象
        //ClassPathXmlApplicationContext表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象  id值获取
        SomeService service = (SomeService) ac.getBean("someService");

        service.doSome();
    }


    /*获取spring容器中java对象的信息*/
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法来定义对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象的数量:"+nums);

        //每个对象的名称
        String[] names = ac.getBeanDefinitionNames();
        for (String name:
             names) {
            System.out.println(name);
        }
    }

    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date my = (Date) ac.getBean("mydate");
        System.out.println("Date"+my);
    }
}
