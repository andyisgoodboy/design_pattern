package decoratorpattern;

/**
 * 具体组件 某咖啡
 * <p>
 * Created by andy on 18/5/19.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }
}
