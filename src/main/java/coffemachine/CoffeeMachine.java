package coffemachine;

import java.math.BigDecimal;

public class CoffeeMachine {

    private CoffeeMaker coffeeMaker;
    private SellsReport sellsReport;
    private Printer printer;

    public CoffeeMachine(CoffeeMaker coffeeMaker, Printer printer) {
        this.coffeeMaker = coffeeMaker;
        this.sellsReport = new SellsReport();
        this.printer = printer;
    }

    public void order() {
        coffeeMaker.send("M: No order");
    }

    public void order(Order order) {
        Double missingMoney = drinkPriceMinusMoneyGiven(order);

        String message = "";

        if (missingMoney > 0) {

            message = "M: There is " + missingMoney + "€ missing";

        } else {

            message = formatOrder(order);
            sellsReport.isSold(order.getDrink());

        }

        coffeeMaker.send(message);
    }


    private String formatOrder(Order order) {
        String message;
        String drinkCode = order.getDrink().getMakerCode();
        String extraHot = isTheDrinkExtraHot(order);
        String numberOfSugar = numberOfSugar(order);
        String stick = isAStickNeeded(order);

        message = String.format("%s%s:%s:%s"
                , drinkCode
                , extraHot
                , numberOfSugar
                , stick);
        return message;
    }

    private String isTheDrinkExtraHot(Order order) {
        return order.isExtraHot() ? "h" : "";
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


    public void printReport() {
        sellsReport.print(printer);
    }
}
