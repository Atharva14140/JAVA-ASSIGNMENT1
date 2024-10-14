import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Binary to Decimal or 2 for Decimal to Binary:");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter a binary number:");
            String binary = sc.next();
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal equivalent: " + decimal);
        } else if (choice == 2) {
            System.out.println("Enter a decimal number:");
            int decimal = sc.nextInt();
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary equivalent: " + binary);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
