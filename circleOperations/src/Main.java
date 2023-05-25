import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // define Scanner Class
        Scanner input = new Scanner(System.in);

        // creating variables
        int choice;
        double radius, pi = 3.14;

        System.out.println("""
            What action do you want to do?
            [1] Calculate the area of the circle.
            [2] Calculating the circumference of the circle.
            Make your choice:
            """);

        choice = input.nextInt();

        if (choice == 1){
            System.out.println("Enter the radius: ");
            radius = input.nextDouble();

            double area = radius*radius*pi;
            System.out.println(area);

        } else if (choice == 2) {
            System.out.println("Enter the radius: ");
            radius = input.nextDouble();

            double perimeter = 2*radius*pi;
            System.out.println(perimeter);
        }else {
            System.out.println("You made the wrong choice.");
        }
    }
}