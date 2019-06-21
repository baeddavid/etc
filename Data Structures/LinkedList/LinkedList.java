public LinkedList {
    public Node root;
    public int size;

    public LinkedList() {
        root = null;
        size = 0;
    }

    public void insert(int x) {
        Node newNode = new Node(x);
        if(root == null)
            root = newNode;
        else {
            newNode.next = root;
            root = newNode;
        }
    }

    public void insertSorted(int x) {
        Node current = root;
        Node prev = null;
        Node newNode = new Node(x);

        while(current != null && x > current.iData) {
            prev = current;
            current = current.next;
        }
        if(prev == null)
            root = newNode;
        else
            prev.next = newNode;
        newNode.next = current;
    }

    public Node deleteKey(int key) {
        Node current = root;
        Node prev = null;

        while(current != null && current.iData != key) {
            prev = current;
            current = current.next;

            if(current == null)
                return null;
        }
        if(current == root)
            root = null;
            return current;
        else {
            prev.next = current.next;
            current.next = null;
        }
        return current;
    }

    public Node removeFirst() {
        Node temp = root;
        root = root.next;
        return temp;
    }

    public Node findKey(Node head, int key) {
        if(head == null)
            return null;
            
        if(head.iData == key)
            return head;

        return findKey(start.next, key);
    }

    public void displayList() {
        Node current = root;
        while(current != null) {
            current.displayNode();
            current = current.next;
        }
    }

    public Node reverseList() {
        Node prev = null;
        Node current = root;

        while(current != null) {
            Node next = current.next;
            current.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
