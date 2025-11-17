package lab17.products;

import javax.swing.*;

public class ProductController {
    private final Product model;
    private final ProductView view;

    public ProductController(Product product, ProductView productView){
        model = product;
        view = productView;
    }

    public String getProductName() {
        return model.getName();
    }

    public void setProductName(String productName) {
        model.setName(productName);
    }

    public int getProductPrice() {
        return model.getPrice();
    }

    public void setProductPrice(int price) {
        model.setPrice(price);
    }

    public void updateView(JFrame frame, ImageIcon icon){
        view.displayProductDetails(getProductName(), getProductPrice(), frame, icon);
    }
}
