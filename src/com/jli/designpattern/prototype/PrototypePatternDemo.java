package com.jli.designpattern.prototype;

//Step3:PrototypePatternDemo 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆。
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape)ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape cloneShape2 = (Shape)ShapeCache.getShape("2");
        System.out.println("Shape : "+ cloneShape2.getType());

        Shape cloneShape3 = (Shape)ShapeCache.getShape("3");
        System.out.println("Shape : "+ cloneShape3.getType());
    }
}
