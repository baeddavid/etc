var sortedSquares = function(A) {
    "Use strict"
    // create an empty array
    let answer = [];
    // iterate through our array
    for(let i = 0; i < A.length; i++)
        // push the square of the original array into our new array
        answer.push(A[i] * A[i]);
    // sort the array
    answer.sort((a, b) => a - b);
    // return the new array
    return answer;
};
