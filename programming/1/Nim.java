import java.io.*;
import java.util.*;

public class Nim 
{
  public static void main (String [] arg) 
  {
    int stones = 12;
    int stonesTaken = 0;

    Scanner input = new Scanner(System.in);
    
    //loop until game ends

    System.out.println("Let's play Nim!  This version you have 12 stones to begin and the last player to take a stone wins!  You can remove between 1 and 3 stones.");
    while(stones >0){
      //prompt user for number of stones they wish to remove each turn
      System.out.println("How many stones do you wish to remove?");
      stonesTaken = input.nextInt();
      input.nextLine();
      if (stonesTaken >0 && stonesTaken < 4){

        //calculate number of stones left 
        stones -= stonesTaken;  //stones = stones - stonesTaken
        
        // check for a winner
        if (stones == 0){
          System.out.println("You won!");
        }
        else {
          System.out.println("Computer's turns.");
          double randomNum = Math.random() * 3;
          int roundedNum = (int ) randomNum;
          roundNum +=1;
          
          stones -= roundNum;
          if (stones == 0){
            System.out.println("You lost!");
          }
        }
      
      } 
      else {
      System.out.println("Number is invalid. You can remove between 1 and 3 stones." );
      }
      //calculate number of stones remaining-print
      //check for win
      //machine take a turn
      //calculate number of stones remaining
      //check machine win
    //}
  }  
}