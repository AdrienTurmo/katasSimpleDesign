package coffemachine;

import java.util.Objects;

public class SellsReport {

    private Drink soldDrink;

    public void print(Printer printer) {
        if (Objects.equals(soldDrink, Drink.Coffee)) {
            printer.print("Coffees sold : 1");
        }
        printer.print("Nothing sold yet.");
    }

    public void isSold(Order order) {
        this.soldDrink = order.getDrink();
    }
}
