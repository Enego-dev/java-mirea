package lab5;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FilenameFilter;

public class GifOpener {
    static void main(String[] args) throws InterruptedException {
        secondWay();
    }

    static void firstWay(){
        // все начинается с создания экземпляра класса JFrame
        var frame = new JFrame("Image Opener");
        // устанавливаем реакцию окна на закрытие по умолчанию
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // для запрета масштабирования
        frame.setResizable(false);
        // принудительный размер окна
        frame.setSize(500, 500);

        var image = new ImageIcon("C:\\Users\\Enego\\Desktop\\Джава\\tense1983-rage.gif");
        var label = new JLabel(image);

        frame.getContentPane().add(label);

        // устанавливаем авто размер окна на основе содержимого
        frame.pack();
        // отображаем окно, иначе никак
        frame.setVisible(true);
    }

    static void secondWay(){
        // https://tenor.com/ru/view/repogame-repo-game-repo-i-love-get-in-repo-hop-on-repo-gif-18064862391749104360
        final int REFRESH_RATE = 10;
        final String PATH_TO_GIF = "C:\\Users\\Enego\\Desktop\\Джава\\Гифка";

        // открываю GIF
        var filter = new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".png");
            }
        };
        var imageList = new File(PATH_TO_GIF).listFiles(filter);

        var images = new Image[imageList.length];
        for (int i = 0; i < imageList.length; i++) {
            images[i] = new ImageIcon(imageList[i].getAbsolutePath()).getImage();
        }

        var frame = new JFrame("GifOpener");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);

        var imageIcon = new ImageIcon(images[0]);
        var label = new JLabel(imageIcon);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);

        var thread = new Thread(() -> {
            try {
                for (int i = 0; i < images.length; i++) {
                    if (i == images.length - 1)
                        i = 0;

                    imageIcon.setImage(images[i]);
                    label.repaint();

                    Thread.sleep(1000 / REFRESH_RATE);
                }
            } catch (InterruptedException e) {
                IO.println("1111");
            }
        });
        thread.start();
    }
}
