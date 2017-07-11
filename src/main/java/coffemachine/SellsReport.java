package coffemachine;

public class SellsReport {

    private Drink soldDrink;


    public void print(Printer printer) {
        String message;

        if (soldDrink == null) {
            message = "Nothing sold yet.";
        } else {
            message = soldDrink.name() +"s sold : 1";
        }

        printer.print(message);
    }

    public void isSold(Drink drink) {
        this.soldDrink = drink;
    }
}
