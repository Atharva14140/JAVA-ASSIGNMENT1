import java.util.Scanner;

class Commission {
    private double sales;

    public Commission(double sales) {
        if (sales < 0) {
            System.out.println("Invalid Input");
            this.sales = 0;
        } else {
            this.sales = sales;
        }
    }

    public double commission() {
        return sales * 0.10;  // Example commission rate: 10%
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales amount:");
        double sales = sc.nextDouble();

        Commission commissionObj = new Commission(sales);

        if (sales >= 0) {
            System.out.println("The commission is: " + commissionObj.commission());
        }
    }
}
