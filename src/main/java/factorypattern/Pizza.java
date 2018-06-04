package factorypattern;

import java.util.ArrayList;

/**
 * Created by andy on 18/6/4.
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("preparing..." + name);
        System.out.println("tossing dough");
        System.out.println("adding sauce");
        System.out.println("adding toppings...");
        for (Object topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    void bake() {
        System.out.println("baking for 25min");
    }

    void cut() {
        System.out.println("cutting into pieces");
    }

    void box() {
        System.out.println("place into box");
    }

    public String getName() {
        return name;
    }
}
