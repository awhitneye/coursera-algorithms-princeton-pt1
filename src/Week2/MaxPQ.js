class MaxPQ {
  constructor() { // provided an array, perhaps a comparator
    this.pq = ['-'];
    this.n = 0;
  }
  isEmpty() { return this.n === 0 };
  size() { return this.n };

  max() {
    if(this.isEmpty) return "underflow!"; //TODO: adjust to error handling
    return this.pq[1];
  }

  insert(item) {
    this.pq[this.n+1] = item; //slap it at the end, then
    this.n++;
    this.swim(this.n); //"swim", starting at n, and swapping until item is not greater than it's parent
    //TODO: add heap check
  }

  deleteMax() {
    if(this.isEmpty()) return "empty!" //TODO: adjust to error handling
    const result = this.pq[1];
    this.n--;
    this.exchange(1, this.n);
    this.sink(this.pq[1]);
    this.pq.pop(); // deletes that last item
    //TODO: add heap check
    return result;
  }

  //helper functions to move through heap and compare and swap
  swim(k) {
    while(k > 1 && this.isLess(Math.floor(k/2), k)) { //something wrong here that needs Math.floor(Math.log2(k/2)
      this.exchange(Math.floor(k/2), k);
      k = Math.floor(k/2);
    }
  }
  sink(k) { // swaps current node, k, with node at lower child until not less than j
    while(2*k <= this.n) {
      let j = 2*k;
      if (j < this.n && this.isLess(j, j+1)) j++;
      if (!this.isLess(k, j)) break;
      this.exchange(k, j);
      k = j;
    }
  }

  isLess(i, j) { return this.pq[i] < this.pq[j] }

  exchange(i, j) {
    let held = this.pq[i];
    this.pq[i] = this.pq[j];
    this.pq[j] = held;
  }
}

let q = new MaxPQ();
console.log(q.pq)
q.insert('r');
console.log(q.pq)
q.insert('g');
console.log(q.pq)
q.insert('f');
console.log(q.pq)
q.insert('h');
console.log(q.pq)
q.insert('s');
console.log('n is: ', q.n);
console.log(q.pq)
console.log(q.deleteMax());
console.log(q.pq)
console.log('n is: ', q.n);
q.insert('a');
console.log(q.pq)
q.insert('q'); // BROKEN - shows here
console.log(q.pq)
q.insert('z');
console.log(q.pq)
