import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating variables
        double height, kilo, bmi;

        // define the Scanner Class
        Scanner input = new Scanner(System.in);

        // get value from user
        System.out.print("Enter your height(m): ");
        height = input.nextDouble();

        System.out.print("Enter your kilo(kg): ");
        kilo = input.nextDouble();

        // business
        bmi = kilo/(height*height);
        System.out.println("Your body mass index: " + bmi);
    }
}