import java.util.Objects;

public class CartItem {
    private String productCode;
    private int qty;

    public CartItem(String itemId, int qty){
        this.productCode = itemId;
        this.qty = qty;
    }

    public String getProductCode(){
        return productCode;
    }

    public int getQuantity(){
        return qty;
    }

    //auto generated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return qty == cartItem.qty && Objects.equals(productCode, cartItem.productCode);
    }

    //auto generated
    @Override
    public int hashCode() {
        return Objects.hash(productCode, qty);
    }

    public void reduceQtyBy(int quantity) {
        this.qty -= quantity;
    }
}
