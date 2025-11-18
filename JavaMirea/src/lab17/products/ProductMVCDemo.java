package lab17.products;

import javax.swing.*;
import java.awt.*;

public class ProductMVCDemo {
    static void main() {
        Product product = new Product();
        ProductView view = new ProductView();
        ProductController controller = new ProductController(product, view);

        var frame = new JFrame("Система поиска продуктов в БД");
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        var productFinderLabel = new JLabel("Выберете продукт из базы данных ДИКСОНА (ДИКСИ)");
        productFinderLabel.setSize(800, 100);
        productFinderLabel.setFont(new Font("MS Sans Serif", java.awt.Font.PLAIN, 24));
        productFinderLabel.setForeground(Color.ORANGE);
        productFinderLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(productFinderLabel);

        // На пк
        var appleIcon = new ImageIcon("src/lab17/products/Яблоко.png");
        var bananaIcon = new ImageIcon("src/lab17/products/Банан.jpg");

        // На ноутбуке
        appleIcon = new ImageIcon("JavaMirea/src/lab17/products/Яблоко.png");
        bananaIcon = new ImageIcon("JavaMirea/src/lab17/products/Банан.jpg");

        final var finalApple = appleIcon;
        final var finalBanana = bananaIcon;

        var appleButton = new JButton();
        appleButton.setIcon(appleIcon);
        appleButton.setSize(150, 150);
        appleButton.setLocation(100, 200);
        frame.getContentPane().add(appleButton);

        var bananaButton = new JButton();
        bananaButton.setIcon(bananaIcon);
        bananaButton.setSize(150, 150);
        bananaButton.setLocation(550, 200);
        frame.getContentPane().add(bananaButton);

        appleButton.addActionListener(e -> {
            product.setName("Яблоко");
            product.setPrice(50);
            controller.updateView(frame, finalApple);
        });

        bananaButton.addActionListener(e -> {
            product.setName("Банан");
            product.setPrice(100);
            controller.updateView(frame, finalBanana);
        });

        frame.setVisible(true);
    }
}
