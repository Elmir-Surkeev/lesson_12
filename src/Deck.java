import java.util.Random;

public class Deck {
    private Card[] cards;
    private int currentSize;

    public Deck() {
        cards = new Card[52];
        int index = 0;
        for (CardSuit suit : CardSuit.values()) {
            for (Value value : Value.values()) {
                cards[index++] = new Card(value, suit);
            }
        }
        currentSize = 52;
    }

    public void rndDeck() {
        Random rnd = new Random();
        for (int i = currentSize - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card drawCard() {
        if (currentSize == 0) {
            return null;
        }
        Card drawnCard = cards[currentSize - 1];
        cards[currentSize - 1] = null;
        currentSize--;
        return drawnCard;
    }

    public boolean returnCard(Card card) {
        if (currentSize == cards.length) {
            return false;
        }
        for (int i = 0; i < currentSize; i++) {
            if (cards[i].equals(card)) {
                return false;
            }
        }
        cards[currentSize] = card;
        currentSize++;
        return true;
    }
}