package tennisfromscratch;

public enum TennisScore {
    FiftyAll("Fifty-All"),
    FiftyLove("Fifty-Love"),
    LoveFifty("Love-Fifty"),
    LoveAll("Love-All");

    private String name;

    TennisScore(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
