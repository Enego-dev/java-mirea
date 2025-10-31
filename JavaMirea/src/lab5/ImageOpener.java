package lab5;

import javax.swing.*;

public class ImageOpener {
    static void main(String[] args) {
        // все начинается с создания экземпляра класса JFrame
        var frame = new JFrame("Image Opener");
        // устанавливаем реакцию окна на закрытие по умолчанию
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // для запрета масштабирования
        frame.setResizable(false);
        // принудительный размер окна
        frame.setSize(500, 500);

        var image = new ImageIcon("C:\\Users\\Enego\\Desktop\\photo_2025-10-25_11-10-35.jpg");
        var label = new JLabel(image);

        frame.getContentPane().add(label);

        // устанавливаем авто размер окна на основе содержимого
        frame.pack();
        // отображаем окно, иначе никак
        frame.setVisible(true);
    }
}
