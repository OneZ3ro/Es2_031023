import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------- Exercise 1 ----------");
        System.out.println("--> Program your number in string if it is between 0 and 3 ");
        System.out.println("· Type your number:");
        int num1 = Integer.parseInt(input.nextLine());
        String result1 = numToString(num1);
        System.out.println("Result: " + result1);

        input.close();
    }

    public static String numToString(int num) {
        switch (num) {
            case 0:
                return "Zero";

            case 1:
                return "One";

            case 2:
                return "Two";

            case 3:
                return "Three";

            default:
                return "Your number is not between 0 and 3";
        }
//        return switch (num) {
//            case 0 -> "Zero";
//            case 1 -> "One";
//            case 2 -> "Two";
//            case 3 -> "Three";
//            default -> "Your number is not between 0 and 3";
//        };
    }
}
