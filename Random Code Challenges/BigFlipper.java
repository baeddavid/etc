    public static String bigFlipper(String string, int key){
        // Initialize an empty string
        String result = "";
        
        // Create two pointers, i at 0 and j at our key. Iterate through our string incrementing by our key
        for(int i = 0, j = key; i < string.length(); i += key, j += key){
            // Create StringBuilder object for methods
            StringBuilder input = new StringBuilder();
            // If j is greater than the length of our string, set it to the length of our string
            if(j > string.length())
                j = string.length();
            // Create a substring from index i to j
            String sub = string.substring(i, j);
            // Add the string to our StringBuilder object
            input.append(sub);
            // Reverse it
            input.reverse();
            // Add input to our string
            result += input;
        }
        // Return our string
        return result;
    }
