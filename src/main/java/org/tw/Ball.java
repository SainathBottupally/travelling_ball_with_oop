package org.tw;

public class Ball {
    private final int diameter = 20, speed;
    int positionX, positionY;

    Ball(int positionX, int positionY, int speed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }

    int getDiameter() {
        return diameter;
    }
    void moveBall(){
        this.positionX += speed;
    }
}
