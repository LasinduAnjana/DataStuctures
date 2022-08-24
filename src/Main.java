import BST.*;
import CDLinkedList.CircularDLL;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insertNode(23);
        tree.insertNode(17);
        tree.insertNode(45);
        tree.insertNode(20);
        tree.insertNode(10);
        tree.insertNode(15);
        tree.insertNode(34);
        tree.insertNode(16);
        tree.insertNode(17);

        System.out.println(tree.dfSearch(17).getData());

        System.out.println("inOrder");
        tree.inOrder();

        System.out.println();
        System.out.println("preOrder");
        tree.preOrder();

        System.out.println();
        System.out.println("Post order");
        tree.postOrder();
    }
}