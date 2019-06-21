public class Node {
    public int iData;
    public Node next;

    public Node(int iData) {
        this.iData = iData;
        next = null;
    }

    public void displayNode() {
        System.out.print("{" + iData + "}");
    }
}
