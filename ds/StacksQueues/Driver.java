import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {

	Stack s = new Stack();
	System.out.println("Is this empty stack empty?");
	System.out.println(s.isEmpty());
	System.out.println("Is this empty stack FULL?");
	System.out.println(s.isFull());
	
	
	s.push(2);
	s.push(4);
	s.push(6);
	s.push(8);
	System.out.println("Here is our test stack");
	System.out.println(s);
	System.out.println("What we should pop: " + s.pop());
  System.out.println("Did it pop?");
  System.out.println(s);
  System.out.println("Is this full stack empty NOW?");
  System.out.println(s.isEmpty());
  System.out.println("Is this full stack FULL NOW?");
  System.out.println(s.isFull());
  System.out.println("The size of this stack is: " +  s.size());
 
	
	
	Queue q = new Queue();
	q.enqueue(2);
	q.enqueue(4);
	q.enqueue(6);
	q.enqueue(8);
	System.out.println("Here is our test queue");
	System.out.println(q);
	
    }
}