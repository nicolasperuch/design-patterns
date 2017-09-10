package building.computer.factory;

import keyboard.Keyboard;
import mouse.Mouse;

public class buildingComputerCustom implements buildingComputerFactory{

    private String mouseType;
    private String keyboardType;

    public buildingComputerCustom(String mouseType, String keyboardType) {
        this.mouseType = mouseType;
        this.keyboardType = keyboardType;
    }

    @Override
    public Mouse getMouse() {
        return new Mouse(mouseType);
    }

    @Override
    public Keyboard getKeyboard() {
        return new Keyboard(keyboardType);
    }
}
