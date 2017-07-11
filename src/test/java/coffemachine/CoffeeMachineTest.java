package coffemachine;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CoffeeMachineTest {

    @Mock
    CoffeeMaker coffeeMaker;
    @Mock
    Printer printer;


    CoffeeMachine coffeeMachine;

    @Before
    public void setUp() throws Exception {
        coffeeMachine = new CoffeeMachine(coffeeMaker, printer);
    }

    @Test
    public void should_send_no_order() throws Exception {
        coffeeMachine.order();

        verify(coffeeMaker).send("M: No order");
    }

    @Test
    public void should_send_order_for_a_coffee() throws Exception {
        Order coffeeOrder = new Order(Drink.Coffee, 0, false, 0.6);

        coffeeMachine.order(coffeeOrder);

        verify(coffeeMaker).send("C::");
    }

    @Test
    public void should_send_order_for_a_tea() throws Exception {
        Order teaOrder = new Order(Drink.Tea, 0, false, 1.0);

        coffeeMachine.order(teaOrder);

        verify(coffeeMaker).send("T::");
    }

    @Test
    public void should_send_order_for_a_chocolate() throws Exception {
        Order chocolateOrder = new Order(Drink.Chocolate, 0, false, 1.0);

        coffeeMachine.order(chocolateOrder);

        verify(coffeeMaker).send("H::");
    }

    @Test
    public void should_send_order_for_a_chocolate_with_a_sugar_and_therefore_a_stick() throws Exception {
        Order chocolateWithASugarOrder = new Order(Drink.Chocolate,1, false, 1.0);

        coffeeMachine.order(chocolateWithASugarOrder);

        verify(coffeeMaker).send("H:1:0");
    }

    @Test
    public void should_send_order_for_a_coffee_with_two_sugars_and_therefore_a_stick() throws Exception {
        Order coffeeWithTwoSugarsOrder = new Order(Drink.Coffee,2, false, 1.0);

        coffeeMachine.order(coffeeWithTwoSugarsOrder);

        verify(coffeeMaker).send("C:2:0");
    }

    @Test
    public void should_send_a_message_with_the_price_if_no_money_is_given_for_a_coffee() throws Exception {
        Order coffeeOrder = new Order(Drink.Coffee,0, false, (double) 0);

        coffeeMachine.order(coffeeOrder);

        verify(coffeeMaker).send("M: There is 0.6€ missing");
    }

    @Test
    public void should_send_a_message_with_the_price_if_no_money_is_given_for_a_tea() throws Exception {
        Order teaOrder = new Order(Drink.Tea,0, false, (double) 0);

        coffeeMachine.order(teaOrder);

        verify(coffeeMaker).send("M: There is 0.4€ missing");
    }

    @Test
    public void should_send_a_message_with_the_price_if_no_money_is_given_for_a_chocolate() throws Exception {
        Order order = new Order(Drink.Chocolate,0, false, (double) 0);

        coffeeMachine.order(order);

        verify(coffeeMaker).send("M: There is 0.5€ missing");
    }

    @Test
    public void should_send_a_message_with_the_money_missing_if_not_enough_money_given() throws Exception {
        Order order = new Order(Drink.Chocolate,0, false, 0.2);

        coffeeMachine.order(order);

        verify(coffeeMaker).send("M: There is 0.3€ missing");
    }

    @Test
    public void should_send_a_message_for_an_orange_juice() throws Exception {
        Order order = new Order(Drink.OrangeJuice,0, false, 1.0);

        coffeeMachine.order(order);

        verify(coffeeMaker).send("O::");
    }

    @Test
    public void should_send_a_message_for_an_orange_juice_an_not_enough_money() throws Exception {
        Order order = new Order(Drink.OrangeJuice,0, false, 0.2);

        coffeeMachine.order(order);

        verify(coffeeMaker).send("M: There is 0.4€ missing");
    }

    @Test
    public void should_send_a_message_for_an_extra_hot_coffee_with_no_sugar() throws Exception {
        Order order = new Order(Drink.Coffee,0, true, 1.0);

        coffeeMachine.order(order);

        verify(coffeeMaker).send("Ch::");
    }

    @Test
    public void should_send_a_message_for_an_extra_hot_chocolate_with_one_sugar() throws Exception {
        Order order = new Order(Drink.Chocolate,1, true, 1.0);

        coffeeMachine.order(order);

        verify(coffeeMaker).send("Hh:1:0");
    }

    @Test
    public void should_print_an_empty_report() throws Exception {
        coffeeMachine.printReport();

        verify(printer).print("Nothing sold yet.");
    }

    @Test
    public void should_print_the_fact_that_one_coffee_was_sold() throws Exception {
        Order order = new Order(Drink.Coffee,0, true, 1.0);
        coffeeMachine.order(order);

        coffeeMachine.printReport();

        verify(printer).print("Coffees sold : 1");
    }

    @Test
    public void should_print_the_fact_that_one_chocolate_was_sold() throws Exception {
        Order order = new Order(Drink.Chocolate,0, false, 1.0);
        coffeeMachine.order(order);

        coffeeMachine.printReport();

        verify(printer).print("Chocolates sold : 1");
    }

    @Test
    public void should_print_the_fact_that_one_tea_was_sold() throws Exception {
        Order order = new Order(Drink.Tea,1, false, 1.0);
        coffeeMachine.order(order);

        coffeeMachine.printReport();

        verify(printer).print("Teas sold : 1");
    }

    @Test
    public void should_print_the_fact_that_two_orange_juice_were_sold() throws Exception {
        Order firstOrder = new Order(Drink.OrangeJuice,0, false, 1.0);
        Order secondOrder = new Order(Drink.OrangeJuice,0, false, 1.0);
        coffeeMachine.order(firstOrder);
        coffeeMachine.order(secondOrder);

        coffeeMachine.printReport();

        verify(printer).print("OrangeJuices sold : 2");
    }
}