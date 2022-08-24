package BST;

public class Queue {
    private QNode front;
    private QNode rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(TreeNode treeNode) {
        QNode newNode = new QNode(treeNode);
        if (front == null) {
            front = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public QNode dequeue () {
        if (front == null) {
            return null;
        } else {
            QNode temp = front;
            front = front.getNext();
            return temp;
        }
    }

    public QNode peek() {
        return front;
    }


    public QNode getFront() {
        return front;
    }

    public void setFront(QNode front) {
        this.front = front;
    }

    public QNode getRear() {
        return rear;
    }

    public void setRear(QNode rear) {
        this.rear = rear;
    }
}
