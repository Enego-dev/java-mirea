package lab12;

import java.awt.*;

public class Circle extends Shape{
    public Circle(int x, int y, int size, Color color) {
        super(x, y, size, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int diameter = 30 * size;
        g.drawOval(x, y, diameter, diameter);
    }
}
