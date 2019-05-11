    public static void transpose(String[] words){
        // Find the maximum length of either word1 or word2
        int max = Math.max(words[0].length(), words[1].length());
        
        // If word1 is shorter than word2, continue to add spaces to word1 until their length is equal
        while(words[0].length() < words[1].length())
            words[0] += " ";
        
        // If word2 is shorter than word1, continue to add spaces to word2 until their length is equal
        while(words[1].length() < words[0].length())
            words[1] += " ";
        
        // Print out each character of each word and a new line at the end of every iteration
        for(int i = 0; i < max; i++)
            System.out.print(words[0].charAt(i) + " " + words[1].charAt(i) + "\n");
    }
