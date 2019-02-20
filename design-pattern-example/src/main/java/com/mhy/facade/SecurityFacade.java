package com.mhy.facade;

import com.mhy.facade.service.CameraService;
import com.mhy.facade.service.LightService;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName SecurityFacade
 * @Description 安保系统对外门面
 * @Author mahaiyuan
 * @Date 2019-02-20 21:55:00
 * @Versioin 1.0
 */
@Slf4j
public class SecurityFacade {

    private CameraService cameraService = new CameraService();
    private LightService lightService = new LightService();

    public void activate() {
        cameraService.turnOn();
        lightService.turnOn();
    }

    public void deactivate() {
        cameraService.turnOff();
        lightService.turnOff();
    }

}
