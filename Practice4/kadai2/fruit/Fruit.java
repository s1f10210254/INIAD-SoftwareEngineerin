package fruit;

public class Fruit {
    protected String state = "skiniad";
    protected int priceNumber = 1;

    public void peel(){
        this.state = "peeled";
    }

    public String getState(){
        return this.state;
    }

    public int getPriceNumber(){
        return this.priceNumber;
    }

    public void cut(){
        priceNumber *= 2;
    }
}