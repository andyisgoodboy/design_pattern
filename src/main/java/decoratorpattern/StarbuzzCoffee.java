package decoratorpattern;

/**
 * Created by andy on 18/5/19.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {

        //订一杯Espresso, 不加配料
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        //订一杯DarkRoast, 加两份摩卡一份奶泡
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        //订一杯HouseBlend, 加豆浆，摩卡，奶泡
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());


    }

}
