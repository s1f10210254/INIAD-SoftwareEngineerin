package two;

import java.util.ArrayList;
import java.util.List;

public class BeverageCase {
    private List<Beverage> beverages = new ArrayList<Beverage>();

    public void addBeverage(Beverage beverage){
        beverages.add(beverage);
    }
    public int getTotalPrice(){
        int sum = 0;
        for(Beverage b: beverages){
            sum += b.getPriceWithTax();
        }
        return sum;
    }
}
