import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        heat = input.nextInt();

        if (heat >= 25){
            System.out.println("You can go swimming.");
        }else if (heat >= 15){
            System.out.println("You can go on a picnic.");
        }else if (heat >= 5){
            System.out.println("You can go to the cinema.");
        }else {
            System.out.println("You can ski.");
        }
    }
}