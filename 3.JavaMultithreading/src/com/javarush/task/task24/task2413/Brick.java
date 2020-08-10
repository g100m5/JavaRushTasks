package com.javarush.task.task24.task2413;

public class Brick extends BaseObject{

    public Brick(double x, double y) {
        super(x, y, 3);
    }

    @Override
    void move() {

    }

    @Override
    void draw(Canvas canvas) {

    }

    public Brick(double x, double y, double radius) {
        super(x, y, radius);
    }
}
