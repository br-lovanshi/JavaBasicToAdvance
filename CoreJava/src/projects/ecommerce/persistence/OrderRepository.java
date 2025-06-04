package projects.ecommerce.persistence;

import projects.ecommerce.exception.NotFoundException;
import projects.ecommerce.models.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<Order> orders = new ArrayList<>();

    public void save(Order order){
        orders.add(order);
    }

    public Order findById(int id){
        return orders.stream().filter(order -> order.getId() == id).findFirst().orElseThrow(() -> new NotFoundException("Order not found."));
    }

    public List<Order> getAllOrder(){
        return orders;
    }

}
