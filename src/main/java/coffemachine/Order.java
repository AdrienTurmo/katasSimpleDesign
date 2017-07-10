package coffemachine;

public class Order {
    private Drink drink;
    private int numberOfSugar;
    private int moneyGiven;

    public Order(Drink drink, int numberOfSugar, int moneyGiven) {
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

    public int getMoneyGiven() {
        return moneyGiven;
    }
}
