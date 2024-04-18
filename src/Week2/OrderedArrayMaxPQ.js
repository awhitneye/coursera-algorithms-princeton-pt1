class orderedArrayPQ {
  constructor() {
    this.pq = [];
  }
  isEmpty(){ return this.pq.length === 0 }
  size(){ return this.pq.length }
  getMax(){ return this.pq.pop() }
  insert(key) {
    let index = this.pq.length-1;
    while(index >=0 && key < this.pq[index]){
      index--;
    }
    this.pq.splice(index+1, 0, key);
  }
}

let newQueue = new orderedArrayPQ;
newQueue.insert('this');
newQueue.insert('is');
newQueue.insert('a');
newQueue.insert('test');
console.log(newQueue.pq);
console.log(newQueue.getMax());
console.log(newQueue.getMax());
console.log(newQueue.pq);
