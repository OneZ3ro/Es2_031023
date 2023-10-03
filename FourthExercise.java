import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------- Exercise 1 ----------");
        System.out.println("--> Program countdown");
        System.out.println("· Type your start num: ");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.println("Starting countdown...");
        for (int i = num1; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Program completed successfully");

        input.close();
    }
}
