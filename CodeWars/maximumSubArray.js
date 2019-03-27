function maxSubArraySum(arr){
    let size = arr.length;
    // set maximum sum equal to maximum value in array
    let max = Math.max(...arr);
    // set our sum so far to 0
    let progress = 0;
  
    for(let i = 0; i < size; i++){
      // add our element at index i to progress
      progress += arr[i];
      // if our max sum so far is less than progress, max is set to progress
      if(max < progress)
        max = progress;
      // if progress is negative, reset its value
      if(progress < 0)
        progress = 0;
    }
    // return max sum
    return max;
  }
