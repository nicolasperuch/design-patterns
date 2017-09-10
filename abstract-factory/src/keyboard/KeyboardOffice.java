package keyboard;

public class KeyboardOffice implements KeyboardFactory{

    @Override
    public Keyboard createKeyboard() {
        return new Keyboard("Office");
    }
}
