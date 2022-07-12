/** Exercise #4*/
import java.io.*;
import java.util.Scanner;

public class Max {

    public static int indexOfMax (int[] array ) {
    
      if ( array == null || array.length == 0 ) 
        return -1; // null or empty
      int largest = 0;
      for ( int i = 1; i < array.length; i++ ){
        if ( array[i] > array[largest] ) largest = i;
      }
      return largest; // position of the first largest found
    }  

    public static void main (String[] array) {
      
    }
}