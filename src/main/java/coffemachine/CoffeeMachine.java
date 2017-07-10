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
        String message = "";

        message = order.getDrink().getMakerCode();
        message += FIELD_SEPARATOR;
        if (order.getNumberOfSugar() > 0) {
            message += "1";
        }
        message += FIELD_SEPARATOR;
        if (order.getNumberOfSugar() > 0) {
            message += "0";
        }
        coffeeMaker.send(message);
    }
}
