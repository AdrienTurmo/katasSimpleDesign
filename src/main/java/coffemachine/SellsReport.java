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
            quantityOfDrinksSold.forEach((drink, integer) -> printDrinkWithQuantitySold(printer, drink, integer));
            int quantity = quantityOfDrinksSold.getOrDefault(Drink.Coffee,1);
            printer.print("Total earned : " + moneyEarned.multiply(BigDecimal.valueOf(quantity)) + "€");
        }
    }

    private void printDrinkWithQuantitySold(Printer printer, Drink drink, Integer integer) {
        printer.print(drink.name() + "s sold : " + integer.toString());
    }

    public void isSold(Drink drink) {
        quantityOfDrinksSold.putIfAbsent(drink, Integer.valueOf(0));
        quantityOfDrinksSold.computeIfPresent(drink, (soldDrink, quantity) -> quantity + 1);
        moneyEarned = BigDecimal.valueOf(drink.getPrice());
    }
}
