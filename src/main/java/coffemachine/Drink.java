package coffemachine;

public enum Drink {
    Tea("T"),
    Chocolate("H"),
    Coffee("C");

    private String makerCode;

    Drink(String makerCode) {
        this.makerCode = makerCode;
    }

    public String getMakerCode() {
        return makerCode;
    }
}
