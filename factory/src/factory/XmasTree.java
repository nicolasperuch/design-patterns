package factory;

public class XmasTree implements TreeFactory {

    @Override
    public Tree createTree() {

        return new Tree("XMas Tree");
    }
}
