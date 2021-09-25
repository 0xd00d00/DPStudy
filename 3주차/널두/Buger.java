package com.company;

public abstract class Buger {
    String description = "Unknown Hambuger";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
    public abstract double calo();
}
