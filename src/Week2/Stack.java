package src.Week2;

public class Stack {
  private class Node 
  {
    String item;
    Node next;
  }
  private Node first = null;
  
  public static void main(String[] args) {  }

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
