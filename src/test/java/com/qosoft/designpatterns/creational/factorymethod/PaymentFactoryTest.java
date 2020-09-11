package com.qosoft.designpatterns.creational.factorymethod;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PaymentFactoryTest {
    Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);

    @Test
    public void paymentTest() {
        String expected = "Pagando con Tarjeta de Crédito";
        String actual = payment.doPayment();
        assertEquals(expected, actual);
    }
}
