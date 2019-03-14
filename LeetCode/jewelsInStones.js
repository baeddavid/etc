var numJewelsInStones = function(J, S) {
    // Split both of our strings into Character Arrays
    let charArr1 = J.split('');
    let charArr2 = S.split('');
    // Initialize our couner variable to 0
    let counter = 0;
    
    // iterate through the first array
    for(let i = 0; i < charArr1.length; i++)
        // iterate through the second array
        for(let n = 0; n < charArr2.length; n++)
            // if the value in our first array is equal to the value in our second array, add 1 to counter
            if(charArr1[i] === charArr2[n])
                counter++;
    // return our counter
    return counter;     
};
