package mouse;

public class MouseOffice implements MouseFactory{

    @Override
    public Mouse createMouse() {
        return new Mouse("Office");
    }
}
