package chapter9.cake;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake(){
        setFlavor("Grape");
        setPrice(750000);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

}
