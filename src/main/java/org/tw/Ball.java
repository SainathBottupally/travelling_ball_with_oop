package org.tw;

public class Ball {
    private final int diameter = 20, speed;
    int positionX, positionY;

    Ball(int positionX, int positionY, int speed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }

    public void moveBall(){
        this.positionX += speed;
    }

    public void drawBall(MainDriver mainDriver) {
        mainDriver.ellipse(positionX, positionY, diameter, diameter);
    }
}
