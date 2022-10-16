import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    private Map<String, Product> products = new HashMap<>();

    public void add(Product prod){
        this.products.put(prod.getProductCode(), prod);
    }

    public Product get(String productCode){
        return products.get(productCode);
    }
}
