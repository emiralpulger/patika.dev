import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // crating variables
        int n1, n2, choice, result;

        // define the Scanner Class
        Scanner input = new Scanner(System.in);

        // process selection
        System.out.print("""
                [1] Addition
                [2] Subtraction
                [3] Multiplication
                [4] Division
                What action do you want to do? :
                """);

        // get value from user
        choice = input.nextInt();
        
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        switch (choice) {
            case 1 -> {
                result = n1 + n2;
                System.out.println(result);
            }
            case 2 -> {
                result = n1 - n2;
                System.out.println(result);
            }
            case 3 -> {
                result = n1 * n2;
                System.out.println(result);
            }
            case 4 -> {
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println(result);
                } else {
                    System.out.println("A number cannot be divided by zero.");
                }
            }
            default -> System.out.println("Wrong Choice!");
        }
    }
}