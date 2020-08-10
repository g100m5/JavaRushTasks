package com.javarush.task.task24.task2413;

public class Stand extends BaseObject {
    private double speed;
    private double direction;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    @Override
    void move() {

        x += speed * direction;

    }

    void moveLeft() {

        direction = -1;
    }

    void moveRight() {

        direction = 1;

    }

    @Override
    void draw(Canvas canvas) {

    }

    public Stand(double x, double y, double radius) {
        super(x, y, radius);
    }

    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }


}
