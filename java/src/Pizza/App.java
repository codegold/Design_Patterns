package src.Pizza;

import src.Pizza.PizzaVersions.Pizza;
import src.Pizza.Stores.ChicagoPizzaStore;
import src.Pizza.Stores.NYPizzaStore;
import src.Pizza.Stores.PizzaStore;

public class App {
    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

//        Pizza pizzaChi = chicagoPizzaStore.orderPizza("Chicago");
//        System.out.println();
//        Pizza pizzaNY = nyPizzaStore.orderPizza("New York");

        nyPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("veggie");

    }
}
