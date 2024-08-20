public class Card {
    private Value value;
    private CardSuit cardSuit;

    public Card(Value value, CardSuit cardSuit){
        this.value = value;
        this.cardSuit = cardSuit;
    }

    public void cardDescribe(){
        System.out.println("Значение: "+value+ "   |   Масть: "+ cardSuit.getSymbol());
    }
}
