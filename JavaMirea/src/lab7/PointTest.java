package lab7;

import javax.swing.*;
import java.awt.*;

public class PointTest {
    static MovableRectangle movableRectangle;

    static void main() {
        var frame = new JFrame("Movable Rectangle");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLayout(null);

        var rectangle = getJPanel();
        frame.getContentPane().add(rectangle);

        frame.setVisible(true);

        var moveRectangleThread = new Thread(() -> {
            int speed = 1000 / (int) movableRectangle.getSpeed();

            while (true){
                movableRectangle.moveRight(100);
                movableRectangle.moveDown(50);
                rectangle.setLocation(movableRectangle.getLocationX(), movableRectangle.getLocationY());
                frame.repaint();

                try {
                    Thread.sleep(speed);
                } catch (InterruptedException e) {
                    IO.println(1);
                }

                // Шаг 2: Вправо и вверх
                movableRectangle.moveRight(100);
                movableRectangle.moveUp(50);
                rectangle.setLocation(movableRectangle.getLocationX(), movableRectangle.getLocationY());
                frame.repaint();

                try {
                    Thread.sleep(speed);
                } catch (InterruptedException e) {
                    IO.println(1);
                }

                // Шаг 3: Влево и вверх
                movableRectangle.moveLeft(100);
                movableRectangle.moveUp(50);
                rectangle.setLocation(movableRectangle.getLocationX(), movableRectangle.getLocationY());
                frame.repaint();

                try {
                    Thread.sleep(speed);
                } catch (InterruptedException e) {
                    IO.println(1);
                }

                // Шаг 4: Влево и вниз - возврат в стартовую позицию
                movableRectangle.moveLeft(100);
                movableRectangle.moveDown(50);
                rectangle.setLocation(movableRectangle.getLocationX(), movableRectangle.getLocationY());
                frame.repaint();

                try {
                    Thread.sleep(speed);
                } catch (InterruptedException e) {
                    IO.println(1);
                }
            }
        });
        moveRectangleThread.start();
    }

    private static JPanel getJPanel() {
        movableRectangle = new MovableRectangle(new MovablePoint(200, 200, 5),
                new MovablePoint(100, 100, 5));


        var rectangle = new JPanel();
        rectangle.setSize((int) Math.abs(movableRectangle.getTopLeft().getX() - movableRectangle.getBottomRight().getX()),
                (int) (Math.abs(movableRectangle.getTopLeft().getY()) - movableRectangle.getBottomRight().getY()));
        rectangle.setLocation(300, 300);
        rectangle.setBackground(Color.RED);
        return rectangle;
    }
}
