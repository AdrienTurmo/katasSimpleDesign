public class NumberConverter {


    public static String arabToRoman(int arabicNumber) {
        if (arabicNumber > 0) {
            RomanNumbers romanLetter = RomanNumbers.getBiggestRomanNumberContainedInto(arabicNumber);

            return romanLetter.name() + arabToRoman(arabicNumber - romanLetter.getArabicValue());

        }
        return "";
    }

    public static int romanToArab(String romanNumber) {
        return RomanNumbers.valueOf(romanNumber).getArabicValue();
    }
}
