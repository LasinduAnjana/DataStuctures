package BST;

public class SNode {
    private TreeNode treeNode;

    private SNode next;

    public SNode(TreeNode treeNode) {

        this.treeNode = treeNode;
    }

    public TreeNode getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(TreeNode treeNode) {
        this.treeNode = treeNode;
    }

    public SNode getNext() {
        return next;
    }

    public void setNext(SNode next) {
        this.next = next;
    }
}
