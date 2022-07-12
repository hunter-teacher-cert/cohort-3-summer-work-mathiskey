import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
        //current time
        int hour = 21;
        int minute = 45;
        int second = 30;
        double percentage = (hour * 3600 + minute * 60 + second)/86400.0 * 100;
        System.out.println("The current time is " + hour + ":" + minute + ":" + second + ".");
        
        //seconds since midnight
        System.out.println("Number of seconds since midnight: " + (hour * 3600 + minute * 60 + second));
        
        //seconds remaining in the day
        System.out.println("Number of seconds remaining in the day: "+ (86400 - (hour * 3600 + minute * 60 + second)));
        
        //percentage of the day that has passed
        System.out.println("Percentage of the day that has passed: " + percentage + "%");
        
    }
}