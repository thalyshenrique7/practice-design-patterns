package strategyPattern.models;

import strategyPattern.interfaces.PaymentStrategy;

public class BankTransferPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment US$ " + amount + ", method chosen: Bank Transfer");
    }
}
