package src.Week2;

public class Stack {
  private class Node {
    String item;
    Node next;
  }
  private Node first;
  public static void main(String[] args) {  }
  
  public String pop() {
    String item = first.item;
    first = first.next;
    return item;
  }
}
