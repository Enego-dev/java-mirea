package lab16;

import javax.swing.*;
import java.awt.*;

public class TextMenuBar extends JMenuBar {
    private final JMenuBar menuBar;
    private final JMenu fontMenu;
    private final JMenu colorMenu;

    public TextMenuBar(StylizedTextArea stylizedTextArea){
        menuBar = new JMenuBar();
        var textMenu = new JMenu("Text");
        fontMenu = new JMenu("Font");
        colorMenu = new JMenu("Color");

        var timesNewRoman = new JMenuItem("Times New Roman");
        timesNewRoman.addActionListener(e -> stylizedTextArea.setFont(StylizedTextArea.Font.TimesNewRoman));

        var msSansSerif = new JMenuItem("MS Sans Serif");
        msSansSerif.addActionListener(e -> stylizedTextArea.setFont(StylizedTextArea.Font.MSSansSerif));

        var courierNew = new JMenuItem("Courier New");
        courierNew.addActionListener(e -> stylizedTextArea.setFont(StylizedTextArea.Font.CourierNew));

        fontMenu.add(timesNewRoman);
        fontMenu.add(msSansSerif);
        fontMenu.add(courierNew);

        var red = new JMenuItem("Red");
        red.addActionListener(e -> stylizedTextArea.setColor(Color.RED));

        var blue = new JMenuItem("Blue");
        blue.addActionListener(e -> stylizedTextArea.setColor(Color.BLUE));

        var green = new JMenuItem("Green");
        green.addActionListener(e -> stylizedTextArea.setColor(Color.GREEN));

        var black = new JMenuItem("Black");
        black.addActionListener(e -> stylizedTextArea.setColor(Color.BLACK));

        var white = new JMenuItem("White");
        white.addActionListener(e -> stylizedTextArea.setColor(Color.WHITE));

        colorMenu.add(red);
        colorMenu.add(blue);
        colorMenu.add(green);
        colorMenu.add(black);
        colorMenu.add(white);

        textMenu.add(fontMenu);
        textMenu.add(colorMenu);
        menuBar.add(textMenu);
    }

    public JMenuBar getMenuBar(){
        return menuBar;
    }

    public JMenu getFontMenu(){
        return fontMenu;
    }

    public JMenu getColorMenu(){
        return colorMenu;
    }
}
