package com.mhy.singleton.lazy;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName LazySingleton04
 * @Description
 * @Author mahaiyuan
 * @Date 2019-02-18 23:02:00
 * @Versioin 1.0
 */
@Slf4j
public class LazySingleton04 {

    private static class SingletonInstance {
        private static final LazySingleton04 INSTANCE = new LazySingleton04();
    }

    private LazySingleton04() {
        System.out.println("LazySingleton04 init ......");
    }

    public static LazySingleton04 getInstance() {
        return SingletonInstance.INSTANCE;
    }

    public void doSomething() {
        log.info("LazySingleton04.doSomething ......");
    }
}
