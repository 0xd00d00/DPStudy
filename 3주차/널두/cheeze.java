package com.company;

public class cheeze extends IDecorator{

    public cheeze(Buger b) {
        buger = b;
    }

    public String getDescription() {
        return buger.description + "cheeze";
    }

    @Override
    public double calo() {
        System.out.println("+100 calo");
        return buger.calo() + 100;
    }

    @Override
    public double cost() {
        System.out.println("+1000 cost");
        return buger.cost() + 1000;
    }
}
