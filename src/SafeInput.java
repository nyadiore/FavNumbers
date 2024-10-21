import java.util.Scanner;

public class SafeInput {

    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                valid = true;
            } else {
                System.out.println("That's not a valid integer.");
                pipe.next(); // clear the invalid input
            }
        }
        pipe.nextLine(); // clear the newline
        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0.0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                valid = true;
            } else {
                System.out.println("That's not a valid double.");
                pipe.next(); // clear the invalid input
            }
        }
        pipe.nextLine(); // clear the newline
        return retDouble;
    }
}
