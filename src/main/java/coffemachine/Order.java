package coffemachine;

public class Order {
    private Drink drink;
    private int numberOfSugar;
    private boolean extraHot;
    private Double moneyGiven;

    public Order(Drink drink, int numberOfSugar, boolean extraHot, Double moneyGiven) {
        this.drink = drink;
        this.numberOfSugar = numberOfSugar;
        this.extraHot = extraHot;
        this.moneyGiven = moneyGiven;
    }

    public Drink getDrink() {
        return drink;
    }

    public int getNumberOfSugar() {
        return numberOfSugar;
    }

    public Double getMoneyGiven() {
        return moneyGiven;
    }

    public boolean isExtraHot() {
        return extraHot;
    }
}
