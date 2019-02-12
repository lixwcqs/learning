package com.cqs.learning.proxy;

import com.oracle.deploy.update.UpdateCheckListener;

/**
 * 接口实现类
 * @author lixiaowen
 * @date 2019/2/11
 */
public class UpdateCheckListenerImpl implements UpdateCheckListener {

    @Override
    public void updateCheckStateChanged(int i) {
        System.out.println("original i = " +  i);
    }
}
