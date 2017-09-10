package factory;

public class ShortTree implements TreeFactory {

    @Override
    public Tree createTree() {
        return new Tree("Short Tree");
    }
}
