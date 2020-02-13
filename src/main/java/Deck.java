import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();
    }

    public int cardCount() {
        return this.cards.size();
    }
}
