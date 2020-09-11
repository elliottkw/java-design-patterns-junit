package com.qosoft.designpatterns.creational.factorymethod;

public class GooglePayment implements Payment {
    @Override
    public String doPayment() {
        return "Pagando con Google Payment";
    }
}
