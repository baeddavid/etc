// Solution with a set

boolean isUnique(String s) {
    HashSet<Character> set = new HashSet<Character>();
    for(int i = 0; i < s.length(); i++)
        if(set.contains(str.charAt(i)))
            return false;
        else
            set.add(str.charAt(i));
    return true;
}

// Solution with no additional memory
boolean isUnique(String s) {
    boolean[] truthy = new boolean[256];
    for(int i = 0; i < s.lengt(); i++) {
        int ascii = str.charAt(i);
        truthy[ascii] = true;
        if(truthy[ascii])
            return false;
    }
    return true;
}
