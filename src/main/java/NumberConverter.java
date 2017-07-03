public class NumberConverter {


    public static String arabToRoman(int arabicNumber) {
        if (arabicNumber == 2) {
            return "II";
        }
        return RomanNumber.getRomanNumberFrom(arabicNumber);
    }
}
