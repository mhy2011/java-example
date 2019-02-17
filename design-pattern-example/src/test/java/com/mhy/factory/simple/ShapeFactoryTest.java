package com.mhy.factory.simple;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description 工厂方法测试
 * @Author mahaiyuan
 * @Date 2019-02-17 23:53:41
 * @Version 1.0
 * @Param null
 * @Return
 */
public class ShapeFactoryTest {

    @Test
    public void getShape() {
        Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
        assertNotNull(shape);
        shape.draw();
        shape = ShapeFactory.getShape(ShapeType.RECTANGLE);
        assertNotNull(shape);
        shape.draw();
    }
}