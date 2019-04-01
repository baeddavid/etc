function intersect(arr1, arr2){
    // create empty array to return as our answer
    let answer = [];
    // initialize a priority array which will be the longer array, and the secondary array which will be our shorter array
    let prioArr, secondArr;
    
    // if arr1 is bigger than arr2, arr1 is our priority array
    if(arr1.length > arr2.length){
        prioArr = arr1;
        secondArr = arr2;
    // else arr2 is our priority array
    } else {
        prioArr = arr2;
        secondArr = arr1;
    }
    
    // iteratem through our two arrays
    for(let i = 0; i < prioArr.length; i++){
        for(let n = 0; n < secondArr.length; n++){
            // if an element in our priority array matches an element in our secondary array
            if(prioArr[i] === secondArr[n]){
                // push it into our result
                answer.push(prioArr[i]);
                // delete the element from both arrays
                prioArr.splice(i,1);
                secondArr.splice(n,1);
                // decrease our index pointers to fully iterate through the array, post-deletion
                i--;
                n--;
            }
        }
    }
    // return the array we pushed the intersecting elements into
    return answer;
}
