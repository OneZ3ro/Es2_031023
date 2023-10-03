import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------- Exercise 1 ----------");
        System.out.println("--> Program return true if length of a string is even else false");
        System.out.println("· Type your string:");
        String uStr = input.nextLine();
        boolean result1 = stringEvenOrOdd(uStr);
        System.out.println("Result: " + result1 + (result1 ? " (Even)" : " (Odd)"));

        System.out.println("---------- Exercise 2 ----------");
        System.out.println("--> Program return true if your year is a leap year else false");
        System.out.println("· Type your year:");
        int uYear = Integer.parseInt(input.nextLine());
        boolean result2 = leapYear(uYear);
        System.out.println("Result: " + result2 + (result2 ? " (Leap Year)" : " (Not a Leap Year)"));
        input.close();
    }

    public static boolean stringEvenOrOdd(String str){
        return str.length() % 2 == 0;
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
