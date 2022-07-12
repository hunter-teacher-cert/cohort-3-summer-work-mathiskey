import java.io.*;
import java.util.*;

public class Date {
    public static void main(String[] args){
        String day = "Friday";
        int date = 4;
        String month = "March";
        int year = 2022;
        System.out.println ("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println ("European format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}