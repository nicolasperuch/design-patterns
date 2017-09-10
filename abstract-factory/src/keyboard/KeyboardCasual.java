package keyboard;

public class KeyboardCasual implements KeyboardFactory{

    @Override
    public Keyboard createKeyboard() {
        return new Keyboard("Casual");
    }
}
