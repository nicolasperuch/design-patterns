package proxy;

public class Shopping implements Buy {
    @Override
    public void buy(Item item) {
        System.out.println("Buying a " + item.getName());
    }
}
