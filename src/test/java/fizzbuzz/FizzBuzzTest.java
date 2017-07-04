package fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_1_for_1() throws Exception {
        String result = FizzBuzz.fizzbuzz(1);

        assertThat(result).isEqualTo("1");
    }

    @Test
    public void should_return_2_for_2() throws Exception {
        String result = FizzBuzz.fizzbuzz(2);

        assertThat(result).isEqualTo("2");
    }
}