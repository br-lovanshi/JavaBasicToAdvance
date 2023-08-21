package StreamAPI;

class Product{
    int id;
    String name;
    Float price;

    public Product(int id, String name, Float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
class JavaStreamExample2{

    public static void main(String[] args){
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"Lava blaz",10000));
        productList.add(new Product(14,"Lava blaz",50000));

        productList.add(new Product(3,"Lava blaz",30000));

        productList.add(new Product(2,"Lava blaz",40000));
    List<Float> productPriceList = productList.stream().
                                                filter(p-> p.price > 20000)
                                                .map(p->p.price)
                                                .collect(Collectors.toList());

    System.out.println(productPriceList);                                             
        
    }
}