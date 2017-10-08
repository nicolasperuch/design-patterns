import proxy.Item;
import proxy.ShoppingProxy;

public class Runner {

    public static void main(String[] args) {

        Item tv = new Item("television 32\"");
        Item couch = new Item("black couch");
        Item coke = new Item("Ice coke");

        ShoppingProxy shoppingProxy = new ShoppingProxy();

        shoppingProxy.buy(tv);
        shoppingProxy.buy(couch);
        shoppingProxy.buy(coke);
    }
}
