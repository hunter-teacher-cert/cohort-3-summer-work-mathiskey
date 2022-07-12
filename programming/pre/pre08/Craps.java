import java.util.Random;

public class Craps {

  public static void main (String[] args) {
    //System.out.println("Let's play Craps!");
    //System.out.println(round());
    for (int i = 0; i < Integer.parseInt(args[0]); i++) {
      round(); 
    }         
  }
  
  public static int roll(int n) {
    Random random = new Random(); 
    int die1 = random.nextInt(n) + 1;

    return die1;
  }

  public static int shoot(int numDice, int maxValue) {
    
    int sum = 0;
    for (int i = 0; i < numDice; i++) {
      sum = sum + roll(maxValue); 
      }   
        
    return sum;
  }

  public static boolean round() {
    int point = shoot(2, 6);
    System.out.println("Your point is " + point + ".");
    if (point == 2 || point == 3 || point == 12) {
      System.out.println("You lost:(\n");
      return false;
    }
    else if (point == 7 || point == 11) {
      System.out.println("You won!!\n");
      return true;
    }
    else {
      while (true){
        int nextRoll = shoot(2, 6);
        System.out.println("Your next roll is " + nextRoll + ".");
        if (nextRoll == point) {
          System.out.println("You won!!\n");
          return true;
        }
        else if (nextRoll == 7){
          System.out.println("You lost:(\n");
          return false;
        }
      }  
    }    
  }
}
