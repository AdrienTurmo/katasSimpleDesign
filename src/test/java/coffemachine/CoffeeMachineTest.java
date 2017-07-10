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
        Order coffeeOrder = new Order(Drink.Coffee);

        coffeeMachine.order(coffeeOrder);

        Mockito.verify(coffeeMaker).send("C::");
    }

    @Test
    public void should_send_order_for_a_tea() throws Exception {
        Order teaOrder = new Order(Drink.Tea);

        coffeeMachine.order(teaOrder);

        Mockito.verify(coffeeMaker).send("T::");
    }

    @Test
    public void should_send_order_for_a_chocolate() throws Exception {
        Order chocolateOrder = new Order(Drink.Chocolate);

        coffeeMachine.order(chocolateOrder);

        Mockito.verify(coffeeMaker).send("H::");
    }
}