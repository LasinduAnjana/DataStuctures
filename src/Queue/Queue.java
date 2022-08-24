package Queue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(Node newNode) {
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public Node dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        } else {
            Node temp = front;
            front = front.getNext(); // front = temp.getNext
            temp.setNext(null);
            return temp;
        }
    }

    public Node peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return front;
        }
    }

    public void display() {
        Node temp = front;

        while (temp != null) {
            System.out.println(temp.getId()+ " " + temp.getAge());
            temp = temp.getNext();
        }
    }


}
