package systemdesign.inventorymanagement;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    int productCategoryId;
    String categoryName;
    List<Product> products = new ArrayList<>();
    double price;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int count) {
        for (int i = 0; i < count; i++) {
            products.remove(products.size() - 1);
        }
    }
}
