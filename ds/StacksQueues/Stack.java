import java.io.*;
import java.util.*; 

// Team: Yeidy Levels, Marisa Shuman, Sarah McCoy, Shana Elizabeth Henry

public class Stack{
// Stack
// Recall, a stack is a Last In First Out structure.


	//In this folder, we changed the Node file to hold an integer, rather than a String.
  private Node head;

  public Stack(){
    head = null;
  }

// void push(int value) - add value to the top of the stack
  public void push(int value){
//make head the next thing after value--this is cleaner
		Node newItem = new Node(value, head);
//make the new node the new head
		head = newItem;
	}
  

	//removes the head of the stack, and returns the removed item
	public int pop(){
		Node temp = head;
		//overwrite the head with its next item
		head = head.getNext();
		return temp.getData();
  }
// int top() - return but do not remove the top value from the stack
	public int top(){
		return head.getData();
  }

  // boolean isEmpty() - return true of the stack is empty, false otherwise
	public boolean isEmpty(){
		return head == null;
	}
  

  // boolean isFull() - returns true if the stack is full, false otherwise - only implement this if you use an array for implementation
  public boolean isFull(){
		return !isEmpty();
	}
  
 // Return a string representation of the 
  // toString() - return a string with all the data in the stack
  public String toString(){
		//Initially we were using head directly, and overwriting it with getNext...but since head is global, that caused problems in the other methods.  So always set a temp variable like "walker" or "current"
  	Node current = head;
		String s = "";
		while (current != null){

			s += current.getData() + "->";
			current = current.getNext();
		}
			return s;
  }

  /**
  returns the number of elements in the list
  */
	//WE COULD HAVE USED a global variable that increments each time you top...which would be useful

  // int size() - return the number of elements currently in the stack
  public int size(){
    Node current = head;
		int counter = 0;
		while (current != null){
			current = current.getNext();
			counter ++;
		}
			return counter;
  }
}		