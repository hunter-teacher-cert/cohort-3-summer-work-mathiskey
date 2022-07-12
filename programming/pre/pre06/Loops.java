import java.io.*;
import java.util.Scanner;

/** Exercise #2*/
public class Loops {
     
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        System.out.println("Enter your guess: ");
        a = in.nextInt(); 
        System.out.println(squareRoot(a));
        iterativePower();
        System.out.println("Factorial of 5 (I): "+ iterativeFactorial(5));
    } 
  
    public static double squareRoot(double a)  {
      double guess = a/2;
      double improvedGuess = (guess + (a/guess))/2;
  
        while (Math.abs((guess - improvedGuess)) > 0.0001) {
        guess = improvedGuess;
        improvedGuess = (guess + (a/guess))/2;
        } 
        return improvedGuess;    
    }

/** Exercise #3 */ 
    public static void iterativePower ()  {
        Scanner in = new Scanner(System.in);
        System.out.println("Base: ");
        double x = in.nextInt(); 
            
        System.out.println("Exponent: ");
        double n = in.nextInt(); 
        int i = 1;
        while(n > 0){
            i *= x;
            n--;
        }  
    System.out.println("Your base raised to the exponent is "+ i);
         
    }

/** Exercise #4*/
  public static int iterativeFactorial(int n){
		int result=1;
    int i=1; // INITIALIZION
		while(i<=n){ // TEST
			result=result*i; // INCREMENT
			i++; // INCREMENT
		}
    return result;
		
    
	} 
  

}