package src.Week2;

// PERFORMANCE DISCUSSION
// if we create a new size array every push and pop, it's expensive in time, takes time proportional = Quadratic time to insert N items to a stack
// "repeated doubling": When array fills, create an array of TWICE the size, so we don't create them too often
// the time cost is now logarithmic, because there are ~ log(2)n powers of 2 between 1 and n

//to shrink: "thrashing".  If client happens to push/pop/push/pop, creating new arrays around N, it'll be quadratic again
// solution: wait until array gets 1/4 full before halving.  there won't be another resize until it fills again, or quarters.

//MEMORY is always a constant multiple of items on the stack. INVARIANT: Array is always between 25% and 100% full.

//Individual operations are fast, less memory than linked list, but tradeoff of memory savings for temporary slow at resizing events.
public class ResizeArrayStackOfStrings {
  private String[] s;
  private int N = 0; //size, and index of next open position
  public ResizeArrayStackOfStrings()
  {
    s = new String[1];
  }

  public boolean isEmpty()
  { 
    return N == 0; 
  }

  private void resize(int capacity) // on push, will have to recognize current limit, and double if needed.
  {
    String[] copyArr = new String[capacity];
    for (int i = 0; i < N; i++) {
      copyArr[i] = s[i];
    }
    s = copyArr;
  }

  public void push(String item) // null items? 
  {
    if(N == s.length) resize(s.length*2); 
    s[N++] = item;
  }

  public String pop() //underflow issues? 
  {
    String item = s[--N];
    s[N] = null; 
    if(N > 0 && N == s.length/4) resize(s.length/2);
    return item; 
  }
  
}
