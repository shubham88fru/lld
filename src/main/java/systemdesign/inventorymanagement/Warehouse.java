package systemdesign.inventorymanagement;


import java.util.Map;

public class Warehouse {
    Inventory inventory;
    Address address;

    public void removeItemFromInventory(Map<Integer, Integer> productCategoryAndCountMap) {
        inventory.removeItems(productCategoryAndCountMap);
    }

    public void addItemToInventory(Map<Integer, Integer> productCategoryAndCountMap) {
        //
    }
}
