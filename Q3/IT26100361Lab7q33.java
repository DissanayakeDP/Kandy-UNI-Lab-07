import java.util.Scanner;

public class IT26100361Lab7q33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char payment = input.next().charAt(0);

            payment = Character.toUpperCase(payment);

            while (payment != 'C' && payment != 'O') {
                System.out.println("Payment Mode is Not Valid");

                System.out.print("Enter mode of payment (C for cash, O for other): ");
                payment = input.next().charAt(0);
                payment = Character.toUpperCase(payment);
            }

            if (payment == 'C') {
                double discount = bill * 0.05;
                double amount = bill - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amount);
            } else {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + bill);
            }

            System.out.println();
        }

        input.close();
    }
}
