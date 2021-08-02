package chapter3;

import java.util.Scanner;

public class RupiahExchange {
    public static void main (String args[]){

        System.out.println("What type rupiah do you have ?");
        Scanner scanner = new Scanner(System.in);
        double typeRupiah1 = scanner.nextDouble();

        System.out.println("How much do you have ?");
        int countRupiahType1 = scanner.nextInt();

        System.out.println("What other type of rupiah do you have ?");
        double typeRupiah2 = scanner.nextDouble();

        System.out.println("How much do you have ?");
        int countRupiahType2 = scanner.nextInt();

        double totalRupiah = typeRupiah1 * countRupiahType1 + typeRupiah2 * countRupiahType2;


        System.out.println(totalRupiah);

        if (totalRupiah > 100000){
            double overRupiah = totalRupiah - 100000;
            System.out.println("You have over Rp " + overRupiah + " for Rp 100000");
        }
        else if (totalRupiah < 100000){
            double lessRupiah = 100000 - totalRupiah;
            System.out.println("You have less Rp " + lessRupiah + " for Rp 100000");
        }
        else {
            System.out.println("Congrats ! your money equal Rp 100000");
        }
    }
}
