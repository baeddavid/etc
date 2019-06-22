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
}
