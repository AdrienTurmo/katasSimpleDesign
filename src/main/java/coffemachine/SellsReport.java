package coffemachine;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class SellsReport {

    private Map<Drink, Integer> quantityOfDrinksSold = new HashMap<>();
    private BigDecimal moneyEarned = BigDecimal.valueOf(0);

    public void print(Printer printer) {
        if (quantityOfDrinksSold.isEmpty()) {
            printer.print("Nothing sold yet.");
            printer.print("Total earned : 0€");
        } else {
            quantityOfDrinksSold.forEach((drink, integer) -> printer.print(drink.name() + "s sold : " + integer.toString()));
            printer.print("Total earned : " + moneyEarned + "€");
        }
    }

    public void isSold(Drink drink) {
        quantityOfDrinksSold.putIfAbsent(drink, Integer.valueOf(0));
        quantityOfDrinksSold.computeIfPresent(drink, (soldDrink, quantity) -> quantity + 1);
        moneyEarned = BigDecimal.valueOf(drink.getPrice());
    }
}
