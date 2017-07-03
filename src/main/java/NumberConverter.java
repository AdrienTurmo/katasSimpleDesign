public class NumberConverter {


    public static String arabToRoman(int arabicNumber) {
        if (arabicNumber == 1) {
            return "I";
        }
        if (arabicNumber == 5) {
            return "V";
        }
        return "X";
    }
}
