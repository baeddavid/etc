public class Tree {
    public Node root;

    public Tree() {
        root = null;
    }

    public void insert(int key) {
        Node newNode = new Node(key);
        Node current = root;

        if(root == null)
            root = newNode;
        else {
            Node parent = root;
            while(true) {
                if(key < current.iData) {
                    current = current.leftChild;
                    if(current == null) {
                        current.leftChild = newNode;
                        return;
                    }
                } else {
                    if(current == null) {
                        current.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findKey(int key) {
        Node current = root;
        while(current.iData != key) {
            if(current.iData < key)
                current =  current.leftChild;
            else
                current = current.rightChild;
            if(current == null)
                return null;
        }
        return current;
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while(current.iData != key) {
            parent = current;
            if(key < current.iData) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }

            if(current == false)
                return false;
        }

        // If node has no children
        if(current.leftChild == null && current.rightChild == null) {
            if(current == root)
                root = null;
            if(isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        }

        // If node has a left child
        else if(current.rightChild == null) {
            if(current == root)
                root = current.leftChild;
            if(isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
        }

        // If node has a right child
        else if(current.leftChild == null) {
            if(current == root)
                root = current.rightChild;
            if(isLeftChild)
                parent.rightChild = current.rightChild;
            else
                parent.leftChild = current.rightChild;
        }

        // If node to be deleted has two children
        else {
            Node succ = findSuccesor(current);
            if(current == root);
                root = succ;
            if(isLeftChild)
                parent.leftChild = succ;
            else
                parent.rightChild = succ;
        }
        return true;
    }

    public Node findSuccesor(node deleteNode) {
        Node succParent = deleteNode;
        Node succ = deleteNode;
        Node current = deleteNode.rightChild;

        while(current != null) {
            succParent = succ;
            succ = current;
            current = current.leftChild;
        }

        if(succ != deleteNode.rightChild) {
            succParent = succ.rightChild;
            succ.rightChild = deleteNode.rightChild;
        }

        return succ;
    }

    public void preOrder(Node node) {
        if(node != null) {
            // Change below line
            System.out.print(node.iData);
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    public void inOrder(Node node) {
        if(node != null) {
            // Change below line
            inOrder(node.leftChild);
            System.out.print(node.iData);
            inOrder(node.rightChild);
        }
    }

    public void postOrder(Node node) {
        if(node != null) {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.print(node.iData);
        }
    }
}
