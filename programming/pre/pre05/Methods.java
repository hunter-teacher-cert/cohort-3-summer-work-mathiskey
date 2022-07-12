import java.io.*;
import java.util.*;
  
    public class Methods {

/** Exercise #2*/

      public static boolean  isDivisible(int n, int m) {
          if (n%m == 0) {
              return true;
          } else {
              return false;
          }
      }
      public static void main(String[] args){
        System.out.println(isDivisible(4, 4));
        System.out.println(isTriangle(1,4,5));
        Scanner reader = new Scanner(System.in);
        int m;
        System.out.println("Enter m: ");
        m = reader.nextInt(); 
        int n;
        System.out.println("Enter n: ");
        n = reader.nextInt(); 
        System.out.println("ack(" + m + ", " + n + ") = " + ack(m, n));
      }

/** Exercise #3*/
      public static boolean isTriangle(int a, int b, int c) {
            if (a + b > c && b + c > a && c + a > b){
            return true;
            }
            else {
            return false;
            }   
      }

/** Exercise #8*/
      public static int ack (int m, int n){
              if(m == 0){
                  return  n + 1;
              }
              if(n == 0){
                  return ack(m - 1, 1);
              }
              return ack(m - 1, ack(m, n - 1));
      }
      
}