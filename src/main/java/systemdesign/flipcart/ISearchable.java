package systemdesign.flipcart;

import java.util.List;

public interface ISearchable {
    List<Product>
        searchCategoryProduct(String categoryName);
}
