package factorypattern;

/**
 * Created by andy on 18/6/4.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //抽象工厂方法  封装对象的创建
    protected abstract Pizza createPizza(String type);

}
