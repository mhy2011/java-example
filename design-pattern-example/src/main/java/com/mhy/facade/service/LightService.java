package com.mhy.facade.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName LightService
 * @Description
 * @Author mahaiyuan
 * @Date 2019-02-20 21:57:00
 * @Versioin 1.0
 */
@Slf4j
public class LightService {

    public void turnOn() {
        log.info("LightService.turnOn ......");
    }

    public void turnOff() {
        log.info("LightService.turnOff ......");
    }

}
