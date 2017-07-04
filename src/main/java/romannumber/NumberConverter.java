package romannumber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberConverter {


    public static String arabToRoman(int arabicNumber) {

        if (arabicNumber > 0) {
            RomanNumbers romanLetter = RomanNumbers.getBiggestRomanNumberSmallerThan(arabicNumber);

            return romanLetter.name() + arabToRoman(arabicNumber - romanLetter.getArabicValue());
        }

        return "";
    }

    public static int romanToArab(String romanNumber) {

        List<Integer> numberList = convertEachRomanLetterToTheirValue(romanNumber);

        int sum = sumEachIndividualValueAccordingToTheRomanNumberRules(numberList);

        return sum;
    }

    private static List<Integer> convertEachRomanLetterToTheirValue(String romanNumber) {
        List<Integer> numberList = new ArrayList<>();

        for (char c : romanNumber.toCharArray()) {
            numberList.add(RomanNumbers.valueOf(String.valueOf(c)).getArabicValue());
        }
        return numberList;
    }

    private static int sumEachIndividualValueAccordingToTheRomanNumberRules(List<Integer> numberList) {
        int sum = 0;

        for (int index = 0; index < numberList.size()-1; index++) {
            if (numberList.get(index)<numberList.get(index+1)){
                sum -= numberList.get(index);
            } else {
                sum += numberList.get(index);
            }
        }
        sum += numberList.get(numberList.size()-1);
        return sum;
    }
}
