package com.jli.designpattern.abstractfactory;

import com.jli.designpattern.factory.Shape;

public abstract class AbstractFactory {

    public  abstract  Color getColor(String color);
    public  abstract Shape getShape(String shape);
}
