import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // define variables
        double pear, apple, tomatoes, banana, aubergine, total;

        // define the Scanner Class
        Scanner input = new Scanner(System.in);

        // get value from user
        System.out.print("How many kilos are the pears? : ");
        pear = input.nextDouble();

        System.out.print("How many kilos are the apple? : ");
        apple = input.nextDouble();

        System.out.print("How many kilos are the tomatoes? : ");
        tomatoes = input.nextDouble();

        System.out.print("How many kilos are the banana? : ");
        banana = input.nextDouble();

        System.out.print("How many kilos are the aubergine? : ");
        aubergine = input.nextDouble();

        // result
        total = pear + apple + tomatoes + banana + aubergine;
        System.out.print("Total weight: " + total);
    }
}