package building.computer.factory;

import keyboard.Keyboard;
import keyboard.KeyboardFactory;
import keyboard.KeyboardOffice;
import mouse.Mouse;
import mouse.MouseFactory;
import mouse.MouseOffice;

public class buildingComputerOffice implements buildingComputerFactory{

    private MouseFactory mouse = new MouseOffice();
    private KeyboardFactory keyboard = new KeyboardOffice();

    @Override
    public Mouse getMouse() {
        return mouse.createMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return keyboard.createKeyboard();
    }
}
