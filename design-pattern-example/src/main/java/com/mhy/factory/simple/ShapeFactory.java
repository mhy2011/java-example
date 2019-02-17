package com.mhy.factory.simple;

/**
 * @ClassName ShapeFactory
 * @Description
 * @Author mahaiyuan
 * @Date 2019-02-17 23:48:00
 * @Versioin 1.0
 */
public class ShapeFactory {

    /**
     * @Description 获取形状方法
     * @Author mahaiyuan
     * @Date 2019-02-17 23:51:04
     * @Version 1.0
     * @Param shapeType
     * @Return com.mhy.factory.simple.Shape
     */
    public static Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("invalid shapeType=" + shapeType);
        }
    }

}
