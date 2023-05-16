package strategyPattern.test;

import org.junit.Before;
import org.junit.Test;
import strategyPattern.interfaces.PaymentStrategy;
import strategyPattern.models.CreditCardPayment;
import strategyPattern.models.Product;
import strategyPattern.models.ShoppingCart;

import static org.junit.Assert.assertEquals;

public class TestPaymentStrategy {

    Product p1;
    Product p2;
    ShoppingCart shoppingCart;
    PaymentStrategy paymentStrategy;

    @Before
    public void initialize(){
        p1 = new Product("Iphone", 999);
        p2 = new Product("Nike Shoes", 120);

        shoppingCart = new ShoppingCart();
        paymentStrategy = new CreditCardPayment();
        shoppingCart.addProduct(p1);
        shoppingCart.addProduct(p2);
        shoppingCart.calculateTotal();
        shoppingCart.setPaymentStrategy(paymentStrategy);
        shoppingCart.checkout();
    }

//    @Test
//    public void testBankTransferPayment(){
//        double totalCart = shoppingCart.calculateTotal();
//
//        assertEquals(1119, totalCart, 0);
//    }
//
//    @Test
//    public void testPayPalPayment(){
//        double totalCart = shoppingCart.calculateTotal();
//
//        assertEquals(1119, totalCart, 0);
//    }

    @Test
    public void testCreditCardPayment(){
        double calculateInterest = shoppingCart.calculateTotal() * 5 / 100;
        double totalPlusInterest = calculateInterest + shoppingCart.calculateTotal();

        assertEquals(1174.95, totalPlusInterest, 0);
    }
}
