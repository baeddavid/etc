function soleEvenOrOdd(arr){
  // create two variables that count for either even or odd elements in an array
  let evenCounter = 0;
  let oddCounter = 0;
  // iterate through our array
  for(let i = 0; i < arr.length; i++){
    // if the element is even, add 1 to our even counter
    if(arr[i] % 2 === 0){
      evenCounter++;
    } else {
      // else (or if the element is odd), add 1 to our odd counter
      oddCounter++;
    }
  }

  // if our even counter is greater than our odd counter (meaning that there is a single odd element)
  if(evenCounter > oddCounter){
    // iterate through our array again
    for(let i = 0; i < arr.length; i++){
      // if we come across the odd element, return it.
      if(arr[i] % 2 === 1)
        return arr[i];
    }
  } else {
    // else, (our odd counter is greater than our even counter) iterate through our array
    for(let i = 0; i < arr.length; i++){
      // if the element is even, return it
      if(arr[i] % 2 === 0)
        return arr[i];
    }
  }
}
