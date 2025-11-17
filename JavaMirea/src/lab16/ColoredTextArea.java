package lab16;

import javax.swing.*;

public class ColoredTextArea {
    static void main() {
        var frame = new JFrame("Colored TextArea");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLayout(null);

        var stylizedTextArea = new StylizedTextArea();
        var textArea = stylizedTextArea.getTextArea();
        frame.getContentPane().add(textArea);

        var textBar = new TextMenuBar(stylizedTextArea);
        frame.setJMenuBar(textBar.getMenuBar());

        frame.setVisible(true);
    }
}
