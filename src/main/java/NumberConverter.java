import java.util.EnumSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberConverter {


    public static String arabToRoman(int arabicNumber) {
        return Stream.of(RomanNumber.values())
                .filter(romanNumber -> romanNumber.getArabicValue() == arabicNumber)
                .findFirst()
                .get()
                .name();
    }
}
