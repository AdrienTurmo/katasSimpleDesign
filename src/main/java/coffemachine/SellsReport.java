package coffemachine;

import java.util.Objects;

public class SellsReport {

    private Drink soldDrink;

    public void print(Printer printer) {
        if (Objects.equals(soldDrink, Drink.Coffee)) {
            printer.print("Coffees sold : 1");
        }
        if (Objects.equals(soldDrink, Drink.Chocolate)) {
            printer.print("Chocolates sold : 1");
        }
        if (Objects.equals(soldDrink, Drink.Tea)) {
            printer.print("Teas sold : 1");
        }
        printer.print("Nothing sold yet.");
    }

    public void isSold(Order order) {
        this.soldDrink = order.getDrink();
    }
}
