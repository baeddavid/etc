public int[] InsertionSort(int[] arr){
    // Create a for loop starting at index 1
    for(int i = 1; i < arr.length; i++){
        // Variable j is initialized to the index of i minues 1
        int j = i - 1;
        // Set the key to be inserted into the correct position to the element at index i
        int key = arr[i];
        // While j is in bounds of the array and is greater than our key, shift the array down by 1
        while(j > -1 && arr[j] > key){
            arr[j + 1] = arr[j];
            j--;
        }
        // Insert our key into the index behind j
        arr[j + 1] = key;
    }
    // Return our now sorted array
    return arr;
}

// Loop invariant: the subarray Array[0...i-1] consists of elements originally from A[0...i-1] but in sorted order
