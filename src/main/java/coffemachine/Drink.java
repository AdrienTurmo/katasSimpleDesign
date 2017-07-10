package coffemachine;

public enum Drink {
    Tea("T",0.4),
    Chocolate("H", 0.5),
    Coffee("C", 0.6);

    private String makerCode;
    private double price;

    Drink(String makerCode, double price) {
        this.makerCode = makerCode;
        this.price = price;
    }

    public String getMakerCode() {
        return makerCode;
    }

    public double getPrice() {
        return price;
    }
}
