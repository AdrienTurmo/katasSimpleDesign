package tennisfromscratch;

public enum TennisScore {
    FifteenAll("Fifteen-All"),
    FifteenLove("Fifteen-Love"),
    LoveFifteen("Love-Fifteen"),
    LoveAll("Love-All"),
    ThirtyLove("Thirty-Love");

    private String name;

    TennisScore(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
