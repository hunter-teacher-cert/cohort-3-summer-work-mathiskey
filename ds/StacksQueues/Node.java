public class Node{
  private int data;
  private Node next;


  /* Constructors */

  public Node(){

  }

  public Node(int data){
    this.data = data;
    this.next = null;

  }

//changing parameter to int from String in the pointer and linked list files
  public Node(int data, Node next){
    this.data = data;
    this.next = next;
  }

  // Getters
  
  public int getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }

  // Setters
  //Changed String to int
  public void setData(int data){
    this.data = data;
  }
    
    public void setNext(Node next){
	this.next = next;
  }

  
  // toString
  
  public String toString(){
    return "" + data + "->";
  }
}