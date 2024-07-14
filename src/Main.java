import linkedList.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();

    ll.addToHead("Hello");
    ll.addToTail("world!");
    ll.addToHead("Bonjour");

    System.out.println(ll);
  }
}