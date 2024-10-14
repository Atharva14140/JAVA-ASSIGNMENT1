import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert Celsius to Fahrenheit or 2 for Fahrenheit to Celsius:");
        int choice = sc.nextInt();
        
        if (choice == 1) {
            System.out.println("Enter temperature in Celsius:");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 2) {
            System.out.println("Enter temperature in Fahrenheit:");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid option.");
        }
    }
}
