package src.Week2;

// PERFORMANCE:
// TIME:  every operation is constant time in worst case
// SPACE: counting inner class (16 bytes), references to String and Node (8 each), then strings themselves
// There are faster implementations of Stack 
public class LinkedStackOfStrings {
  private class Node 
  {
    String item;
    Node next;
  }
  private Node first = null;
  
  public boolean isEmpty() 
  {
    return first == null;
  }
  
  public String pop() 
  {
    String item = first.item; //will be gc
    first = first.next;
    return item;
  }

  public void push(String str) 
  {
    Node oldfirst = first; 
    first = new Node();
    first.item = str;
    first.next = oldfirst; // now second
  }

}

