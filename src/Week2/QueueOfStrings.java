package src.Week2;

public class QueueOfStrings {
  private class Node {
    String item;
    Node next;
  }
  private Node first;
  private Node last;
  private int size = 0;
  
  public QueueOfStrings() {}

  public boolean isEmpty() { return first == null; }

  public void enqueue(String item) 
  {
    Node oldLast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    if (isEmpty()) first = last;
    else oldLast.next = last;
    size = size+1;
  }

  public String dequeue() 
  {
    String item = first.item;
    first = first.next;
    size = size-1;
    if(isEmpty()) last = null;
    return item;
  }

}
