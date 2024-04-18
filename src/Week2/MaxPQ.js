export default class MaxPQ {
  constructor() { // provided an array, perhaps a comparator
    this.pq = [''];
    this.n = 0;
  }
  isEmpty() {return n === 0}
  size() {return n}

  max() {
    if(this.isEmpty) return "underflow!"
    return pq[1];
  }

  insert(item) {
    pq[n+1] = item;

  }

  //helper functions to move through heap and compare and swap
  swim(position) {
    while(position > 1 && isLess(position/2, position)) {
      exchange(position/2, position)
      position = position/2;
    }
  }
  sink(position) {
    while(2*position <= this.n) {
      let nextPos = 2*position
      // if (nextPos < this.n && isLess(position, ))
    }
  }

  isLess(i, j) {
    return pq[i] < pq[j];
  }

  exchange(i, j) {
    let held = pq[i];
    pq[i] = pq[j]
    pq[j] = held;
  }

}