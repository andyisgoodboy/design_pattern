package factorypattern;

/**
 * 创建实例的工厂类
 * <p>
 * Created by andy on 18/6/4.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type == "cheese") {
            return new NYStyleCheesePizza();
        } else if (type == "veggie") {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
