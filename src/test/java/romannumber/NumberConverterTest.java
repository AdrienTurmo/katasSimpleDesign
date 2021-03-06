package romannumber;

import org.junit.Test;
import romannumber.NumberConverter;

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
    public void arab_to_roman_should_return_M_when_passing_1000() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(1000);

        assertThat(romanNumber).isEqualTo("M");
    }


    @Test
    public void arab_to_roman_should_return_II_when_passing_2() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(2);

        assertThat(romanNumber).isEqualTo("II");
    }

    @Test
    public void arab_to_roman_should_return_III_when_passing_3() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(3);

        assertThat(romanNumber).isEqualTo("III");
    }

    @Test
    public void arab_to_roman_should_return_XX_when_passing_20() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(20);

        assertThat(romanNumber).isEqualTo("XX");
    }

    @Test
    public void arab_to_roman_should_return_IV_when_passing_4() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(4);

        assertThat(romanNumber).isEqualTo("IV");
    }

    @Test
    public void arab_to_roman_should_return_XLIX_when_passing_949() throws Exception {
        String romanNumber = NumberConverter.arabToRoman(949);

        assertThat(romanNumber).isEqualTo("CMXLIX");
    }

    @Test
    public void roman_to_arab_should_return_1_when_passing_I() throws Exception {
        int arabicNumber = NumberConverter.romanToArab("I");

        assertThat(arabicNumber).isEqualTo(1);
    }

    @Test
    public void roman_to_arab_should_return_5_when_passing_V() throws Exception {
        int arabicNumber = NumberConverter.romanToArab("V");

        assertThat(arabicNumber).isEqualTo(5);
    }

    @Test
    public void roman_to_arab_should_return_2_when_passing_II() throws Exception {
        int arabicNumber = NumberConverter.romanToArab("II");

        assertThat(arabicNumber).isEqualTo(2);
    }

    @Test
    public void roman_to_arab_should_return_4_when_passing_IV() throws Exception {
        int arabicNumber = NumberConverter.romanToArab("IV");

        assertThat(arabicNumber).isEqualTo(4);
    }

    @Test
    public void roman_to_arab_should_return_40_when_passing_XL() throws Exception {
        int arabicNumber = NumberConverter.romanToArab("XL");

        assertThat(arabicNumber).isEqualTo(40);
    }

    @Test
    public void roman_to_arab_should_return_309_when_passing_CCCIX() throws Exception {
        int arabicNumber = NumberConverter.romanToArab("CCCIX");

        assertThat(arabicNumber).isEqualTo(309);
    }

}