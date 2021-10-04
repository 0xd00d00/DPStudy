package answer;

public class Main {

    public static void main(String[] args) {
        // pizza store 를 사람이 방문
        //SimpleFactoryPattern sf = new SimpleFactoryPattern();
        //PizzaStore ps = new PizzaStore(sf);

        // 부산점 방문
        PizzaStore ps = new BusanPizzaStore();
        ps.orderPizza("Busan");
    }
}
