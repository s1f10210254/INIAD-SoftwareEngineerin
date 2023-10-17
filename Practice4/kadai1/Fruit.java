package kadai1;

public class Fruit {
    public String state = "skiniad";

    public void peel(){
        this.state = "peeled";
    }

    public String getState(){
        return this.state;
    }
}
