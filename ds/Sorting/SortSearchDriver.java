import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Test Part 1
	
	SortSearch ss = new SortSearch(20);
	System.out.println("This is the random array: \n" + ss +"\n");
	
		
	// Test Part 2

	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("This is findSmallestIndex: \n"+"ss["+ i +"] = "+ss.get(i)+" : \n" + ss +"\n");

	i = ss.findSmallestIndex(3);
	System.out.println("This is findSmallestIndex: \n" +"ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Test Part 3

	//System.out.println(ss);
	ss.sort();
	System.out.println("\n" + "This is the array sorted: " +ss);
 
  // Test Linear Search
  System.out.println("\n" + "This is linearSearch looking for the index of value 3: " +ss.linearSearch(3) +"\n");
            
  // Test Binary Search
  System.out.println("\n" +"This is binary search looking for the index of value 5: " + ss.binarySearch(5));

  System.out.println("\n" +"This is binary search looking for the index of value 9: " + ss.binarySearch(9));
  ArrayList<Integer> a= ss.buildIncreasingList(20);
	System.out.println(a);

  ArrayList<Integer> b= ss.buildIncreasingList(20);
	System.out.println(b);

  ArrayList<Integer> mergedList = ss.merge(a, b);
  System.out.println("Merged List: " + mergedList);

 //  // Timing
    
     long start,elapsed;
  
  	start = System.currentTimeMillis();
  	ss.sort();
   //ss.linearSearch(5);
   //ss.binarySearch(5);
   //ss.binarySearchRecursive(5, 0, size - 1);
  
    elapsed = System.currentTimeMillis() - start;
    System.out.println("\nSize: " + size + " Time: " + elapsed);

      
  // Test Merge sort
    ss = new SortSearch(size);
    System.out.println("Array: \n" + ss);
    ss.msort();
    System.out.println("Merge sort: " + ss);

  }

}