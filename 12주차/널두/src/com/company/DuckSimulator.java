package com.company;


// Compound pattern.. 패턴 섞어 사용하기
// 일련의 패턴을 함께 사용하여, 문제를 적절히 해결해나가는 과정을 알아보자.

// Duck Simulator
public class DuckSimulator {
    public static void main(String[] args) {
	// write your code here
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new Duckcall();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
