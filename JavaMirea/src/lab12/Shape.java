package lab12;

import java.awt.*;

public abstract class Shape {
    protected int x;
    protected int y;
    protected int size;
    protected Color color;

    public Shape(int x, int y, int size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public abstract void draw(Graphics g);
}
