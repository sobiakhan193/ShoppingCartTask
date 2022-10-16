import org.junit.Test;

public class ShoppingCartTest {
    ShoppingCart cart = new ShoppingCart();

    @Test
    public void addanitem(){
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("SR01","Strawberry", 5 ));

        int totalItemCount = cart.totalNumberOfItems();

        assertThat(totalItemCount).isEqualTo(1);
    }

    @Test
    public void removeAnItem(){
        //cart.add
    }
}
