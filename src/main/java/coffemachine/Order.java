package coffemachine;

import java.util.Objects;

public class Order {
    private Drink drink;

    public Order(Drink drink) {
        this.drink = drink;
    }

    public Drink getDrink() {
        return drink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return drink == order.drink;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drink);
    }
}
