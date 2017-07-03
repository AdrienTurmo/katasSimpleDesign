import java.util.stream.Stream;

public enum RomanNumber {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private int arabicValue;

    RomanNumber(int arabicValue) {
        this.arabicValue = arabicValue;
    }


    public int getArabicValue() {
        return arabicValue;
    }

    public static String getRomanNumberFrom(int arabicNumber) {
        return Stream.of(RomanNumber.values())
                .filter(romanNumber -> romanNumber.getArabicValue() == arabicNumber)
                .findFirst()
                .get()
                .name();
    }
}
