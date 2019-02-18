package com.mhy.singleton.hungry;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName HungrySingleton01
 * @Description
 * @Author mahaiyuan
 * @Date 2019-02-18 22:37:00
 * @Versioin 1.0
 */
@Slf4j
public class HungrySingleton01 {

    private static HungrySingleton01 INSTANCE = new HungrySingleton01();

    /**
     * @Description 私有化构造方法
     * @Author mahaiyuan
     * @Date 2019-02-18 22:38:14
     * @Version 1.0
     * @Param
     * @Return
     */
    private HungrySingleton01() {

    }

    public static HungrySingleton01 getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        log.info("HungrySingleton01.doSomething ......");
    }

}
