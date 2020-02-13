import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();
    }

    public int cardCount() {
        return this.cards.size();
    }

    public void populateDeck() {
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }
}
