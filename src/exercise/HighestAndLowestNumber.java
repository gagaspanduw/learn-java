package exercise;

import java.util.Scanner;

public class HighestAndLowestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number #1");
        int number1 = scanner.nextInt();
        System.out.println("Input number #2");
        int number2 = scanner.nextInt();

        if(number1 > number2){
            System.out.println("Highest number is " + number1);
            System.out.println("Lowest number is " + number2);
        }
        else{
            System.out.println("Highest number is " + number2);
            System.out.println("Lowest number is " + number1);
        }
    }
}
