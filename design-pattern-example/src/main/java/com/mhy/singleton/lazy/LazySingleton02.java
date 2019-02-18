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
public class LazySingleton02 {
    private static LazySingleton02 INSTANCE = null;

    private LazySingleton02() {
        System.out.println("LazySingleton01 init ......");
    }

    // 同步方法，解决线程不安全的问题，但带来了更严重的问题，该方法不支持并发访问了
    public static synchronized LazySingleton02 getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new LazySingleton02();
        }
        return INSTANCE;
    }

    public void doSomething() {
        log.info("LazySingleton01.doSomething ......");
    }
}
