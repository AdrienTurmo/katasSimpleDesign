package coffemachine;

import java.math.BigDecimal;

public class CoffeeMachine {

    private CoffeeMaker coffeeMaker;

    public CoffeeMachine(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void order() {
        coffeeMaker.send("M: No order");
    }

    public void order(Order order) {
        Double missingMoney = drinkPriceMinusMoneyGiven(order);

        if (missingMoney > 0) {

            coffeeMaker.send("M: There is " + missingMoney +"€ missing");

        } else {

            String message = String.format("%s:%s:%s"
                    , order.getDrink().getMakerCode()
                    , numberOfSugar(order)
                    , isAStickNeeded(order));

            coffeeMaker.send(message);
        }
    }

    private Double drinkPriceMinusMoneyGiven(Order order) {
        return BigDecimal.valueOf(order.getDrink().getPrice())
                .subtract(BigDecimal.valueOf(order.getMoneyGiven()))
                .doubleValue();
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
