import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberConverterTest {

    @Test
    public void arab_to_roman_should_return_I_when_passing_1() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(1);

        assertThat(romanNumber).isEqualTo("I");
    }

    @Test
    public void arab_to_roman_should_return_V_when_passing_5() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(5);

        assertThat(romanNumber).isEqualTo("V");
    }

    @Test
    public void arab_to_roman_should_return_X_when_passing_10() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(10);

        assertThat(romanNumber).isEqualTo("X");
    }

    @Test
    public void arab_to_roman_should_return_L_when_passing_50() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(50);

        assertThat(romanNumber).isEqualTo("L");
    }

    @Test
    public void arab_to_roman_should_return_C_when_passing_100() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(100);

        assertThat(romanNumber).isEqualTo("C");
    }

    @Test
    public void arab_to_roman_should_return_D_when_passing_500() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(500);

        assertThat(romanNumber).isEqualTo("D");
    }


    @Test
    public void arab_to_roman_should_return_M_when_passing_10() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(10);

        assertThat(romanNumber).isEqualTo("X");
    }
}