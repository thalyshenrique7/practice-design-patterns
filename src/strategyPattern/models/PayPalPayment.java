package strategyPattern.models;

import strategyPattern.interfaces.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment US$ " + amount + ", method chosen: PayPal");
    }
}
