package projects.ecommerce.service;

import projects.ecommerce.models.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    void deleteProduct(int id);
    Product getProductById(int id);
    List<Product> getAllProducts();

}
