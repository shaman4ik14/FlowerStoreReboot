package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import application.payments.CreditCardPaymentStrategy;
import application.payments.PayPalPaymentStrategy;

public class PayTests {
    private CreditCardPaymentStrategy creditCard = new CreditCardPaymentStrategy();;
    private PayPalPaymentStrategy payPal = new PayPalPaymentStrategy();

    @Test
    public void testPaymentStrategies() {
        Assertions.assertTrue(creditCard.pay(1.0));
        Assertions.assertTrue(payPal.pay(2.0));
    }
}
