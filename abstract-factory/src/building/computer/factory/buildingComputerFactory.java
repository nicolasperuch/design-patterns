package building.computer.factory;

import keyboard.Keyboard;
import mouse.Mouse;

public interface buildingComputerFactory {
    public Mouse getMouse();
    public Keyboard getKeyboard();
}
