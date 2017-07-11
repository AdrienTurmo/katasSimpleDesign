package coffemachine;

public class SellsReport {

    private Drink soldDrink;
    private int numberOfDrinksSold = 0;


    public void print(Printer printer) {
        String message;

        if (soldDrink == null) {
            message = "Nothing sold yet.";
        } else {
            message = soldDrink.name() +"s sold : " + numberOfDrinksSold;
        }

        printer.print(message);
    }

    public void isSold(Drink drink) {
        this.soldDrink = drink;
        numberOfDrinksSold++;
    }
}
