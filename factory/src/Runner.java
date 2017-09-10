import factory.Tree;
import factory.TreeFactory;
import factory.XmasTree;

public class Runner {

    public static void main(String[] args) {

        TreeFactory factory = new XmasTree();

        Tree XmasTree = factory.createTree();

        System.out.println(XmasTree);
    }

}
