public class Node {
  private String data;
  private Node next;

  public Node(String data) {
    this.data = data;
    this.next = null;
  }

  public String getData() {
    return data;
  }

  public Node getNextNode() {
    return next;
  }
}
