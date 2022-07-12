import java.io.*;
import java.util.*;
  
/** Lyrics to Beer Song */
  public class Beer {


    public static void Lyrics (int n) {
        
        if (n==0) {
          System.out.println ("Song is over:(");
        } else {
            System.out.println(n + " bottles of beer on the wall, ");
            System.out.println(n + " bottles of beer, ");
            System.out.println("ya’ take one down, ya’ pass it around,");
            System.out.println(n-1 + " bottles of beer on the wall.");
          System.out.println();
          Lyrics(n-1);
            }
      }

    public static void main(String[] args){
        Lyrics(99);      
      
    }
}
