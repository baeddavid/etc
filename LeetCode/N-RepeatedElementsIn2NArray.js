var repeatedNTimes = function(A) {
    // create a map object
    let map = {};
    // iterate through our array
    for(let i = 0; i < A.length; i++)
        // add the elements as our properties, and a counter as their values
        map[A[i]] = (map[A[i]] || 0) + 1;
    
     // iterate through the properties in our map
     for(let property in map){
        // check if the property is specific to our class
        if(map.hasOwnProperty(property)){
            // if the value of our property is equal to half the length of our array we return it
            if(map[property] === A.length / 2)
                return property;
        }
    }
    // return -1 if not found
    return -1;
};
