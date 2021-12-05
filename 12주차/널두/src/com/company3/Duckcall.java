package com.company3;

// 사냥꾼을 쫓기 위함.
public class Duckcall implements Quackable {
    @Override
    public void quack() {
        System.out.println("kwak");
    }
}
