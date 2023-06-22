import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double physics, math, chemical, turkish, music,total = 0;
        int numberOfLessons = 0 ;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your physics grade: ");
        physics = input.nextInt();
        if (physics <= 100 && 0 <= physics){
            total += physics;
            numberOfLessons++;
        }

        System.out.println("Enter your math grade: ");
        math = input.nextInt();
        if (math <= 100 && 0 <= math){
            total += math;
            numberOfLessons++;
        }

        System.out.println("Enter your chemical grade: ");
        chemical = input.nextInt();
        if (chemical <= 100 && 0 <= chemical){
            total += chemical;
            numberOfLessons++;
        }

        System.out.println("Enter your turkish grade: ");
        turkish = input.nextInt();
        if (turkish <= 100 && 0 <= turkish){
            total += turkish;
            numberOfLessons++;
        }

        System.out.println("Enter your music grade: ");
        music = input.nextInt();
        if (music <= 100 && 0 <= music){
            total += music;
            numberOfLessons++;
        }

        double average = total/numberOfLessons;

        if (average <= 55){
            System.out.println("You failed the class.");
        }else {
            System.out.println("Congratulations, you passed the class.");
        }

        System.out.println("Your average: " + average);

    }
}