package com.company1;

import com.company1.Quackable;

public class GooseAdaptor implements Quackable {
    Goose goose;

    public GooseAdaptor(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
