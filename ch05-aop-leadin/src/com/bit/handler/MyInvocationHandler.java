package com.bit.handler;

import com.bit.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    //目标对象，通过构造方法传进来的
    private Object target;//SomeServiceImpl类

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//通过代理对象执行方法时，会调用这个invoke（）******************************8
        //System.out.println("执行了invoke()方法");
        String methodName = method.getName();//得到正在执行方法名称
        Object res = null;

        //只给doSome()方法增加功能
        if("doSome".equals(methodName)){
            ServiceTools.doLog();//功能增强
            //执行目标类的方法，通过Method类实现
            res = method.invoke(target,args);//SomeServiceImpl.doSome()
            ServiceTools.doTrans();//功能增强
        }else{
            res = method.invoke(target,args);//SomeServiceImpl.doOther()
        }

        //目标方法执行结果
        return res;
    }
}
