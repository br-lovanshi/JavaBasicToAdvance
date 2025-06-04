package projects.ecommerce.persistence;

import projects.ecommerce.exception.NotFoundException;
import projects.ecommerce.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public void save(Product product){
        products.add(product);
    }

    public Product productById(int id){
        return products.stream().filter(product -> product.getId() == id).findFirst().orElseThrow(() -> new NotFoundException("Product not found."));
    }

    public List<Product> getAll(){
        return products;
    }
}
