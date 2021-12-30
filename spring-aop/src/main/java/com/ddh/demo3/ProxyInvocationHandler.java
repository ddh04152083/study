package com.ddh.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.log(method.getName());
        return method.invoke(target, args);
    }

    private void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}
