package com.bit.service.impl;

import com.bit.service.SomeService;
import com.bit.util.ServiceTools;

import java.util.Date;

//service类的代码不修改，也能增加输出时间，事务。
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行业务方法doSome");

        //方法最后提交一个事务
        //System.out.println("提交事务");
    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法doOther");

    }
}
