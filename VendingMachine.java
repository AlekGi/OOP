
public interface VendingMachine {

    void initProduct();

    String getProduct();

    // public VendingMachine() {
    //     this.money = money;
    //     this.productList = initProduct();
    // }

    // private List<Product> productList;
    // private Integer money;

    // public Product getProduct(String name){
    //     for(Product product: productList){
    //         if(product.getName().equals(name)){
    //             money += product.getPrice();
    //             return product;
    //         }
    //     }
    //     return null;
    // }

    // private List<Product> initProduct() {
    //     List<Product> products = new ArrayList<>();
    //     products.add(new Product("Молоко", 100));
    //     products.add(new Product("Вода", 50));
    //     products.add(new Product("Сухарики", 30));
    //     return products;
    // }


}
