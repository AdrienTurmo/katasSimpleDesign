public class NumberConverter {


    public static String arabToRoman(int arabicNumber) {
        if (arabicNumber == 2) {
            return "II";
        }
        if (arabicNumber == 3) {
            return "III";
        }
        if (arabicNumber == 4) {
            return "IV";
        }
        return RomanNumber.getRomanNumberFrom(arabicNumber);
    }
}
