package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printDays();
    }

    public static String getDayOfTheWeek(int days){
        switch (days){
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Invalid Days";
        }
    }

    public static int setInputDays(){
        System.out.println("Input number for days:");
        int inputDays = scanner.nextInt();
        return inputDays;
    }

    public static void printDays(){
        System.out.println(getDayOfTheWeek(setInputDays()));
    }

}
