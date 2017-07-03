public enum RomanNumber {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100);

    private int arabicValue;

    RomanNumber(int arabicValue) {
        this.arabicValue = arabicValue;
    }


    public int getArabicValue() {
        return arabicValue;
    }
}
