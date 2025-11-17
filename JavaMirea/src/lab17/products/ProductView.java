package lab17.products;

import javax.swing.*;

public class ProductView {
    public void displayProductDetails(String productName, int productPrice, JFrame frame, ImageIcon icon){
        IO.println("Продукт: " + productName);
        IO.println("Цена продукта: " + productPrice + " руб.");

        JOptionPane.showMessageDialog(frame,
                "Цена самого крутейшего продукта: " + productPrice + " деревянных",
                "Йоу мужик а я смотрю ты выбрал " + productName,
                JOptionPane.INFORMATION_MESSAGE,  icon);
    }
}
