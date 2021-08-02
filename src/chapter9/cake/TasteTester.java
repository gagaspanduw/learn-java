package chapter9.cake;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        BirthdayCake birthdayCake = new BirthdayCake();
        WeddingCake weddingCake = new WeddingCake();

        cake.setPrice(275000);
        cake.setFlavor("Chocolate");
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: Rp" + birthdayCake.getPrice());

        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: Rp" + weddingCake.getPrice());
    }
}
