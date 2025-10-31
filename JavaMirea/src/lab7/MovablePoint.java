package lab7;

public class MovablePoint implements Movable {
    private double x;
    private double y;
    private double speed;

    public MovablePoint(double x, double y, double speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public boolean compareSpeed(MovablePoint point){
        return speed == point.getSpeed();
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public double getSpeed(){
        return speed;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    @Override
    public void moveUp(double step) {
        if (step <= 0)
            return;

        y += step;
    }

    @Override
    public void moveDown(double step) {
        if (step <= 0)
            return;

        y -= step;
    }

    @Override
    public void moveRight(double step) {
        if (step <= 0)
            return;

        x += step;
    }

    @Override
    public void moveLeft(double step) {
        if (step <= 0)
            return;

        x -= step;
    }
}
