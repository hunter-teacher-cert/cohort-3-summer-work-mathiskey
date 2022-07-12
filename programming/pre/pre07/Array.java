/** Exercise #1*/
import java.io.*;
import java.util.Scanner;

public class Array {

    public static void main (String[] args) {
      double[] squareArray = powArray(new double[]{1,2,3},3);
      int[] counts = histogram (new int []{1, 2, 3}, 5);
      for (int value: counts) {
        System.out.println(value);
      }
    }

    public static double[] powArray (double a[],int z){
      double[] b = new double[a.length];
      for (int i = 0; i < a.length; i++) {
        b[i] = Math.pow(a[i], z);
        System.out.println(b[i]);
      }
      return b;
    }
    public static int[] histogram (int a[], int c){
      int[] counts = new int[c];
      for (int b : a) {
        counts[b]++;
      }
      return counts;
    }
}