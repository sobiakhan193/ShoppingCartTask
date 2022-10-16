import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> productsInCart = new ArrayList<>();
    public void addProduct(Product product){
        this.productsInCart.add(product);
    }

    public int totalNumberOfItems(){
        return productsInCart.size();
    }
}
