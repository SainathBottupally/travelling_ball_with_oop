public class Ball {
    private final int diameter = 20;
    int positionX, positionY, speed;

    Ball(int positionX, int positionY, int speed){
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveBall(){
        this.positionX += speed;
    }
}
