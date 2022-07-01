import java.io.*;
import java.util.*;

public class Nim 
{
  public static void main (String [] arg) 
  {
    int stones = 12;
    int stonesTaken;

    Scanner input = new Scanner(System.in);
    
    //loop until game ends

    System.out.println("Let's play Nim!  This version you have 12 stones to begin and the last player to take a stone wins!  You can remove between 1 and 3 stones.");
    //while(){
      //prompt user for number of stones they wish to remove each turn
      System.out.println("How many stones do you wish to remove?");
      stonesTaken = input.nextInt();
      input.nextLine();
      if stonesTaken >0 && stonesTaken < 4 
        else
        
      //calculate number of stones remaining-print
      //check for win
      //machine take a turn
      //calculate number of stones remaining
      //check machine win
    //}
  }  
}