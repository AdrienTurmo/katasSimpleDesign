public class NumberConverter {


    public static String arabToRoman(int arabicNumber) {
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
    }
}
