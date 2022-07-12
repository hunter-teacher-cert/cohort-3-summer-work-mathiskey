/** Exercise #5*/
import java.io.*;
import java.util.Scanner;

public class Sieve {
     
    public static void main (String[] args) {
      boolean[] a = Sieve(10);
      for (boolean value: a){
        System.out.println(value);  
      }
      
    }
    public static boolean[] Sieve(int n) {
      boolean[] b = new boolean[n];
      for (int i = 0; i < b.length; i++) {
        b[i] = true;
      }
      for (int i = 2; i < b.length; i++) {
        if (b[i] == true){
          for (int j = i+1; j < b.length; j++){
            if (j%i == 0){
              b[j] = false;
            }
          }  
        }
      }
      return b; 
    }
}
