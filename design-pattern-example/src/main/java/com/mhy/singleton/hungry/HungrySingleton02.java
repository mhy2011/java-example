package com.mhy.singleton.hungry;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName HungrySingleton02
 * @Description 单例模式-饿汉式-静态代码块
 * @Author mahaiyuan
 * @Date 2019-02-18 22:37:00
 * @Versioin 1.0
 */
@Slf4j
public class HungrySingleton02 {

    private static HungrySingleton02 INSTANCE = null;

    // 静态代码块实例化对象
    static {
        INSTANCE = new HungrySingleton02();
    }

    /**
     * @Description 私有化构造方法
     * @Author mahaiyuan
     * @Date 2019-02-18 22:38:14
     * @Version 1.0
     * @Param
     * @Return
     */
    private HungrySingleton02() {

    }

    public static HungrySingleton02 getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        log.info("HungrySingleton02.doSomething ......");
    }

}
