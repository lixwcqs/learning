package com.cqs.learning.proxy;

import com.oracle.deploy.update.UpdateCheckListener;

import java.lang.reflect.Proxy;

/**
 * @author lixiaowen
 * @date 2019/2/11
 */
public class ProxyClient {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //代理类写入文件
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        UpdateCheckListenerJdkProxy jdkProxy = new UpdateCheckListenerJdkProxy(UpdateCheckListenerImpl.class.newInstance());
        UpdateCheckListener proxy = (UpdateCheckListener) Proxy.newProxyInstance(UpdateCheckListener.class.getClassLoader(),
                new Class[]{UpdateCheckListener.class},
                jdkProxy);
        proxy.updateCheckStateChanged(666);
    }
}
