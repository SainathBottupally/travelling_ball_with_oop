package org.tw;

import processing.core.PApplet;
import java.util.ArrayList;

public class MainDriver extends PApplet {

    private final int screenWidth;
    private final int screenHeight;
    private final int numberOfBalls;
    ArrayList<Ball> ballsContainer = new ArrayList<>();

    public MainDriver() {
        screenWidth = 640;
        screenHeight = 480;
        numberOfBalls = 4;
    }

    @Override
    public void settings() {
        super.settings();
        size(screenWidth, screenHeight);
    }

    @Override
    public void setup() {
        super.setup();
        for(int ballCounter = 0; ballCounter < numberOfBalls; ballCounter++){
            Ball ball = new Ball(0, getBallYPosition(ballCounter), getBallSpeed(ballCounter));
            ballsContainer.add(ball);
        }
    }

    private int getBallSpeed(int ballSerialNumber){
        return ballSerialNumber+1;
    }

    private int getBallYPosition(int ballSerialNumber){
        return (int) (screenHeight * ((double)(ballSerialNumber+1)/(double)(numberOfBalls+1)));
    }

    @Override
    public void draw() {
        for(Ball ball: ballsContainer){
            ball.moveBall();
            ellipse(ball.positionX, ball.positionY, ball.getDiameter(), ball.getDiameter());
        }
    }

    public static void main(String[] args){
        PApplet.main("org.tw.MainDriver", args);
    }
}
