package com.cqs.learning.proxy;

import com.oracle.deploy.update.UpdateCheckListener;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk 动态代理实现{@link UpdateCheckListener}
 * @author lixiaowen
 * @date 2019/2/11
 */
public class UpdateCheckListenerJdkProxy implements InvocationHandler {

    private UpdateCheckListener source;

    public UpdateCheckListenerJdkProxy(UpdateCheckListener source) {
        this.source = source;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK实现代理..." + method);
        return method.invoke(source, args);
    }
}
