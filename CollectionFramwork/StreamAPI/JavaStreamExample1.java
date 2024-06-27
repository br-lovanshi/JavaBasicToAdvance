
import java.util.*;
import java.util.stream.Collectors;

class Products {
    private int id;
    private String name;
    private Float price;

    Products(int id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }
}

class JavaStreamExample1 {

    public static void main(String[] args) {

        List<Products> productsList = new ArrayList<>();

        productsList.add(new Products(2, "Dell Laptop", 30000f));
        productsList.add(new Products(3, "Lenevo Laptop", 28000f));
        productsList.add(new Products(4, "Sony Laptop", 28000f));
        productsList.add(new Products(5, "Apple Laptop", 90000f));

        // get price list of products whos price is less the 30000
        List<Float> priceList = new ArrayList<>();

        for (Products product : productsList) {
            if (product.getPrice() < 30000) {
                priceList.add(product.getPrice());
            }
        }

        priceList.forEach(System.out::println);

        // Using Stream API
        List<Float> priceList2 = productsList.stream()
                .filter(product -> product.getPrice() > 30000)
                .map(product -> product.getPrice())
                .collect(Collectors.toList());

        priceList2.forEach(System.out::println);
    }
}