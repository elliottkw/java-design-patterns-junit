package com.qosoft.designpatterns.creational.factorymethod;

public class CardPayment implements Payment {

    @Override
    public String doPayment() {
        return "Pagando con Tarjeta de Crédito";
    }
}
