import factory.TreeFactory;
import factory.XmasTree;

public class Runner {

    public static void main(String[] args) {

        TreeFactory factory = new XmasTree();

        System.out.println(factory.createTree());
    }

}
