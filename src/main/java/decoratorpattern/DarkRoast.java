package decoratorpattern;

/**
 * 具体组件 某咖啡
 * <p>
 * Created by andy on 18/5/19.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 1.00;
    }
}
