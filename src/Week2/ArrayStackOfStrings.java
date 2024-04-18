package src.Week2;

// PERFORMANCE
// Defect: In Java, Arrays have declared length.  Stack has a limited capacity.
public class ArrayStackOfStrings {
  private String[] s;
  private int N = 0; //size, and index of next open position
  public ArrayStackOfStrings(int capacity) //client needs to provide, cheaty, client maybe can't know size
  { 
    s = new String[capacity]; 
  }

  public boolean isEmpty()
  { 
    return N == 0; 
  }

  public void push(String item) //overflow issues? null items? 
  {
    if(N == s.length) {
      return; // overflow: do nothing and lose the item?
    }
    s[N++] = item;
  }

  public String pop() //underflow issues? loitering?
  {
    String item = s[--N];
    s[N] = null; // gc can clean "item", can reclaim the memory, avoids loitering
    return item; 
  }
}
