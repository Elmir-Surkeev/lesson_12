
public class Hand {
    private Card[] hand;
    private int handSize;

    public Hand(int size) {
        hand = new Card[size];
        handSize = 0;
    }

    public boolean addCard(Card card) {
        if (handSize < hand.length) {
            hand[handSize++] = card;
            return true;
        }
        return false;
    }

    public boolean replaceCard(int position, Card newCard) {
        int index = position - 1; // Корректируем позицию
        if (index >= 0 && index < handSize) {
            hand[index] = newCard;
            return true;
        }
        return false;
    }

    public void showHand() {
        for (int i = 0; i < handSize; i++) {
            System.out.println((i + 1) + ": " + hand[i]);
        }
    }
}
