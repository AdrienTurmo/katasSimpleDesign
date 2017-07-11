package coffemachine;

public class Order {
    private Drink drink;
    private int numberOfSugar;
    private Double moneyGiven;

    public Order(Drink drink, int numberOfSugar, Double moneyGiven) {
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

    public Double getMoneyGiven() {
        return moneyGiven;
    }
}
