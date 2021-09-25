package com.company;

public class Main {
        public static void main(String args[]) {
                // 상황. 여기는 햄버거 가게입니다. 손님들은 일반 버거를 구매 거나, 토핑을 추가할수도 있습니다.
                // 손님A는 다음을 주문한다고 합니다.
                // 몬스터X 단품.
                // 손님B는 다음을 주문한다고 합니다.
                // 와퍼 1개에 치즈 및 베이컨 추가.

                // 이런 상황에서, 손님에게 주문 건에 대한 설명, 비용, 칼로리를 알려주려고 합니다.

                //문제 1.
                // 데코레이터 패턴을 고려하여 uml 을 작성하세요.

                Buger b = new monsterX();
                System.out.println(b.getDescription());
                System.out.println(b.cost());
                System.out.println(b.calo());

                Buger b2 = new cheeze(new wapper());
                System.out.println(b2.getDescription());
                System.out.println(b2.cost());
                System.out.println(b2.calo());
                // 문제 2.
                // 다음과 같은 내용을 출력하세요.
                // 손님 A 주문 사항입니다.
                // 제품 : 몬스터 X
                // 칼로리 : 800kcal
                // 가격 : 8000원.

                // 손님 B 주문 사항입니다.
                // 제품 : 와퍼 + 치즈 + 베이컨
                // 칼로리 :  700 kca
                // 가격 :  7000원.

        }
}

