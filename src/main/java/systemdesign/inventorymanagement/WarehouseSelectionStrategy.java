package systemdesign.inventorymanagement;

import java.util.List;

public abstract class WarehouseSelectionStrategy {
    public abstract Warehouse selectWarehouse(List<Warehouse> warehouseList);
}
