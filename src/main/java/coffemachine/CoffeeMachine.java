package coffemachine;

public class CoffeeMachine {

    private CoffeeMaker coffeeMaker;

    public CoffeeMachine(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void order() {
        coffeeMaker.send("M: No order");
    }

    public void order(Order order) {
        if (order.equals(new Order(Drink.Coffee))) {
            coffeeMaker.send("C::");
        } else if (order.equals(new Order(Drink.Tea))) {
            coffeeMaker.send("T::");
        } else {
            coffeeMaker.send("H::");
        }


    }
}
