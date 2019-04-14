package me.gaforov;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What was your overall grade percentage?");
        int grade = input.nextInt();

        if (grade > 60) {
            System.out.println("Congrats, you're admitted!");
        } else if (grade > 50) {
            System.out.println("You are on waiting list.");
        } else {
            System.out.println("Sorry, you are not admitted. Try the test again.");
        }

    }
}
