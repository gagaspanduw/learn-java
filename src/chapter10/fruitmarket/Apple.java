package chapter10.fruitmarket;

public class Apple extends Fruit{

    public Apple(){
        setCalories(800);
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice");
    }

    public void removeSeeds(){
        System.out.println("Remove apple seeds");
    }
}
