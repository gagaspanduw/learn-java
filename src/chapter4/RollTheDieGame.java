package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int maxRolls = 5;
        int lastSpace = 20;
        int currentSpace = 0;

        System.out.println("Welcome to Roll the Die Game!");

        for (int i = 1; i <= maxRolls; i++) {
            int die = random.nextInt(6) + 1;
            System.out.println("Press enter to roll dice");
            String enters = scanner.nextLine();
                currentSpace = currentSpace + die;
                System.out.print("Roll #" + i + ": You've rolled a " + die);

                if (currentSpace == lastSpace){
                    System.out.print(". You are now on space " + currentSpace + ". Congrats ! You win !");
                    break;
                }
                else if (currentSpace > lastSpace){
                    System.out.print(". You are now on space " + currentSpace + ". You lose");
                    break;
                }
                else if (i==maxRolls && currentSpace < lastSpace){
                    System.out.println(". You are now on space " + currentSpace + ". You lose");
                }
                else {
                    int lessSpace = lastSpace - currentSpace;
                    System.out.print(". You are now on space " + currentSpace + " and have " + lessSpace + " more to go.");
                }
                System.out.println();
        }
    }
}
