package chapter9.cake;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake(){
        setFlavor("Strawberry");
        setPrice(325000);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

}
