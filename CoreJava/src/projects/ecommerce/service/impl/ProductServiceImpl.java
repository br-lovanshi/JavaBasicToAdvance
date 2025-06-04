package projects.ecommerce.service.impl;

import projects.ecommerce.models.Product;
import projects.ecommerce.persistence.ProductRepository;
import projects.ecommerce.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public void addProduct(Product product) {
        int id = 1;
        product.setId(id++);
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public Product getProductById(int id) {
        return productRepository.productById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAll();
    }
}
