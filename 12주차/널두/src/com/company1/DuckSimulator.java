package com.company1;


// Compound pattern.. 패턴 섞어 사용하기
// 일련의 패턴을 함께 사용하여, 문제를 적절히 해결해나가는 과정을 알아보자.

// Duck Simulator


// 만약 시뮬레이터에 거위를 추가하고 싶다면 어떻게 해야할까??
// 거위는 Quack을 내지 않고, Honk로 웁니다...

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

        // Adaptor!!!
        Quackable gooseDuck = new GooseAdaptor(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        // Append!
        simulate(gooseDuck);
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}


// 오리 연구자들 등장.
// 소리를 통한 연구를 함.
// 오리 클래스는 그대로 두면서, 오리가 꽥 소리를 낸 횟수를 세려면 어떻게 해야하나?
