package study;

public class BurgerStore {
    public static void main(String args[]) {
        // ��Ȳ. ����� �ܹ��� �����Դϴ�. �մԵ��� �Ϲ� ���Ÿ� �����ϰų�, ������ �߰��Ҽ��� �ֽ��ϴ�. 
        // �մ�A�� ������ �ֹ��Ѵٰ� �մϴ�.
        // ����X ��ǰ.
        // �մ�B�� ������ �ֹ��Ѵٰ� �մϴ�. 
        // ���� 1���� ġ�� �� ������ �߰�.

        // �̷� ��Ȳ����, �մԿ��� �ֹ� �ǿ� ���� ����, ���, Į�θ��� �˷��ַ��� �մϴ�.

        //���� 1. 
        // ���ڷ����� ������ ����Ͽ� uml �� �ۼ��ϼ���.

        // ���� 2.
        // ������ ���� ������ ����ϼ���.
        // �մ� A �ֹ� �����Դϴ�.
        // ��ǰ : ���� X
        // Į�θ� : 800kcal
        // ���� : 8000��.
    	
    	
        Burger burger1 = new MonsterX();
        System.out.println("�մ�A �ֹ� �����Դϴ�.");
        System.out.println("��ǰ : " + burger1.getDescription());
        System.out.println("Į�θ� : " + burger1.calorie() +"kcal");
        System.out.println("���� : " + burger1.cost() + "��");

        System.out.println();
        
        
        // �մ� B �ֹ� �����Դϴ�.
        // ��ǰ : ���� + ġ�� +������
        // Į�θ� :  700 kcal
        // ���� :  7000��.
        
        
        Burger burger2 = new Whopper();
        burger2 = new Cheeze(burger2);
        burger2 = new Bacon(burger2);
        System.out.println("�մ�B �ֹ� �����Դϴ�.");
        System.out.println("��ǰ : " + burger2.getDescription());
        System.out.println("Į�θ� : " + burger2.calorie() +"kcal");
        System.out.println("���� : " + burger2.cost() + "��");
    
    }
}