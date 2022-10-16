import java.lang.module.ModuleDescriptor;

public class Product {
    private final String productCode;
    private final String name;
    private final double price;
    private final ProductType ProductType;


    public Product(ProductType prodType, String productCode, String name, double price ){
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.ProductType = prodType;
    }

    /*private Product(ModuleDescriptor.Builder builder, String productCode, String name, double price, ProductType productType){
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        //come back later
        ProductType = productType;
    }*/

    //getters
    public ProductType getProductType() {
        return ProductType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }
}
