package lab16;

import javax.swing.*;
import java.awt.*;

public class StylizedTextArea extends JTextArea {
    private final JTextArea textArea;
    private final java.awt.Font[] fonts;
    private java.awt.Font currentFont;

    public StylizedTextArea(){
        fonts = new java.awt.Font[] {
                new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 18),
                new java.awt.Font("MS Sans Serif", java.awt.Font.PLAIN, 18),
                new java.awt.Font("Courier New", java.awt.Font.PLAIN, 18)
        };

        textArea = new JTextArea();
        textArea.setSize(785, 550);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        currentFont = fonts[1];
        textArea.setFont(currentFont);
    }

    public JTextArea getTextArea(){
        return textArea;
    }

    public void setFont(Font font){
        var newFont = fonts[font.getNumber()];
        textArea.setFont(newFont);
        currentFont = newFont;
    }

    public void setColor(Color color){
        textArea.setForeground(color);
    }



    public enum Font{
        TimesNewRoman(0),
        MSSansSerif(1),
        CourierNew(2);

        private final int number;

        Font(int number){
            this.number = number;
        }

        public int getNumber(){
            return number;
        }
    }
}
