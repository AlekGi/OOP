import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        
        System.out.println("БУТЫЛИРОВАНЫЕ НАПИТКИ");
        
        BottleOfWaterVendingMachine bottleVM = new BottleOfWaterVendingMachine();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
            new BottleOfWater("Кола", 15, 1),
            new BottleOfWater("Фанта", 15, 2),
            new BottleOfWater("Спрайт", 15, 5),
            new BottleOfWater("Черноголовка", 15, 2)));
        bottleVM.initProduct(bottleList);
        System.out.println(bottleVM.getProduct());

        System.out.println("ГОРЯЧИЕ НАПИТКИ");
        
        HotDrinkVendingMachine hotDrinkVM = new HotDrinkVendingMachine();
        List<HotDrink> hotDrinklist = new ArrayList<>(Arrays.asList(
            new HotDrink("Кофе", 15, 1),
            new HotDrink("Чай", 15, 2),
            new HotDrink("Горячий шоколад", 15, 3),
            new HotDrink("Компот", 15, 4)));
        hotDrinkVM.initProduct(hotDrinklist);
        System.out.println(hotDrinkVM.getProduct());
    }

    
}