package coffemachine;

import java.util.HashMap;
import java.util.Map;

public class SellsReport {

    private Map<Drink, Integer> quantityOfDrinksSold = new HashMap<>();

    private Drink[] soldDrink = new Drink[2];
    private int[] numberOfDrinksSold = {0, 0};


    public void print(Printer printer) {

        String message = "";

        if (numberOfDrinksSold[0] == 0) {
            message = "Nothing sold yet.";
        } else {
            printer.print(soldDrink[0].name() + "s sold : " + numberOfDrinksSold[0]);
            if (!(numberOfDrinksSold[1] == 0)) {
            printer.print(soldDrink[1].name() + "s sold : " + numberOfDrinksSold[0]);
            }
        }

        printer.print(message);

        //quantityOfDrinksSold.forEach((drink, integer) -> printer.print(drink.name()+"s sold :" + integer));

    }

    public void isSold(Drink drink) {
        //quantityOfDrinksSold.putIfAbsent(drink,1);
        //quantityOfDrinksSold.computeIfPresent(drink,(drink1, integer) -> integer+1);

        if (numberOfDrinksSold[0] == 0) {
            this.soldDrink[0] = drink;
        } else {
            this.soldDrink[1] = drink;
        }
        if (this.soldDrink[0] == drink) {
            this.numberOfDrinksSold[0] += 1;
        } else if (this.soldDrink[1] == drink) {
            this.numberOfDrinksSold[1] += 1;
        }


    }
}
