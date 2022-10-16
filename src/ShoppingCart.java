import java.util.ArrayList;

public class ShoppingCart {
    private Inventory inventory;
    private ArrayList<CartItem> productsInCart = new ArrayList<>();

    public ShoppingCart(Inventory inventory){
        this.inventory = inventory;
    }

    public void addProduct(CartItem cItem){
        this.productsInCart.add(cItem);
    }

    public void removeProduct(CartItem cItem){
        this.productsInCart.remove(cItem);
    }

    public int totalNumberOfItems(){
        int totalItems = 0;
        for(CartItem cItem : productsInCart){
            totalItems += cItem.getQuantity();
        }
        return productsInCart.size();
    }
}
