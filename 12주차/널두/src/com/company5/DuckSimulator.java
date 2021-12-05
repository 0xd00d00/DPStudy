package com.company5;


// Compound pattern.. 패턴 섞어 사용하기
// 일련의 패턴을 함께 사용하여, 문제를 적절히 해결해나가는 과정을 알아보자.

// Duck Simulator

// 만약 오리의 꽥 횟수를 확인해 영양관리를 해야한다고 해봅시다. 그럴 경우 기존 클래스를 변경하지 않고,
// 기능을 추가하기 위해 어떤 기능을 사용해야할까요?

public class DuckSimulator {
    public static void main(String[] args) {
	// write your code here
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        // 드리즐 추가를 생각해봅시다.
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        // Adaptor!!!
        Quackable gooseDuck = new GooseAdaptor(new Goose());

        System.out.println("\nDuck Simulator");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator -> whole");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        //System.out.println("\nDuck Simulator -> Mallards");
        //simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times ");

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

// 여기서 문제..
// 오리를 생성할 때, 제대로 포장되지 않으면 셀 수 없는거아니야?
// 예를 들어, 1,2,3,4 개의 오리가 있는데, 1,2,3 만 포장되면 어째?
// 생성하는 부분을 몰자..
// 만드는 부분에서 관리하도록 하자.

// 여기도 또 문제..
// 오리 떼 만들자.
// Composite pattern 부분적으로 빼내자.
// 특정 종만 분류 하고 싶다..

// 여기서 문제
// 컴포짓 패턴이 잘돌아감.
// 개별적인 행동을 관찰하고 싶을 경우..