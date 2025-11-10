package lab12;

import java.awt.*;

public class Triangle extends Shape{
    public Triangle(int x, int y, int size, Color color) {
        super(x, y, size, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int base = 40 * size;
        int height = 35 * size;

        int[] xPoints = {x, x + base/2, x + base};
        int[] yPoints = {y + height, y, y + height};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
