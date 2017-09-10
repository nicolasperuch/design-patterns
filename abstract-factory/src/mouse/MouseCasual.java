package mouse;

public class MouseCasual implements MouseFactory{

    @Override
    public Mouse createMouse() {
        return new Mouse("Casual");
    }
}
