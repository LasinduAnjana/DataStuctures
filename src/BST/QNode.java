package BST;

public class QNode {
    private TreeNode treeNode;
    private QNode next;

    public QNode(TreeNode treeNode) {
        this.treeNode = treeNode;
        this.next = null;
    }

    public TreeNode getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(TreeNode treeNode) {
        this.treeNode = treeNode;
    }

    public QNode getNext() {
        return next;
    }

    public void setNext(QNode next) {
        this.next = next;
    }
}
