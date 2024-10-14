import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Swap logic
        double temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
