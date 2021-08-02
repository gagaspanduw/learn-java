package chapter11.farm;

public class Duck extends Animal{

    private String duckSound;

    public String getDuckSound() {
        return duckSound;
    }

    public void setDuckSound(String duckSound) {
        this.duckSound = duckSound;
    }

    public Duck(String duckSound){
        setDuckSound(duckSound);
    }

    @Override
    String makeSound(){
        return duckSound;
    }
}
