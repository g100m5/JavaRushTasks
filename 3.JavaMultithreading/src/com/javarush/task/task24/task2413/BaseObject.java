package com.javarush.task.task24.task2413;

import static java.lang.Math.sqrt;

public abstract class BaseObject {

    protected double x;
    protected double y;
    protected double radius;

    abstract void move();

    abstract void draw(Canvas canvas);

    boolean isIntersec(BaseObject o) {

//        double maxR = this.radius;
//        if(o.radius > this.radius) {
//            maxR = o.radius;
//        }

        return
        Math.sqrt( Math.pow((this.x - o.x), 2) + Math.pow((this.y - o.y), 2) )
                <= Math.max(this.radius, o.radius);

    }

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
