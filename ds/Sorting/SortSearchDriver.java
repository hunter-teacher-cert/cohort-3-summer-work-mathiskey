import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(20);
	System.out.println("This is the random array: \n" + ss +"\n");
	
		
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("This is findSmallestIndex: \n"+"ss["+ i +"] = "+ss.get(i)+" : \n" + ss +"\n");

	i = ss.findSmallestIndex(3);
	System.out.println("This is findSmallestIndex: \n" +"ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3

	//System.out.println(ss);
	ss.sort();
	System.out.println("\n" + "This is the array sorted: " +ss);

  System.out.println("\n" + "This is linearSearch looking for the index of value 3: " +ss.linearSearch(3) +"\n");
            
  
  System.out.println("\n" +"This is binary search looking for the index of value 5: " + ss.binarySearch(5));

  System.out.println("\n" +"This is binary search looking for the index of value 9: " + ss.binarySearch(9));
    }
}