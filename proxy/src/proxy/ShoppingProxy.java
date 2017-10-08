package proxy;

public class ShoppingProxy implements Buy{

    private Shopping shopping;
    private int numberOfItemsPerDay;

    public ShoppingProxy() {
        this.shopping = new Shopping();
        refreshNumberOfItemsPerDay();
    }

    public void refreshNumberOfItemsPerDay(){
        numberOfItemsPerDay = 2;
    }

    @Override
    public void buy(Item item) {
        if(numberOfItemsPerDay > 0){
            shopping.buy(item);
            numberOfItemsPerDay--;
        }
    }
}
