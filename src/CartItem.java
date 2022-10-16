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
}
