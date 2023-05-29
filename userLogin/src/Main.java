import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // create variables
        String username, password, newPassword;

        // define the Scanner Class
        Scanner input = new Scanner(System.in);

        // get value from user
        System.out.print("Enter your Username: ");
        username = input.nextLine();

        System.out.print("Enter your Password: ");
        password = input.nextLine();

        if (username.equals("emiralp") && password.equals("1234")) {
            System.out.println("You are logged in.");
        } else if (username.equals("emiralp") && !password.equals("1234")) {
            System.out.println("You entered the wrong password.\nDo you want to change your password? y/n");
            String select = input.nextLine();
            switch (select) {
                case "y" -> {
                    System.out.print("Enter your new Password: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals(password)) {
                        System.out.println("Your password cannot be the same as the password you entered incorrectly.\n");
                    } else if (newPassword.equals("1234")) {
                        System.out.println("You cannot use your old password.");

                    } else {
                        System.out.println("New password has been created.");
                    }
                }
                case "n" -> System.out.println("Try again, unable to login to the system.");
                default -> System.out.println("You made the wrong choice.");
            }
        }else {
            System.out.println("Username or password is wrong.");
        }
    }
}