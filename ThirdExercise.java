import java.util.Objects;
import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        String uStr = "";
        Scanner input = new Scanner(System.in);
        System.out.println("---------- Exercise 1 ----------");
        System.out.println("--> Program is running until you type :q ");

        while (true) {
            System.out.println("· Type: ");
            uStr = input.nextLine();
            if (uStr.equals(":q")) {
                System.out.println("You are exiting... ");
                break;
            }
            else {
                System.out.println("You typed: " + uStr);}
        }
        System.out.println("Program completed successfully");

        input.close();
    }
}
