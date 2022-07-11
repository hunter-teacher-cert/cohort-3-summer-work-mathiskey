/**
 * SuperArray by Room 10
 * Jing Xue
 * collaborators: Erwin Lara, Shana Elizabeth Henry, Joel Bianchi
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    
    //init underlying/inner storage of specified capacity
    data = new int [size];

    //init instance vars
    numberElements = 0; 

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
    data = new int [10];

    //init instance vars
    numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    if (numberElements >= data.length){
      grow();
    }
    
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    /* YOUR SIMPLE+SMART CODE HERE */
  
    // add item to the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */
    data[numberElements] = value;

    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */
    numberElements ++;
  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    return numberElements==0; //(is numberElements equal to 0 or not)
    /*if (numberElements ==0){
      
      return true;
    } else {
        return false;
    }*/
  }


  public int get(int index)
  {
    //return item at index
    return data[index];
  }


  /*
  //return stringified version of this Object
  public String toString()
  {
    String s = "";
    for (int i =0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }                              
    s = s + "\n";
    return s;
  }//end toString()
  */

  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  { // shift items down to remove the item at valid index
    if (0 > index || index >= numberElements) {
      System.out.println("Invalid index #");
    } else {
        for (int i = index; i <numberElements-1; i++){
          data[i] = data[i+1];
        }
    // subtract from numElements;
        numberElements = numberElements -1;
      }
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */

    // shift elements toward the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */

    // insert new element
    /* YOUR SIMPLE+SMART CODE HERE */

    // increment numElements
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    int[] data1 = new int [data.length+1];

    // copy over all the elements from the old array (data) to the new one (data1)
    for (int i =0; i < data.length; i++){
      data1[i]=data[i];
    }
    
    // point data to the new array (data1)
    // Q: How does this look when illustrated using encapsulation diagram?
    data = data1; //now data is the same as data1 lengthwise
         
  }//end grow()

}//end class