package projects.ecommerce.service;

import projects.ecommerce.models.Order;
import projects.ecommerce.models.Product;
import projects.ecommerce.models.User;

import java.util.List;

public interface OrderService {
    void placeOrder(List<Product> productList, User user);
    Order getOrderById(int id);
    List<Order> getAllOrder();
}
