package fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_1_for_1() throws Exception {
        String result = FizzBuzz.fizzBuzzOf(1);

        assertThat(result).isEqualTo("1");
    }

    @Test
    public void should_return_2_for_2() throws Exception {
        String result = FizzBuzz.fizzBuzzOf(2);

        assertThat(result).isEqualTo("2");
    }

    @Test
    public void should_return_4_for_4() throws Exception {
        String result = FizzBuzz.fizzBuzzOf(4);

        assertThat(result).isEqualTo("4");
    }
}