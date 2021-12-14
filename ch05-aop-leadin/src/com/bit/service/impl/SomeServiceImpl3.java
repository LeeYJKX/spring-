package com.bit.service.impl;

import com.bit.service.SomeService;

import java.util.Date;

public class SomeServiceImpl3 implements SomeService {
    @Override
    public void doSome() {
        System.out.println("方法的执行时间:"+new Date());
        System.out.println("执行业务方法doSome");

        //方法最后提交一个事务
        System.out.println("提交事务");
    }

    @Override
    public void doOther() {
        System.out.println("方法的执行时间:"+new Date());
        System.out.println("执行业务方法doOther");

        //方法最后提交一个事务
        System.out.println("提交事务");
    }
}
