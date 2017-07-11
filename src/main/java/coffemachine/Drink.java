package coffemachine;

public enum Drink {
    Tea("T",0.4),
    Chocolate("H", 0.5),
    Coffee("C", 0.6),
    OrangeJuice("O", 0.6);

    private String makerCode;
    private Double price;

    Drink(String makerCode, Double price) {
        this.makerCode = makerCode;
        this.price = price;
    }

    public String getMakerCode() {
        return makerCode;
    }

    public Double getPrice() {
        return price;
    }
}
