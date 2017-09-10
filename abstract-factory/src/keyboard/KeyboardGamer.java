package keyboard;

public class KeyboardGamer implements KeyboardFactory{

    @Override
    public Keyboard createKeyboard() {
        return new Keyboard("Gamer");
    }
}
