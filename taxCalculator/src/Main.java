import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating variables
        double amount, tax, taxAmount,taxedPrice;

        // define Scanner class
        Scanner input = new Scanner(System.in);

        // get value from user
        System.out.print("Enter amount: ");
        amount = input.nextInt();
        System.out.print("Enter tax: ");
        tax = input.nextInt();

        // tax processing
        taxAmount = (amount * tax) /100;
        taxedPrice = taxAmount + amount;

        // information area
        System.out.println("Taxed amount: " + tax);
        System.out.println("Tax free price: " + amount);
        System.out.println("Taxed price: " + taxedPrice);
    }
}