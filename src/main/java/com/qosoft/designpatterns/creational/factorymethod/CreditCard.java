package com.qosoft.designpatterns.creational.factorymethod;

public class CreditCard implements Payment {

    @Override
    public void doPayment() {
        System.out.println("Pagando con Tarjeta de Crédito");
    }
}
