package com.mhy.singleton.lazy;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName LazySingleton01
 * @Description
 * @Author mahaiyuan
 * @Date 2019-02-18 23:02:00
 * @Versioin 1.0
 */
@Slf4j
public class LazySingleton03 {
    private static LazySingleton03 INSTANCE = null;

    private LazySingleton03() {
        System.out.println("LazySingleton01 init ......");
    }

    public static LazySingleton03 getInstance() {
        //同步代码块，双重检测
        if (null == INSTANCE) {
            synchronized (LazySingleton03.class) {
                if (null == INSTANCE) {
                    INSTANCE = new LazySingleton03();
                }
            }
        }
        return INSTANCE;
    }

    public void doSomething() {
        log.info("LazySingleton01.doSomething ......");
    }
}
