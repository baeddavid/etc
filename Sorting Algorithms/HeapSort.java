    // Create our maxHeapify function
    public static int[] maxHeapify(int[] arr, int size, int i){
        // The left child of i
        int left = (2 * i) + 1;
        // The right child of i
        int right = (2 * i) + 2;
        // Set largest equal to i 
        int largest = i;
        
        /* If left is less than the size of our heap and the element at left
        is greater than the element at largest set largest to left */
        if(left < size && arr[left] > arr[largest])
            largest = left;
        
        /* If right is less than the size of our heap and the element at right
        is greater than the element at largest set largest to right */
        if(right < size && arr[right] > arr[largest])
            largest = right;
        
        // If largest is not equal to i, we need to continue to call heapify down the tree
        if(largest != i){ 
            // Swap our value at i and largest
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            // Recursively call our maxHeapify method to correct any incorrect node placements
            maxHeapify(arr, size, largest);
        }
        return arr;
    }
    
    // Building a max Heap function
    public static int[] buildMaxHeap(int[] arr){
        // Begin interating from the middle of our array
        for(int i = arr.length / 2; i >= 0; i--)
            // Call maxHeapify at every index i
            maxHeapify(arr, arr.length, i);
        // Return our max Heap
        return arr;
    }

    public static int[] heapSort(int[] arr){
        // Build a max heap from the array
        int[] heap = buildMaxHeap(arr);
        
        // Starting at the end of our heap, iterate backwards
        for(int i = heap.length - 1; i >= 0; i--){
            // Swap the element at the top of our heap with the element at the bottom
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            // Call maxHeapify on the first element to find the next max element and reduce the size of our heap by 1
            maxHeapify(arr, i, 0);
        }
        // Return our newly sorted array
        return heap;
    }
