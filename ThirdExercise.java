import java.util.Objects;
import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        String uStr = "";
        Scanner input = new Scanner(System.in);
        System.out.println("---------- Exercise 1 ----------");
        System.out.println("--> Program is running until you type :q ");
        myloop:
        while (true) {
            System.out.println("· Type: ");
            uStr = input.nextLine();
            String[] parts = uStr.split(", ");
            for (int i = 0; i < parts.length; i++) {
                System.out.println("You typed: " + parts[i]);
                if (parts[i].equals(":q")) {
                    System.out.println("You are exiting... ");
                    break myloop;
                }
            }
        }

        System.out.println("Program completed successfully");

        input.close();
    }
}
