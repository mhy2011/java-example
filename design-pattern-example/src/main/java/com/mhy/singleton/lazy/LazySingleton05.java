package com.mhy.singleton.lazy;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName LazySingleton05
 * @Description
 * @Author mahaiyuan
 * @Date 2019-02-18 23:02:00
 * @Versioin 1.0
 */
@Slf4j
public enum  LazySingleton05 {
    INSTANCE;

    public void doSomething() {
        log.info("LazySingleton05.doSomething ......");
    }
}
