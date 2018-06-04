package factorypattern;

/**
 * Created by andy on 18/6/4.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Tomato Sauce";
        toppings.add("Mozzarella Cheese");
    }

    void cut() {
        System.out.println("cutting into square slices...");
    }
}
