public class Heap {
    public int size;
    public int[] heapArr;
    public int top;

    public Heap(int size) {
        top = -1;
        this.size = size;
        heapArr = new int[size];
    }

    public void insert(int x) {
        heapArr[++top] = x;
    }

    public int remove() {
        int temp = heapArr[top];
        heapArr[top--] = 0;
        return temp;
    }

    public void heapify(int[] arr, int size, int i) {
        int leftChild = (2 * i) + 1;
        int rightChild = (2 * i) + 2;
        int largest = i;

        if(leftChild < size && arr[leftChild] > arr[largest])
            largest = leftChild;

        if(rightChild < size && arr[rightChild] > arr[largest])
            largest  = rightChild;

        if(largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, size, largest);
        }
    }

    public int[] constructHeap() {
        for(int i = heapArr.length / 2; i >= 0; i--)
            heapify(heapArr, heapArr.length, i);
        return heapArr;
    }

    public int[] heapSort() {
        int[] heap = constructHeap();
        for(int i = heap.length - 1; i >= 0; i--) {
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            heapify(heapArr, i, 0);
        }
        return heap;
    }

    public void displayHeap() {
        for(int x : heapArr) {
            System.out.print(x + " ");
        }
    }
}
