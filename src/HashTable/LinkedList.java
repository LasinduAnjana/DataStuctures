package HashTable;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = this.tail = null;
    }

    public void insert(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            this.head = this.tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public Node search(int data) {
        Node temp = head;

        while(temp != null) {
            if (temp.getData() == data) {
                return temp;
            }

            temp = temp.getNext();
        }
        return null;
    }

    private boolean isExists(int data) {
        Node temp = head;

        while(temp != null) {
            if (temp.getData() == data) {
                return true;
            }

            temp = temp.getNext();
        }
        return false;
    }

    public void delete(int data) {
        Node curr = head;
        Node prev = head;

        if (isExists(data)) {
            while (curr != null) {
                if (curr.getData() == data) {break;}
                prev = curr;
                curr = curr.getNext();
            }
            if (curr == head) {
                head = curr.getNext();
            } else if (curr == tail) {
                prev.setNext(null);
            } else {
                prev.setNext(curr.getNext());
            }
        }
    }

}
