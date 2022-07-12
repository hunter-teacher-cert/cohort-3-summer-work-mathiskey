import java.util.Scanner;

/**Converts Celsius to Fahrenheit.*/

public class Celsius {

    public static void main(String[] args) {
        // Input temperature in Celsius from user 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double C = in.nextDouble();
        
        // Convert and print result
        double F = C * (9f / 5) + 32;
        System.out.printf("%.1f C = %.1f F", C, F);
    }
}        
