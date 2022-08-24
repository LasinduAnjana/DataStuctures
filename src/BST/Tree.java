package BST;

public class Tree {
    private TreeNode root;

    public Tree() {
        this.root = null;
    }

    public void insertNode(int data) {
        TreeNode newNode = new TreeNode(data);
        this.root = insert(this.root, newNode);
    }
    private TreeNode insert(TreeNode root, TreeNode newNode) {
        if (root == null) {
            root = newNode;
            return root;
        } else if (newNode.getData() <= root.getData()) {
            root.setLeft(insert(root.getLeft(), newNode));
        } else {
            root.setRight(insert(root.getRight(), newNode));
        }
        return root;
    }

    public TreeNode dfSearch(int data) {
        if (this.root == null) {
            System.out.println("Empty tree");
        } else {
            Stack stack = new Stack();
            stack.push(root);

            while (!stack.isEmpty()) {
                TreeNode temp = stack.pop();
                if (temp.getData() == data) {
                    return temp;
                }
                if (temp.getLeft() != null) {
                    stack.push(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    stack.push(temp.getRight());
                }
            }
        }
        return null;
    }

    public TreeNode bfSearch(int data) {
        Queue queue = new Queue();

        queue.enqueue(root);

        while (queue.peek() != null) {
            TreeNode temp = queue.dequeue().getTreeNode();
            if (temp.getData() == data) {
                return temp;
            }
            if (temp.getLeft() != null) {
                queue.enqueue(temp.getLeft());
            }
            if (temp.getRight() != null) {
                queue.enqueue(temp.getRight());
            }
        }
        return null;
    }

    public void inOrder() {
        displayInOrder(root);
    }

    public void preOrder() {
        displayPreOrder(root);
    }

    public void postOrder() {
        displayPostOrder(root);
    }
    private void displayPreOrder(TreeNode root) {
        if(root == null) {
            return;
        }else {
            System.out.print(root.getData()+" ");
            displayPreOrder(root.getLeft());
            displayPreOrder(root.getRight());
        }
    }

    private void displayInOrder(TreeNode root) {
        if(root == null) {
            return;
        }else {
            displayInOrder(root.getLeft());
            System.out.print(root.getData() + " ");
            displayInOrder(root.getRight());
        }

    }

    private void displayPostOrder(TreeNode root) {
        if(root == null) {
            return;
        }else {
            displayPostOrder(root.getLeft());
            displayPostOrder(root.getRight());
            System.out.print(root.getData()+" ");
        }
    }


    public TreeNode getRoot() {
        return root;
    }
}
