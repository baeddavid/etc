    public static String flipper(String string){
        // Create an empty character array with the length of our string
        char[] charArr = new char[string.length()];
        // Add each character in order to our array
        for(int i = 0; i < string.length(); i++){
            charArr[i] = string.charAt(i);
        }
        
        // Iterate through every other character in our array
        for(int i = 0; i < charArr.length - 1; i += 2){
            // Swap characters at i and i + 1
            char temp = charArr[i];
            charArr[i] = charArr[i + 1];
            charArr[i + 1] = temp;
        }
        
        // Initialize an empty string
        String result = "";
        // For each character add it to our empty string
        for(char x : charArr)
            result += x;
        
        // Return our string
        return result;
    }
