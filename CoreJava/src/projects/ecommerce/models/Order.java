package projects.ecommerce.models;

import java.util.List;

public class Order {
    private int id;
    private User user;
    private List<Product> productList;

    public Order(){

    }

    public Order(int id, User user, List<Product> productList) {
        this.id = id;
        this.user = user;
        this.productList = productList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", productList=" + productList +
                '}';
    }
}
