package com.company;

public class wapper extends Buger{
    public wapper() {
        description = "monsterX buger";
    }

    @Override
    public double calo() {
        //System.out.println("700 calo");
        return 500;
    }

    @Override
    public double cost() {
        //System.out.println("500 $");
        return 5000;
    }
}
