import java.util.stream.Stream;

public class NumberConverter {


    public static String arabToRoman(int arabicNumber) {
        if (arabicNumber > 0) {
            RomanNumber romanLetter = Stream.of(RomanNumber.values())
                    .filter(romanNumber -> arabicNumber - romanNumber.getArabicValue() >= 0)
                    .findFirst()
                    .get();

            return romanLetter.name() + arabToRoman(arabicNumber - romanLetter.getArabicValue());
        } else {
            return "";
        }
        /*
        if (arabicNumber == 2) {
            return "II";
        }
        if (arabicNumber == 3) {
            return "III";
        }
        if (arabicNumber == 20) {
            return "XX";
        }
        return RomanNumber.getRomanNumberAssociatedWith(arabicNumber);
        */
    }
}
