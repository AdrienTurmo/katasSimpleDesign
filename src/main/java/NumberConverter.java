public class NumberConverter {


    public static String arabToRoman(int arabicNumber) {
        if (arabicNumber > 0) {
            RomanNumber romanLetter = RomanNumber.getBiggestRomanNumberContainedInto(arabicNumber);

            int ratio = arabicNumber / romanLetter.getArabicValue();
            if (ratio < 4) {
                return romanLetter.name() + arabToRoman(arabicNumber - romanLetter.getArabicValue());
            } else {
                RomanNumber nextRomanLetter = RomanNumber.getBiggestRomanNumberContainedInto((romanLetter.getArabicValue() * 5));
                return romanLetter.name() + nextRomanLetter.name() + arabToRoman(arabicNumber - 4 * romanLetter.getArabicValue());
            }

        }
        return "";
    }
}
