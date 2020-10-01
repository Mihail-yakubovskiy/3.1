package com.company;

public class Circle {
    float radius = 1;
    final float Pi = 3.1415926f;

    Circle(float radius){
        this.radius = radius;
    }

    public float getRadius(){
        return radius;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }

    public float getDiameter(){
        return radius*2;
    }

    public float getArea(){
        return radius*radius*Pi;
    }

    public float getLong(){
        return radius*2*Pi;
    }

    public String toString(){
        return "Radius = " + getRadius() + "\nDiameter = " + getDiameter() + "\nArea = " + getArea() + "\nLong = " +getLong();
    }
}
