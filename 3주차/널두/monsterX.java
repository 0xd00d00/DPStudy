package com.company;

public class monsterX extends Buger{
    public monsterX() {
        description = "monsterX buger";
    }

    @Override
    public double calo() {
        //System.out.println("800 calo");
        return 800;
    }

    @Override
    public double cost() {
        //System.out.println("8000 cost");
        return 8000;
    }
}
