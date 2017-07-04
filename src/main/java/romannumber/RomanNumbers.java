package romannumber;

import java.util.stream.Stream;

public enum RomanNumbers {
    M(1000),
    CM(900),
    D(500),
    CD(400),
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
    IX(9),
    V(5),
    IV(4),
    I(1);

    private int arabicValue;

    RomanNumbers(int arabicValue) {
        this.arabicValue = arabicValue;
    }

    public int getArabicValue() {
        return arabicValue;
    }

    public static RomanNumbers getBiggestRomanNumberSmallerThan(int arabicNumber) {
        return Stream.of(RomanNumbers.values())
                .filter(romanNumber -> arabicNumber - romanNumber.getArabicValue() >= 0)
                .findFirst()
                .get();
    }

}
