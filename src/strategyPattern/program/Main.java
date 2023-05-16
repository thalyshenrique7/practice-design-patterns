package strategyPattern.program;

import strategyPattern.interfaces.PaymentStrategy;
import strategyPattern.models.*;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Iphone", 999);
        Product p2 = new Product("Nike Shoes", 120);
        ShoppingCart shoppingCart = new ShoppingCart();
        PaymentStrategy paymentCreditCard = new CreditCardPayment();
        PaymentStrategy paymentBankTransfer = new BankTransferPayment();
        PaymentStrategy paymentPayPal = new PayPalPayment();

        shoppingCart.addProduct(p1);
        shoppingCart.addProduct(p2);
        shoppingCart.calculateTotal();
        shoppingCart.setPaymentStrategy(paymentBankTransfer);
        shoppingCart.checkout();

        shoppingCart.calculateTotal();
        shoppingCart.setPaymentStrategy(paymentPayPal);
        shoppingCart.checkout();

        shoppingCart.calculateTotal();
        shoppingCart.setPaymentStrategy(paymentCreditCard);
        shoppingCart.checkout();
    }
}
