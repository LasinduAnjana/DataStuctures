package Stack;

public class Stack {
    private Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNext(top);
        top = newNode;
    }

    public Node pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            Node temp = top;
            top = top.getNext(); // top = temp.getNext();
            temp.setNext(null);
            return temp;
        }
    }

    public Node peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
           return top;
        }
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }

        // or
        // return top == null;
    }
}
