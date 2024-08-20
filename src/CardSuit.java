public enum CardSuit {
    SPADES("\u2660"),   // ♠
    HEARTS("\u2665"),   // ♥
    DIAMONDS("\u2666"), // ♦
    CLUBS("\u2663");    // ♣

    private final String symbol;

    CardSuit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
