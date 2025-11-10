package lab12;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ShapePanel extends JPanel {
    ArrayList<Shape> shapes;
    private final Random random;

    public ShapePanel(){
        shapes = new ArrayList<Shape>();
        random = new Random();
        generateShapes(20);
    }

    private void generateShapes(int n){
        for (int i = 0; i < n; i++) {
            int x = random.nextInt(700);
            int y = random.nextInt(500);

            var color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            var size = random.nextInt(3)+1;
            var shapeType = random.nextInt(3);

            Shape shape;
            switch (shapeType){
                case 0:
                    shape = new Circle(x, y, size, color);
                    break;
                case 1:
                    shape = new Triangle(x, y, size, color);
                    break;
                case 2:
                    shape = new Rectangle(x, y, size, color);
                    break;
                default:
                    IO.println("Тип фигуры не определен!");
                    return;
            }

            shapes.add(shape);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes){
            shape.draw(g);
        }
    }
}
