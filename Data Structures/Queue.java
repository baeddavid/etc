public class Queue {
    public int front;
    public int rear;
    public int size;
    public int[] queArr;
    public int nItems;

    public Queue(int size) {
        this.size = size;
        front = 0;
        rear = -1;
        nItems = 0;
        queArr = new int[size];
    }

    public void push(int x) {
        if(rear == size - 1) {
            rear = -1;
        }
        queArr[++rear] = x;
        nItems++;
    }

    public int pop() {
        int tbr = queArr[front++];
        if(front == size)
            front = 0;
        nItems--;
        return tbr;
    }

    public boolean isFull() {
        return(nItems == size);
    }

    public int peek() {
        return queArr[front];
    }
}
