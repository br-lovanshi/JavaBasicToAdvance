package projects.ecommerce;

import projects.ecommerce.exception.NotFoundException;
import projects.ecommerce.models.Order;
import projects.ecommerce.models.Product;
import projects.ecommerce.models.User;
import projects.ecommerce.service.OrderService;
import projects.ecommerce.service.ProductService;
import projects.ecommerce.service.UserService;
import projects.ecommerce.service.impl.OrderServiceImpl;
import projects.ecommerce.service.impl.ProductServiceImpl;
import projects.ecommerce.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ECommerceApplication {
    public static void main(String[] args) {
        System.out.println("Ecommerce Application\n\n");

        ProductService productService = new ProductServiceImpl();
        Product product = new Product(1, "MacBook Pro", 170000.0);
        Product product1 = new Product(1, "Dell Inspiron", 40000.00);
        productService.addProduct(product);
        productService.addProduct(product1);
        System.out.println("\nAll Products: \n");
        List<Product> productList = productService.getAllProducts();
        productList.forEach(p -> System.out.println(p.toString()));
        UserService userService = new UserServiceImpl();
        userService.save(new User(1, "Vicky", "vicky@gmail.com"));
        try{
            System.out.println("\nUser: \n" + userService.getById(1).toString());
        }catch (NotFoundException e){
            System.out.println(e.getMessage());
        }
        OrderService orderService = new OrderServiceImpl();
        List<Product> products = new ArrayList<>();
        try{
            Product cardProduct = productService.getProductById(1);
            products.add(cardProduct);
        }catch (NotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            orderService.placeOrder(products, userService.getById(1));
        }catch (NotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nOrders:");
        List<Order> orderList = orderService.getAllOrder();
        orderList.forEach(order -> System.out.println(order.toString()));
    }
}
