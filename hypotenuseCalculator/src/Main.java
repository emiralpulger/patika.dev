import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // crating variables
        int shortEdge, longEdge;
        double hypotenuse;

        // define the Scanner Class
        Scanner input = new Scanner(System.in);

        // get value from user
        System.out.println("Enter the value of the short edge: ");
        shortEdge = input.nextInt();

        System.out.println("Enter the value of the long edge: ");
        longEdge = input.nextInt();

        // calculation
        hypotenuse = Math.sqrt((longEdge*longEdge)+(shortEdge*shortEdge));

        // result
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}