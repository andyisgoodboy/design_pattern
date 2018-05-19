package decoratorpattern;

/**
 * 具体组件 某咖啡
 * <p>
 * Created by andy on 18/5/19.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
