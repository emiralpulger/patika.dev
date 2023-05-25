import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating variables
        double km, perKm = 2.20, minPrice = 20,startPrice = 10, totalPrice;

        // define the Scanner Class
        Scanner input = new Scanner(System.in);

        // get value from user
        System.out.println("how many kilometers traveled? : ");
        km = input.nextInt();

        // business
        totalPrice = startPrice + km*perKm;

        if (totalPrice > minPrice){
            System.out.println(totalPrice);
        }
        else {
            System.out.println(minPrice);
        }
    }
}