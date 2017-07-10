package coffemachine;

public class Order {
    private Drink drink;
    private int numberOfSugar;
    private double moneyGiven;

    public Order(Drink drink, int numberOfSugar, double moneyGiven) {
        this.drink = drink;
        this.numberOfSugar = numberOfSugar;
        this.moneyGiven = moneyGiven;
    }

    public Drink getDrink() {
        return drink;
    }

    public int getNumberOfSugar() {
        return numberOfSugar;
    }

    public double getMoneyGiven() {
        return moneyGiven;
    }
}
