    public static int outlier(String numbers){
        // Convert our string of numbers into an array of integers
        int[] arr = arrConverter(numbers);
        
        // If the array is even
        if(isEven(arr))
            // Iterate through our array until we find an element that is odd
            for(int i = 0; i < arr.length; i++)
                if(arr[i] % 2 == 1)
                    // Return the index of i + 1, because the problem asked for a 1 indexed array
                    return i + 1;
                    
        // If the array is odd
        if(!isEven(arr))
            // Iterate through our array until we find an element that is even
            for(int i = 0; i < arr.length; i++)
                if(arr[i] % 2 == 0)
                    // Return the index of i + 1
                    return i + 1;
        // Return -1 if the program fails to enter either checks
        return -1;
    }

    public static int[] arrConverter(String numbers){
        // Split our string into an array of Strings using a space as the key to split by
        String[] numberString = numbers.split(" ");
        // Create an empty array of integers with the size of the length of our String array
        int[] number = new int[numberString.length];
        // Add each number into our array of integers by type casting
        for(int i = 0; i < number.length; i++)
            number[i] = Integer.parseInt(numberString[i]);
        // Return our array of integers
        return number;
    }

    public static boolean isEven(int[] arr){
        // Create a counter to keep count of even elements in an array
        int evenCounter = 0;
        // Iterate through our array
        for(int x : arr)
            // If the element is even, increment our counter by 1
            if(x % 2 == 0)
                evenCounter++;
        
        // If the even counter is not equal to 1 the array is even
        if(evenCounter != 1)
            return true;
        // If the even counter is equal to 1 the array is odd
        else
            return false;
    }
