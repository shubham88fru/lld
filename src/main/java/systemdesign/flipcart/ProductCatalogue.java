package systemdesign.flipcart;

import java.util.List;
import java.util.Map;

public class ProductCatalogue implements ISearchable {
    private Map<String, List<Product>> categoryProductMap;
    private List<Product> products;
    private List<Category> categories;

    @Override
    public List<Product> searchCategoryProduct(String categoryName) {
        return categoryProductMap.get(categoryName);
    }
}
