package lab7;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;
    private double speed;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        speed = Math.min(topLeft.getSpeed(), bottomRight.getSpeed());
    }

    public MovablePoint getTopLeft(){
        return topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public double getSpeed(){
        return speed;
    }

    /*public int getLocationY(){
        return (int) (topLeft.getY() - bottomRight.getY()) / 2;
    }

    public int getLocationX(){
        return (int) (topLeft.getX() - bottomRight.getX()) / 2;
    }*/

    public int getLocationX(){
        return (int) Math.min(topLeft.getX(), bottomRight.getX());
    }

    public int getLocationY(){
        return (int) Math.min(topLeft.getY(), bottomRight.getY());
    }

    @Override
    public void moveUp(double step) {
        if (step <= 0)
            return;

        topLeft.moveUp(step);
        bottomRight.moveUp(step);
    }

    @Override
    public void moveDown(double step) {
        topLeft.moveDown(step);
        bottomRight.moveDown(step);
    }

    @Override
    public void moveRight(double step) {
        topLeft.moveRight(step);
        bottomRight.moveRight(step);
    }

    @Override
    public void moveLeft(double step) {
        if (step <= 0)
            return;

        topLeft.moveLeft(step);
        bottomRight.moveLeft(step);
    }
}
