class Solution {
    public boolean isAnagram(String s, String t) {
        // if the two strings have different lengths, we know they are not a valid anagram
        if(s.length() != t.length())
          return false;

        // turn both of our strings into character arrays
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // if the arrays are not equal to each other, then they are not a valid anagram
        return Arrays.equals(arr1, arr2);
    }
}
