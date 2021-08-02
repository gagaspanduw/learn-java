package chapter11.farm;

public class Farm {
    public static void main(String[] args) {
        Animal duck = new Duck("Duck sounds");
        duck.eat();
        System.out.println(duck.makeSound());

        Animal pig = new Pig("Pig sounds");
        pig.eat();
        System.out.println(pig.makeSound());
    }
}
