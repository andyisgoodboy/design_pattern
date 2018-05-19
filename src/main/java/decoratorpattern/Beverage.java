package decoratorpattern;

/**
 * 抽象组件 饮料
 * <p>
 * Created by andy on 18/5/19.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
