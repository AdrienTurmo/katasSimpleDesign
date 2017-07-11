package coffemachine;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CoffeeMachineTest {

    @Mock
    CoffeeMaker coffeeMaker;

    CoffeeMachine coffeeMachine;

    @Before
    public void setUp() throws Exception {
        coffeeMachine = new CoffeeMachine(coffeeMaker);
    }

    @Test
    public void should_send_no_order() throws Exception {
        coffeeMachine.order();

        Mockito.verify(coffeeMaker).send("M: No order");
    }

    @Test
    public void should_send_order_for_a_coffee() throws Exception {
        Order coffeeOrder = new Order(Drink.Coffee, 0, false, 0.6);

        coffeeMachine.order(coffeeOrder);

        Mockito.verify(coffeeMaker).send("C::");
    }

    @Test
    public void should_send_order_for_a_tea() throws Exception {
        Order teaOrder = new Order(Drink.Tea, 0, false, 1.0);

        coffeeMachine.order(teaOrder);

        Mockito.verify(coffeeMaker).send("T::");
    }

    @Test
    public void should_send_order_for_a_chocolate() throws Exception {
        Order chocolateOrder = new Order(Drink.Chocolate, 0, false, 1.0);

        coffeeMachine.order(chocolateOrder);

        Mockito.verify(coffeeMaker).send("H::");
    }

    @Test
    public void should_send_order_for_a_chocolate_with_a_sugar_and_therefore_a_stick() throws Exception {
        Order chocolateWithASugarOrder = new Order(Drink.Chocolate,1, false, 1.0);

        coffeeMachine.order(chocolateWithASugarOrder);

        Mockito.verify(coffeeMaker).send("H:1:0");
    }

    @Test
    public void should_send_order_for_a_coffee_with_two_sugars_and_therefore_a_stick() throws Exception {
        Order coffeeWithTwoSugarsOrder = new Order(Drink.Coffee,2, false, 1.0);

        coffeeMachine.order(coffeeWithTwoSugarsOrder);

        Mockito.verify(coffeeMaker).send("C:2:0");
    }

    @Test
    public void should_send_a_message_with_the_price_if_no_money_is_given_for_a_coffee() throws Exception {
        Order coffeeOrder = new Order(Drink.Coffee,0, false, (double) 0);

        coffeeMachine.order(coffeeOrder);

        Mockito.verify(coffeeMaker).send("M: There is 0.6€ missing");
    }

    @Test
    public void should_send_a_message_with_the_price_if_no_money_is_given_for_a_tea() throws Exception {
        Order teaOrder = new Order(Drink.Tea,0, false, (double) 0);

        coffeeMachine.order(teaOrder);

        Mockito.verify(coffeeMaker).send("M: There is 0.4€ missing");
    }

    @Test
    public void should_send_a_message_with_the_price_if_no_money_is_given_for_a_chocolate() throws Exception {
        Order order = new Order(Drink.Chocolate,0, false, (double) 0);

        coffeeMachine.order(order);

        Mockito.verify(coffeeMaker).send("M: There is 0.5€ missing");
    }

    @Test
    public void should_send_a_message_with_the_money_missing_if_not_enough_money_given() throws Exception {
        Order order = new Order(Drink.Chocolate,0, false, 0.2);

        coffeeMachine.order(order);

        Mockito.verify(coffeeMaker).send("M: There is 0.3€ missing");
    }

    @Test
    public void should_send_a_message_for_an_orange_juice() throws Exception {
        Order order = new Order(Drink.OrangeJuice,0, false, 1.0);

        coffeeMachine.order(order);

        Mockito.verify(coffeeMaker).send("O::");
    }

    @Test
    public void should_send_a_message_for_an_orange_juice_an_not_enough_money() throws Exception {
        Order order = new Order(Drink.OrangeJuice,0, false, 0.2);

        coffeeMachine.order(order);

        Mockito.verify(coffeeMaker).send("M: There is 0.4€ missing");
    }

    @Test
    public void should_send_a_message_for_an_extra_hot_coffee_with_no_sugar() throws Exception {
        Order order = new Order(Drink.Coffee,0, true, 1.0);

        coffeeMachine.order(order);

        Mockito.verify(coffeeMaker).send("Ch::");
    }
}