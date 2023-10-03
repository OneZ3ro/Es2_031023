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
        input.close();
    }

    public static boolean stringEvenOrOdd(String str){
        return str.length() % 2 == 0;
    }
}
