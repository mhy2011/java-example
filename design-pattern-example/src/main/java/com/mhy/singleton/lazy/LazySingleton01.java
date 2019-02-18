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
public class LazySingleton01 {
    private static LazySingleton01 INSTANCE = null;

    private LazySingleton01() {
        //如果构造方法里什么也不做有可能不会碰到线程不安全的问题
        //如果构造方法里做一些事情，比较加载资源，哪怕是打印一行内容，就会很明显的出线线程不安全的情况
        System.out.println("LazySingleton01 init ......");
    }

    public static LazySingleton01 getInstance() {
        if (null == INSTANCE) {
            //线程不安全，多线程情况下会出现非单例情况，违背单例模式宗旨
            INSTANCE = new LazySingleton01();
        }
        return INSTANCE;
    }

    public void doSomething() {
        log.info("LazySingleton01.doSomething ......");
    }
}
