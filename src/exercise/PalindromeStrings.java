package exercise;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text");
        String palindrome = scanner.next().toLowerCase();
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();
        String rev = sb.toString();
        if(palindrome.equals(rev)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
