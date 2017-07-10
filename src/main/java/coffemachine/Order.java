package coffemachine;

import java.util.Objects;

public class Order {
    private Drink drink;
    private int numberOfSugar;

    public Order(Drink drink, int numberOfSugar) {
        this.drink = drink;
        this.numberOfSugar = numberOfSugar;
    }

    public Drink getDrink() {
        return drink;
    }

    public int getNumberOfSugar() {
        return numberOfSugar;
    }

}
