package chapter11.farm;

public class Pig extends Animal {

    private String pigSound;

    public String getPigSound() {
        return pigSound;
    }

    public void setPigSound(String pigSound) {
        this.pigSound = pigSound;
    }

    public Pig(String pigSound){
        setPigSound(pigSound);
    }

    @Override
    String makeSound(){
        return pigSound;
    }
}
