import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    
    List<HotDrink> hotDrinkList = new ArrayList<>();

    @Override
    public void initProduct() {
    }

    public void initProduct(List<HotDrink> list) {
        this.hotDrinkList = list;
    }

    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        for (HotDrink el : hotDrinkList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return null;
    }
}
