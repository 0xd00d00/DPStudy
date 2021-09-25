package study;

public class BurgerStore {
    public static void main(String args[]) {
        // 상황. 여기는 햄버거 가게입니다. 손님들은 일반 버거를 구매하거나, 토핑을 추가할수도 있습니다. 
        // 손님A는 다음을 주문한다고 합니다.
        // 몬스터X 단품.
        // 손님B는 다음을 주문한다고 합니다. 
        // 와퍼 1개에 치즈 및 베이컨 추가.

        // 이런 상황에서, 손님에게 주문 건에 대한 설명, 비용, 칼로리를 알려주려고 합니다.

        //문제 1. 
        // 데코레이터 패턴을 고려하여 uml 을 작성하세요.

        // 문제 2.
        // 다음과 같은 내용을 출력하세요.
        // 손님 A 주문 사항입니다.
        // 제품 : 몬스터 X
        // 칼로리 : 800kcal
        // 가격 : 8000원.
    	
    	
        Burger burger1 = new MonsterX();
        System.out.println("손님A 주문 사항입니다.");
        System.out.println("제품 : " + burger1.getDescription());
        System.out.println("칼로리 : " + burger1.calorie() +"kcal");
        System.out.println("가격 : " + burger1.cost() + "원");

        System.out.println();
        
        
        // 손님 B 주문 사항입니다.
        // 제품 : 와퍼 + 치즈 +베이컨
        // 칼로리 :  700 kcal
        // 가격 :  7000원.
        
        
        Burger burger2 = new Whopper();
        burger2 = new Cheeze(burger2);
        burger2 = new Bacon(burger2);
        System.out.println("손님B 주문 사항입니다.");
        System.out.println("제품 : " + burger2.getDescription());
        System.out.println("칼로리 : " + burger2.calorie() +"kcal");
        System.out.println("가격 : " + burger2.cost() + "원");
    
    }
}