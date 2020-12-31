import processing.core.PApplet;

public class MainDriver extends PApplet {

    Ball ball1, ball2, ball3, ball4;
    Screen screen;

    @Override
    public void settings() {
        super.settings();
        screen = new Screen();
        size(screen.getWIDTH(), screen.getHEIGHT());
    }

    @Override
    public void setup() {
        super.setup();
        ball1 = new Ball(0, getBallYPosition(1), 1);
        ball2 = new Ball(0, getBallYPosition(2), 2);
        ball3 = new Ball(0, getBallYPosition(3), 3);
        ball4 = new Ball(0, getBallYPosition(4), 4);

    }

    private void drawBall(Ball ball){
        ellipse(ball.getPositionX(), ball.getPositionY(), ball.getDiameter(), ball.getDiameter());
    }

    private int getBallYPosition(int ball_serial_number){
        return (int) (screen.getHEIGHT() * ((double)ball_serial_number/(double)5));
    }

    @Override
    public void draw() {
        ball1.moveBall();
        ball2.moveBall();
        ball3.moveBall();
        ball4.moveBall();
        drawBall(ball1);
        drawBall(ball2);
        drawBall(ball3);
        drawBall(ball4);
    }

    public static void main(String[] args){
        PApplet.main("MainDriver", args);
    }
}
