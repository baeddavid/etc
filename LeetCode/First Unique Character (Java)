class Solution {
    public int firstUniqChar(String s) {  
        // create a hash map to count instances using chacters of our string as keys
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
          // use the charAt() method to get our key
          char ch = s.charAt(i);
          // add our key and counter to the map
          map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // reiterate through our map
        for(int i = 0; i < s.length(); i++)
          // if our the value of any of our key is 1, return that index
          if(map.get(s.charAt(i)) == 1)
            return i;
        // it was not found so return -1
        return -1;
    }
}
