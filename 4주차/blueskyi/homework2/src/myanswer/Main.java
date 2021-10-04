package myanswer;

public class Main {

    public static void main(String[] args) {
        // pizza store 를 사람이 방문
        PizzaStore ps = new BusanPizzaStore();
        ps.orderPizza("Busan");


        System.out.println("------------------");
        ps = new IncheonPizzaStore();
        ps.orderPizza("Incheon");
    }
}
