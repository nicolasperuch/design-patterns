package building.computer.factory;

import keyboard.Keyboard;
import keyboard.KeyboardFactory;
import keyboard.KeyboardGamer;
import mouse.Mouse;
import mouse.MouseFactory;
import mouse.MouseGamer;

public class buildingComputerGamer implements buildingComputerFactory{

    private MouseFactory mouse = new MouseGamer();
    private KeyboardFactory keyboard = new KeyboardGamer();

    @Override
    public Mouse getMouse() {
        return mouse.createMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return keyboard.createKeyboard();
    }
}
