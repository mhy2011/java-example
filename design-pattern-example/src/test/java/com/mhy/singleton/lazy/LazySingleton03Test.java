package com.mhy.singleton.lazy;

import org.junit.Test;

public class LazySingleton03Test {

    @Test
    public void getInstance() throws Exception {

        final int threadNum = 10;
        for (int i = 0; i < threadNum; i++) {
            new Thread() {
                @Override
                public void run() {
                    LazySingleton03 instance = LazySingleton03.getInstance();
                    System.out.println("线程:" + Thread.currentThread().getName() + ", 获取到实例为: " + instance);
                }
            }.start();
        }
        Thread.sleep(1000);
    }
}