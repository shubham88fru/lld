package systemdesign.inventorymanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {
    List<ProductCategory> productCategoryList;
    Inventory() {
        productCategoryList = new ArrayList<>();
    }

    public void addCategory(int categoryId, String name, int price) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.price = price;
        productCategory.categoryName = name;
        productCategory.productCategoryId = categoryId;
        productCategoryList.add(productCategory);
    }

    public void addProduct(Product product, int productCategoryId) {
        ProductCategory categoryObject = null;
        for (ProductCategory productCategory : productCategoryList) {
            if (productCategory.productCategoryId == productCategoryId) {
                categoryObject = productCategory;
            }
        }

        if (categoryObject == null) {
            categoryObject.addProduct(product);
        }
    }

    public  void removeItems(Map<Integer, Integer> productCategoryAndCountMap) {

    }
}
