    public int[] SelectionSort(int[] arr){
        // Outer for loop to initialize our minimum index
        for(int i = 0; i < arr.length; i++){
            int min_idx = i;
            // Inner for loop to find the minimum
            for(int j = i + 1; j < arr.length; j++){
                // If the element at index j is less than min_idx, set min_idx to j
                if(arr[min_idx] > arr[j])
                    min_idx = j;
            }
            // Swap elements at min_idx and i
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        // Return the sorted array
        return arr;
    }
    
    /* Loop invariants
    Outer Loop: The first i elements are sorted
    Inner Loop: min_idx is always the min value of Array[i...j]
