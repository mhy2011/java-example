package com.mhy.factory.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Rectangle
 * @Description
 * @Author mahaiyuan
 * @Date 2019-02-17 23:40:00
 * @Versioin 1.0
 */
@Slf4j
public class Rectangle implements Shape {
    @Override
    public void draw() {
        log.info("Rectangle.draw ......");
    }
}
