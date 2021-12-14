package com.bit.util;

import java.util.Date;

public class ServiceTools {

    public static void doLog(){
        System.out.println("非业务方法的执行时间:"+new Date());
    }

    public static void doTrans(){
        //方法最后提交一个事务
        System.out.println("非业务方法执行完毕后,提交事务");
    }
}
