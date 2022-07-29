import java.io.*;
import java.util.*; 

// Team: Yeidy Levels, Marisa Shuman, Sarah McCoy, Shana Elizabeth Henry

public class Queue{
// Recall, a queue is a First In First Out structure.

// You should implement the following methods

// A constructor with no parameters
// void enqueue(int value) - add value to the end of the queue
// int dequeue() - remove and return the top value from front of the queue
// int front() - return but do not remove the top value from the front of the queue
// boolean isEmpty() - return true of the queue is empty, false otherwise
// int size() - return the number of elements currently in the queue
// boolean isFull() - returns true if the queue is full, false otherwise - only implement this if you use an array for implementation
// toString() - return a string with all the data in the stack
  
	
  // Place constructors here
// Place private instance variables here

	//In this folder, we changed the Node file to hold an integer, rather than a String.
  private Node head;
	
	public boolean isEmpty(){
		return head == null;
	}
  public Queue(){

    head = null;
  }

	public void enqueue(int value){
		//Set up the node	
		Node newItem = new Node(value);
//if there is nothing in the queue, add to the front.
		if (isEmpty()){
			head = newItem;
		}else{
		//temp variable to start at head	
			Node current = head;
	
			//iterate until there's nothing next to current
						while (current.getNext() != null){
							current = current.getNext();
						}
		
		//assign the next value to be the new Item.
						current.setNext(newItem);

			}//end else
	}//end method
  	
//   public void push(int value){
// //make head the next thing after value--this is cleaner
// 		Node newItem = new Node(value, head);
// //make the new node the new head
// 		head = newItem;
// 	}
  

	// public int pop()
	// 	Node temp = head;
	// 	//overwrite the head with its next item
	// 	head = head.getNext();
	// 	return temp.getData();
 //  }

	// public int top(){
	// 	return head.getData();
 //  }

	
  // public String get(int index){
		// Node current = head;
		// for (int i = 0; i < index; i++){
		// 	//System.out.println(current);//print trace for debugging
		// 	current = current.getNext();
			
		// 	if (current == null){
		// 		return "Out of bounds";
		// 	}
		// }
  //   return current.getData();
  // }


  
 // Return a string representation of the 

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
	//WE COULD HAVE USED a global variable that increments each time you add (in either add function)...which would be useful
  public int size(){
    Node current = head;
		int counter = 0;
		while (current != null){
			current = current.getNext();
			counter ++;
		}
			return counter;
  }

  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
/**public void add(int index, String value){
		//Special case adding at index 0....we're going to assume we don't try to add out of bounds?	
		//Improvement idea--write a "get" helper method that returns a NODE, rather than the data at the node (getData)
		if (index == 0){
				add(value);
			
			}else{
			
				Node newItem = new Node(value);
				Node current = head;
		//this loop is problematic if adding at index 0
					for (int i = 0; i < index-1; i++){
			//System.out.println(current);//print trace for debugging
						current = current.getNext();
					}

   			newItem.setNext(current.getNext()); 
				current.setNext(newItem);
			}
  	}*/
  


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */

// public int indexOf(String value){
//     Node temp = head;
//     int ctr = 0;
    
//     while (temp.getData() != value){
//       temp = temp.getNext();
//       ctr++;
//     }
//     return ctr; 
//   }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
	// public String[] toArray(){
 //    return null;
 //  }

}		