package BST;

public class Stack {
    private SNode top;

    public void push(TreeNode newTreeNode) {
        SNode newNode = new SNode(newTreeNode);

        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.setNext(this.top);
            this.top = newNode;
        }
    }

    public TreeNode pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            SNode temp = top;
            top = top.getNext(); // top = temp.getNext();
            temp.setNext(null);
            return temp.getTreeNode();
        }
    }

    public TreeNode peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return top.getTreeNode();
        }
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }

    }
}

