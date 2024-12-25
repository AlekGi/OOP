import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine{

    List<BottleOfWater> bottleOfWaterList = new ArrayList<>();

    @Override
    public void initProduct() {
    }

    public void initProduct(List<BottleOfWater> bottleOfWater) {
        this.bottleOfWaterList = bottleOfWater;
    }

    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        for (BottleOfWater el : bottleOfWaterList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return null;
    }

    // private final List<Product>productList;

    // private int money;

    // public BottleOfWaterVendingMachine(List<Product> productList) {
    //     this.productList = productList;
    // }

    // @Override
    // public Product getProduct(String name){
    //     for(Product product: productList){
    //         if(product.getName().equals(name)){
    //             money += product.getPrice();
    //             return product;
    //         }
    //     }
    //     return null;
    // }

    // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder();
    //     sb.append("BottleOfWaterVendingMachine{");
    //     sb.append("productList=").append(productList);
    //     sb.append(", money=").append(money);
    //     sb.append('}');
    //     return sb.toString();
    // }

    // public BottleOfWater getProduct(String name, int volume){
    //     for (Product product: productList){
    //         if (product instanceof BottleOfWater){
    //             if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume){
    //                 return(BottleOfWater) product;
    //             }
    //         }
    //     }
    //     return null;
    // }


}
