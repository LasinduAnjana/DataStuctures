import CDLinkedList.CircularDLL;

public class Main {
    public static void main(String[] args) {
        CircularDLL cdl = new CircularDLL();
        cdl.insertFront(10);
        cdl.insertFront(12);
        cdl.insertFront(15);
        cdl.insertFront(40);
        cdl.insertRear(34);
        cdl.insertRear(54);
        cdl.insertNext(15,30);
        cdl.insertBefore(40, 23);

        cdl.deleteNode(23);
        cdl.displayForward();
        cdl.displayBackward();
    }
}