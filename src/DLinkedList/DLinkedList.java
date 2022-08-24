public class DLinkedList {
    private Node head;
    private Node tail;

    public DLinkedList() {
        this.head = this.tail = null;
    }

    public void insertFront(Node newNode) {
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }

    public void insertRear(Node newNode) {
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public void insertNext(int id, Node newNode) {
        Node temp = search(id);

        if (temp == null) {
            System.out.println("Id Not Found");
        } else if(temp == tail) {
            insertFront(newNode);
        }else {
            newNode.setNext(temp.getNext());
            newNode.setPrev(temp);
            temp.getNext().setPrev(newNode);
            temp.setNext(newNode);
        }
    }

    public void insertPrev(int id, Node newNode) {
        Node temp = search(id);

        if (temp == null) {
            System.out.println("ID Not found");
        } else if (temp == head) {
            insertRear(newNode);
        } else {
            newNode.setNext(temp);
            newNode.setPrev(temp.getPrev());
            temp.getPrev().setNext(newNode);
            temp.setPrev(newNode);
        }
    }

    private Node search(int id) {
        Node temp = head;

        while (temp != null) {
            if(temp.getId() == id) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void delete (int id) {
        Node temp = search(id);

        if (temp == null) {
            System.out.println("Id Not Found");
        } else {
            if (temp == head) {
                temp.getNext().setPrev(null);
                head = temp.getNext();
                temp.setNext(null);
            } else if (temp == tail) {
                temp.getPrev().setNext(null);
                tail = temp.getPrev();
                temp.setPrev(null);
            } else {
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
                temp.setNext(null);
                temp.setPrev(null);
            }
        }
    }

    public void printForward() {
        Node temp = head;

        while(temp != null) {
            System.out.println(temp.getName() + " " + temp.getId());
            temp = temp.getNext();
        }
    }

    public void printBackward() {
        Node temp = tail;

        while (temp != null) {
            System.out.println(temp.getName() + " " + temp.getId());
            temp = temp.getPrev();
        }
    }
}
