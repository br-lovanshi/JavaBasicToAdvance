Package StreamAPI;
import java.util.*;


class Products{
    private int id;
    private String name;
    private Float price;

    Products(int id, String name, Float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }
}
class JavaStreamExample1{
    
    public static void main(String[] args){
        
        List<Products> productsList = new ArrayList<>();

        
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  


        List<Float> priceList = new ArrayList<>();

        for(Products product:productsList){
            if(product.price<30000){
                priceList.add(product.price);
            }
        }

        System.out.println(priceList);
    }
}