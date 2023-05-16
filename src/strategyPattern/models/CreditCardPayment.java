package strategyPattern.models;

import strategyPattern.interfaces.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        // For credit card payments I will add 5% interest
        double calculateInterest = amount * 5 / 100;
        double totalAmount = calculateInterest + amount;
        System.out.println("Payment US$ " + totalAmount + ", method chosen: Credit Card");
    }
}
