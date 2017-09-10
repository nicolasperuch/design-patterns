package factory;

public class RegularTree implements TreeFactory {

    @Override
    public Tree createTree() {

        return new Tree("Regular Tree");
    }
}
