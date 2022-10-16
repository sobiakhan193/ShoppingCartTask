import java.util.*;

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
        boolean deleteCartItem = false;
        for (CartItem cartItem : productsInCart){
            if(Objects.equals(cartItem.getProductCode(),cItem.getProductCode())){
                if(Objects.equals(cItem.getQuantity(),cartItem.getQuantity())){
                    deleteCartItem = true;
                }
                else
                {
                    cartItem.reduceQtyBy(cItem.getQuantity());
                }
            }
        }
        if(deleteCartItem){
            this.productsInCart.remove(cItem);
        }

    }

    public int totalNumberOfItems(){
        int totalItems = 0;
        for(CartItem cItem : productsInCart){
            totalItems += cItem.getQuantity();
        }
        return productsInCart.size();
    }

    public List<CartItem> cartItems(){
        return Collections.unmodifiableList(this.productsInCart);
    }
}
