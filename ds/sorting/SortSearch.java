import java.io.*;
import java.util.*;

/*
Sort Project:
Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.
  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.
  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.
Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	}
	
    }
    
    public SortSearch(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end
      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
      //initiate a smallIndex variable to the argument passed when findSmallestIndex is found...typically when this method
	int smallIndex = start;
      //for loop runs through the length of the data.
	for(int i = start; i < data.size(); i++){
    if(data.get(i) < data.get(smallIndex)){ //if the data at position i is less than the data at the previously smallIndex....
      smallIndex = i; //set the small index to the current smaller index value (this keeps getting updated once a smaller number is found)
    } 
  }
	return smallIndex;
    }
    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.
	 
       
    */
    public void sort(){
    //using a for(){} loop to start the sort process
    for(int i = 0; i < data.size()-1; i++){
      int swapIndex = findSmallestIndex(i);//sets smallest index to be stored in the swapIndex variable, this is made easier by calling findSmallestIndex() method from above...
      int temp = data.get(i); //temp variable to get smallest number 
      data.set(i, data.get(swapIndex)); //put the smallest number at the front of the list
      data.set(swapIndex, temp); //put the number that was originally at the front where the smallest number USED to be
      
      
    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.
       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.
       This algorithm works on any ArrayList.
    */
    public int linearSearch(int value){
	  
	  for (int i = 0; i < data.size(); i++)
    {
      if (data.get(i) == value)
      {
        return i;
      }
    }
    return -1;
  }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
   public int binarySearch(int value){
      // check that data is sorted.  If not, sort it first
      //this.builtinSort();
        
  	  // create assign variables  representing the high, low and middle indices
      int low = 0;
      int high = this.data.size()-1; 
      int mid = (low + high)/2;
      
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle
      while(high >= low) { 

        if(value == this.get(mid)) {
          return mid;
        } else if(value > this.get(mid)) { // check top half
          low = mid + 1;
          mid = (low + high) / 2;
          // high remains the same
        } else { // value < this.get(mid) <-- check bottom half
          // low remains the same 
          high = mid;
          mid = (low + high) / 2;
          
        } 
      
      }
      System.out.println("Value, " + value + ", not found.");
	    return -1;  // if not found
    }
}