package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {

    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen = true;

    public Ball(double x, double y, double speed, double direction) {

        super(x, y, 1);
        this.speed = speed;
        this.direction = direction;

    }
//
//    void setDirection(double direction){
//        this.direction = direction;
//        double angle = Math.toRadians(direction);
//        dx = Math.cos(angle) * speed;
//        dy = -Math.sin(angle) * speed;
//    }

    void checkRebound(int minx, int maxx, int miny, int maxy) {

    }


    @Override
    void move() {
        if (!isFrozen) {
            x += dx;
            y += dy;
        }
    }

    @Override
    void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'O');
    }

    void start() {
        isFrozen = false;
    }

    public Ball(double x, double y, double radius) {

        super(x, y, radius);
    }

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
        double angle = Math.toRadians(direction);
        dx = Math.cos(angle) * speed;
        dy = -Math.sin(angle) * speed;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }
}
