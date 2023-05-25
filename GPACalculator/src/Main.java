import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating variables
        int math, physics, chemical, turkish, history, music;

        // define the Scanner class
        Scanner input = new Scanner(System.in);

        // get value from user
        System.out.println("Enter your math grade: ");
        math = input.nextInt();

        System.out.println("Enter your physics grade: ");
        physics = input.nextInt();

        System.out.println("Enter your chemical grade: ");
        chemical = input.nextInt();

        System.out.println("Enter your turkish grade: ");
        turkish = input.nextInt();

        System.out.println("Enter your history grade: ");
        history = input.nextInt();

        System.out.println("Enter your music grade: ");
        music = input.nextInt();

        // find grade point average
        int total = math + physics + chemical + turkish + history + music;
        double average = total / 6.0;
        System.out.println("Your average: " + average);

        // valid note
        boolean result = average > 60;
        String str = (result) ? "You passed the class" : "You did not pass the class";
        System.out.println(str);
    }
}