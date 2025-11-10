package lab12;

import java.awt.*;

public class Rectangle extends Shape{
    public Rectangle(int xPosition, int yPosition, int size, Color color) {
        super(xPosition, yPosition, size, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int width = 40 * size;
        int height = 30 * size;
        g.fillRect(x, y, width, height);
    }
}
