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
}