package lab12;

import javax.swing.*;
import java.awt.*;
// сделать милан и добавить мячик при наэатии
public class ShapesWindow {
    static void main() {
        var frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        var shapes = new ShapePanel();
        frame.add(shapes);

        frame.setVisible(true);
    }
}
