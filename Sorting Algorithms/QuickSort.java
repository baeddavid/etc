    public static int[] SattoloCycle(int[] arr){
        // Create a random object
        Random random = new Random();
        // Start from the end of our array
        for(int i = arr.length - 1; i >= 0; i--){
            // Create a variable random index that holds a random number up until i
            int randomIndex = random.nextInt(i);
            // Swap our variables
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        // Return our randomly permutated array
        return arr;
    }
    
    public static int partition(int[] arr, int start, int end){
        // Randomly permutate our array to avoid worst case time complexity for quick sort
        arr = SattoloCycle(arr);
        // Set pivot equal to the last element in our array
        int pivot = arr[end];
        // Set j = to start minus 1
        int j = start - 1;
        
        // Iterate through our array
        for(int i = start; i < end; i++){
            // If the element at index i is less than or equal to the pivot
            if(arr[i] <= pivot){
                // increase j by 1
                j++;
                // Swap elements at index i and index j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap the elements at index j + 1 and the last element to insert the pivot into place
        int temp = arr[j + 1];
        arr[j + 1] = arr[end];
        arr[end] = temp;
        
        // Return j + 1 for the index of pivot
        return j + 1;
    }

    public static int[] quickSort(int[] arr, int left, int right){
        // As long as our array has a size of 2
        if(left < right){ 
            // find the pivot of our array
            int pivot = partition(arr, left, right);
            // Recursively call quickSort from the start of the array to pivot minus 1
            quickSort(arr, left, pivot - 1);
            // Recursively call quickSort from the pivot + 1 to the end of the array
            quickSort(arr, pivot + 1, right);
        }
        // Return our sorted arrray
        return arr;
    }
