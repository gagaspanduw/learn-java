package chapter10.fruitmarket;

public class Banana extends Fruit {

    public Banana(){
        setCalories(500);
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice");
    }

    public void peelBanana(){
        System.out.println("Peel banana skin");
    }

}
