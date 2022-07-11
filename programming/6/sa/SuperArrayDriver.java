  import java.io.*;
  import java.util.*;
  
  public class SuperArrayDriver
  {
    public static void main( String[] args )
    {
      
      System.out.println("Testing default constructor.");
      SuperArray sa = new SuperArray(10);
      //System.out.println("Testing empty print:");
      System.out.println("\nMemory location of sa:");
      System.out.println(sa);
      System.out.println("\n Testing isEmpty (should be true)");
      System.out.println(sa.isEmpty());
      
      //System.out.println(sa);
  
      //testing out array locations in memory
      SuperArray sa2 = new SuperArray(12);
      System.out.println("\nMemory location of sa2:");
      System.out.println(sa2);
      sa = sa2;
      System.out.println("\nMemory location of sa after sa = sa2:");
      System.out.println(sa);
  
      // -----------------------------------------------------------
      // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
      // -----------------------------------------------------------
      //precondition: newly-instantiated SuperArray of default capacity
      System.out.println("\nTesting overfill (calling grow() in add)");
      for (int i=0; i<15; i++) {
        sa.add(i);
      }//for i
   
      System.out.print("Is sa empty now? " + sa.isEmpty());
      System.out.println(sa.debug());
      
  
      //test the get() accessor method
      System.out.println("What is in element 14? " + sa.get(14));
  
      
  
      
      System.out.println("\nTesting add at index 5, 0 and 17(end)");
      sa.add(5, 100);
      System.out.println(sa.debug());
      sa.add(0, 100);
      System.out.println(sa.debug());
      sa.add(17, 100);
      System.out.println(sa.debug());
     /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

      System.out.println("\nTesting remove at 0, 5, and 15 ");
      sa.remove(0);
      System.out.println(sa.debug());
      sa.remove(5);
      System.out.println(sa.debug());
      sa.remove(15);
      System.out.println(sa.debug());

  
    }//main
  
  }//class SuperArrayDriver