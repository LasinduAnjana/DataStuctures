package CDLinkedList;

public class CircularDLL {
    private Node head;

    public CircularDLL() {
        this.head = null;
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.setNext(newNode);
            newNode.setPrev(newNode);
        } else {
            newNode.setNext(head);
            newNode.setPrev(head.getPrev());
            newNode.getPrev().setNext(newNode);
            head.setPrev(newNode);
            head = newNode;
        }
    }

    public void insertRear(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.setNext(head);
            newNode.setPrev(head);
        } else {
            newNode.setNext(head);
            newNode.setPrev(head.getPrev());
            head.setPrev(newNode);
            newNode.getPrev().setNext(newNode);
        }
    }

    public void insertNext(int prevData, int data) {

        if (isExists(prevData)) {
            Node prevNode = searchNode(prevData);
            Node newNode = new Node(data);

            newNode.setPrev(prevNode);
            newNode.setNext(prevNode.getNext());
            prevNode.setNext(newNode);
            newNode.getNext().setPrev(newNode);
        } else {
            System.out.println("previous node does not found");
        }
    }

    public void insertBefore(int nextData, int data) {
        if (isExists(nextData)) {
            Node nextNode = searchNode(nextData);
            Node newNode = new Node(data);

            newNode.setNext(nextNode);
            newNode.setPrev(nextNode.getPrev());
            nextNode.setPrev(newNode);
            newNode.getPrev().setNext(newNode);

            if (nextNode == head) {
                head = newNode;
            }
        }
    }

    public void deleteNode(int data) {
        if (isExists(data)) {
            Node temp = searchNode(data);
            if (temp == head) {
                head = temp.getNext();
                head.setPrev(temp.getPrev());
                temp.getPrev().setNext(head);
            } else if (temp == head.getPrev()) {

            } else {
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
            }
            temp.setPrev(null);
            temp.setNext(null);
        } else {
            System.out.println("CDLinkedList.Node does not found");
        }
    }

    public void displayForward() {
        Node temp = head;

        if (temp != null) {
            System.out.print("Forward : ");
            do {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            } while (temp != head);
        } else {
            System.out.println("List is Empty");
        }
    }

    public void displayBackward() {
        Node temp = head.getPrev();

        if (temp != null) {
            System.out.println("Backward : ");
            do {
                System.out.print(temp.getData() + " ");
                temp = temp.getPrev();
            } while (temp != head.getPrev());
        } else {
            System.out.println("List is Empty");
        }
    }

    private Node searchNode(int data) {
        Node temp = head;

        if (temp != null) {
            do {
                if (temp.getData() == data) {
                    return temp;
                }
                temp = temp.getNext();
            } while (temp != head);
        } else {
            System.out.println("list is empty");
        }
        return null;
    }

    private boolean isExists(int data) {
        Node temp = head;

        if (temp != null) {
            do {
                if (temp.getData() == data) {
                    return true;
                }
                temp = temp.getNext();
            } while(temp != head);
        } else {
            System.out.println("list is empty");
        }

        return false;
    }
}
