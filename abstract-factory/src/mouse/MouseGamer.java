package mouse;

public class MouseGamer implements MouseFactory{

    @Override
    public Mouse createMouse() {
        return new Mouse("Gamer");
    }
}
