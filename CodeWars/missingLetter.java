    public static char findMissingLetter(char[] array){
        // Create a temp variable to hold future ASCII value of characters
        int answer = 0;
        // If the first letter of the character array is B we know that the missing letter is A.
        if(array[0] == 'b')
            return 'a';
        
        // Initialize an empty array to hold our ASCII values
        int[] arr = new int[array.length];
        // Add ASCII values to the array
        for(int i = 0; i < array.length; i++){
            int x = array[i];
            arr[i] = x;
        }
        
        /* For index i, if the element at (i + 1) does not equal [i + 1] then we have found the gap where there is a
        gap in the letters */
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] + 1 != arr[i + 1])
                // The ASCII code for our missing letter is 1 plus where our if statement was true
                answer = arr[i] + 1;
        }
        // Type cast our answer into a character value
        char result = (char)answer;
        // Return our result
        return result;
    }
