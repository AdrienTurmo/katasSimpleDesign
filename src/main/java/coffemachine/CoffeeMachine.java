package coffemachine;

public class CoffeeMachine {

    public static final String FIELD_SEPARATOR = ":";
    private CoffeeMaker coffeeMaker;

    public CoffeeMachine(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void order() {
        coffeeMaker.send("M: No order");
    }

    public void order(Order order) {
        if (order.getMoneyGiven() == 0) {

            if (order.getDrink() == Drink.Coffee) {
                coffeeMaker.send("M: There is 0,6€ missing");
            } else {
                coffeeMaker.send("M: There is 0,4€ missing");
            }
        } else {

            String message = String.format("%s:%s:%s"
                    , order.getDrink().getMakerCode()
                    , numberOfSugar(order)
                    , isAStickNeeded(order));

            coffeeMaker.send(message);
        }
    }

    private String isAStickNeeded(Order order) {
        int numberOfSugar = order.getNumberOfSugar();
        return numberOfSugar > 0 ? "0" : "";
    }

    private String numberOfSugar(Order order) {
        int numberOfSugar = order.getNumberOfSugar();
        return numberOfSugar > 0 ? numberOfSugar + "" : "";
    }


}
