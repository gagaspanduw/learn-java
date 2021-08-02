package chapter13.dividingbyzero;

public class DividingZero {
    public static void main(String[] args) {
        try {
            int c = 30/10;
        }catch (ArithmeticException e){
            System.out.println("Dividing by zero is not permitted");
        }finally {
            System.out.println("Dividing is fun");
        }
    }
}
