package com.mhy.singleton.lazy;

import org.junit.Test;

public class LazySingleton02Test {

    @Test
    public void getInstance() throws Exception {

        final int threadNum = 10;
        for (int i = 0; i < threadNum; i++) {
            new Thread() {
                @Override
                public void run() {
                    LazySingleton02 instance = LazySingleton02.getInstance();
                    System.out.println("线程:" + Thread.currentThread().getName() + ", 获取到实例为: " + instance);
                }
            }.start();
        }
        Thread.sleep(1000);
    }
}