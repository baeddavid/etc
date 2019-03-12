class Solution {
    public void reverseString(char[] s) {
        //two pointer. Iterate until middle of the array.
        for(int i = 0, j = s.length - 1; i < s.length / 2; i++,j--){
            //temporary holder
            char temp = s[j];
            //swap characters
            s[j] = s[i];
            s[i] = temp;
        }
    }
}
