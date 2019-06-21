public class Stack {
    public int top;
    public int size;
    public int nItems;
    public int[] stackArr;

    public Stack(int size) {
        this.size = size;
        top = -1;
        nItems = 0;
        stackArr = new int[size];
    }

    public void push(int x) {
        stackArr[++top] = x;
        nItems++;
    }

    public int pop() {
        nItems--;
        return stackArr[top--];
    }

    public int getSize() {
        return nItems;
    }

    public boolean isFull() {
        return (nItems == size);
    }

    public int peek() {
        return stackArr[top];
    }
}
