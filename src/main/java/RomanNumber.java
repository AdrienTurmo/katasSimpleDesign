import java.util.stream.Stream;

public enum RomanNumber {
    M(1000),
    D(500),
    C(100),
    L(50),
    X(10),
    V(5),
    I(1);

    private int arabicValue;

    RomanNumber(int arabicValue) {
        this.arabicValue = arabicValue;
    }


    public int getArabicValue() {
        return arabicValue;
    }

    public static String getRomanNumberAssociatedWith(int arabicNumber) {
        return Stream.of(RomanNumber.values())
                .filter(romanNumber -> romanNumber.getArabicValue() == arabicNumber)
                .findFirst()
                .get()
                .name();
    }
}
