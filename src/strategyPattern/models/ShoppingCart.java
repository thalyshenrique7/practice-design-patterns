package strategyPattern.models;

import strategyPattern.interfaces.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;
    private List<Product> productList;

    public ShoppingCart() {
        productList =  new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    public double calculateTotal(){
        double total = 0;
        for(Product p : productList){
            total += p.getPrice();
        }

        return total;
    }

    public void checkout(){
        double total = calculateTotal();
        paymentStrategy.pay(total);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

}
