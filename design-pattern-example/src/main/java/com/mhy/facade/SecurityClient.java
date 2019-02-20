package com.mhy.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName SecurityClient
 * @Description
 * @Author mahaiyuan
 * @Date 2019-02-20 21:54:00
 * @Versioin 1.0
 */
@Slf4j
public class SecurityClient {
    public static void main(String[] args) {
        SecurityFacade facade = new SecurityFacade();
        facade.activate();

        log.info("security system is turn on ......");

        facade.deactivate();
        log.info("security system is turn off ......");
    }
}
