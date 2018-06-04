package factorypattern;

/**
 * 创建实例的工厂类
 * <p>
 * Created by andy on 18/6/4.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type == "cheese") {
            return new ChicagoStyleCheesePizza();
        } else if (type == "veggie") {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
