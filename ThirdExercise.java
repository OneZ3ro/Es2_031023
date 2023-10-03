import java.util.Objects;
import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        myLoop();
    }

    public static void myLoop () {
        String uStr = "";
        Scanner input = new Scanner(System.in);
        System.out.println("---------- Exercise 1 ----------");
        System.out.println("--> Program is running until you type :q ");
        myloop:
        while (true) {
            System.out.println("· Type: ");
            uStr = input.nextLine();
            if(uStr.length() < 2) {
                System.out.println("You typed: " + uStr);
            } else {
                String[] parts = uStr.split("");
                String joinString1=String.join(",", parts);
                for (int i = 0; i < parts.length; i++) {
                    int cont = 0;
                    boolean bol1 = false;
                    boolean bol2 = false;
                    boolean bol3 = false;
                    if (parts[i].equals(":")){
                        bol1 = true;
                        cont = i;
                    }

                    if (parts[cont + 1].equals("q")){
                        bol2 = true;
                    }

                    if ((cont + 2) == parts.length){
                        bol3 = true;
                    }

                    if (bol1 && bol2 && bol3) {
                        System.out.println("You are exiting... ");
                        break myloop;
                    }
                    if (i == parts.length - 1){
                        System.out.println("You typed: " + joinString1);
                    }
                }
            }
        }

        System.out.println("Program completed successfully");

        input.close();
    }
}
