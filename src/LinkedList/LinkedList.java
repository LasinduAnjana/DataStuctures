package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = this.tail = null;
    }

    public void insertFront(Node newNode) {
        if (head == null) {
            this.head = this.tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void insertRear(Node newNode) {
        if (head == null) {
            this.head = this.tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void insertNext(int id, Node newNode) {
        Node prev = search(id);

        if (prev == null) {
            System.out.println("node with id not found");
        } else {
            newNode.setNext(prev.getNext());
            prev.setNext(newNode);
        }
    }

    private Node search(int id) {
        Node temp = head;

        while(temp != null) {
            if (temp.getId() == id) {
                return temp;
            }

            temp = temp.getNext();
        }
        return null;
    }

    private boolean isExists(int id) {
        Node temp = head;

        while(temp != null) {
            if (temp.getId() == id) {
                return true;
            }

            temp = temp.getNext();
        }
        return false;
    }

    public void delete(int id) {
        Node curr = head;
        Node prev = head;

        if (isExists(id)) {
            while (curr != null) {
                if (curr.getId() == id) {break;}
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
