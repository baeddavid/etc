function sum(n) {
    let toBeAdded = [];
    for(let i = 1; i < n; i++){
      if(i % 3 === 0)
        toBeAdded.push(i);
      else if(i % 5 === 0)
        toBeAdded.push(i);
    }
    const reducer = (accumulator, curranteValue) => accumulator + curranteValue;
    return toBeAdded.reduce(reducer);
  }
