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
    }
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
      int low = 0;
      int high = data.size() -1;
      int middle = (high + low) /2;
      
	// while we're not done:
      while (true)
      {
        if (data.get(middle) == value)
        {
          return middle;
        }
        else if (value < data.get(middle)){
          high = middle-1;
        }
        else if (high <= low){
            return -1;
        }
        else {
          low = middle + 1;
        }
        middle = (low + high)/2;
      }
    }

  public int getSize(){
    return data.size();
  }
  
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */
       
    public ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){
      
      ArrayList<Integer> mergedData = new ArrayList<Integer>();

// OPTION: to complete a merge sort WITHOUT emptying list1 and list2, use a while loop working while (mergedData.size < (list1.size + list2.size)).
      
      while(!list1.isEmpty() || !list2.isEmpty()){
        if(list1.isEmpty() && !list2.isEmpty()){
          mergedData.add(list2.get(0));
          list2.remove(0);
        }
        else if(!list1.isEmpty() && list2.isEmpty()){
          mergedData.add(list1.get(0));
          list1.remove(0);
        }
        else if (list1.get(0) < list2.get(0)){
          mergedData.add(list1.get(0));
          list1.remove(0);
        }else{
          mergedData.add(list2.get(0));
          list2.remove(0);
        }
        
      }
      return mergedData;
    }
    
}