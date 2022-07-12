import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args){
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
      // pick a random number
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randNumber = random.nextInt(100) + 1;
        System.out.print("Type a number: "); 
        int guessNumber = in.nextInt();
        System.out.printf("Your guess is: %d \n", guessNumber);
        System.out.printf(". The number I was thinking of is: %d \n", randNumber);
        System.out.printf(". You were off by: %d \n", Math.abs (randNumber -guessNumber));
      }
}