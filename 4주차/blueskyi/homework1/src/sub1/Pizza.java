package sub1;
import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough... ");
        System.out.println("Adding Sauce...");
        System.out.println("Adding Topping: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 min");
    }

    void cut() {
        System.out.println("cutting pizza");
    }

    void box() {
        System.out.println("Place Pizza in official box");
    }

    public String getName() {
        return name;
    }
}
