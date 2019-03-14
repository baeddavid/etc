var firstUniqChar = function(s) {
    // create a map object
    let map = {};
    // iterate through our string adding each character of our string as a property
    for(let i = 0; i < s.length; i++){
        let ch = s.charAt(i);
        // if the property exists add 1, else create it and itialize it to 1
        map[ch] = (map[ch] || 0) + 1;
    }
    
    // iterate through our string using the characters as our property calls
    for(let i = 0; i < s.length; i++)
        // if the value of the property is 1 we return the index of the string
        if(map[s.charAt(i)] === 1)
            return i;
    // return -1 if not found
    return -1;
};
