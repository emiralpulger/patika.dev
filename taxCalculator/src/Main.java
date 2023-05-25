import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating variables
        double amount, taxAmount,taxedPrice = 0;

        // define Scanner class
        Scanner input = new Scanner(System.in);

        // get value from user
        System.out.print("Enter amount: ");
        amount = input.nextDouble();
        
        if (amount > 0 && amount <= 1000){
            taxAmount = (amount * 18) /100;
            taxedPrice = taxAmount + amount;
        } else if (amount > 1000) {
            taxAmount = (amount * 8) /100;
            taxedPrice = taxAmount + amount;
        }

        // information area
        System.out.println("Tax free price: " + amount);
        System.out.println("Taxed price: " + taxedPrice);
    }
}