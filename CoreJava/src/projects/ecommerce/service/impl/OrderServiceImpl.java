package projects.ecommerce.service.impl;

import projects.ecommerce.models.Order;
import projects.ecommerce.models.Product;
import projects.ecommerce.models.User;
import projects.ecommerce.persistence.OrderRepository;
import projects.ecommerce.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    OrderRepository orderRepository = new OrderRepository();

    @Override
    public void placeOrder(List<Product> productList, User user) {
        int id = 1;
        Order order = new Order();
        order.setId(id++);
        order.setUser(user);
        order.setProductList(productList);
        orderRepository.save(order);
    }

    @Override
    public Order getOrderById(int id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<Order> getAllOrder() {
        return orderRepository.getAllOrder();
    }
}
