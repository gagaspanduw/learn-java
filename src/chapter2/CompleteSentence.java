package chapter2;

import java.util.Scanner;

public class CompleteSentence {
    public static void main (String args[]){
        System.out.println("Enter the seasons of the year");
        Scanner scanner = new Scanner(System.in);
        String seasons = scanner.next();

        System.out.println("Enter the whole numbers");
        int wholeNumbers = scanner.nextInt();

        System.out.print("Enter an adjective words");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("on a " + adjective + " " + seasons + " day, I drink a minimum of " + wholeNumbers + " cups of coffee.");

    }
}
