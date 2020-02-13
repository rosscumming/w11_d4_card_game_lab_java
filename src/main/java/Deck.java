import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;
    private Random rand = new Random();

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
        Collections.shuffle(cards);

    }

    public void dealCard(){
        this.cards.remove(0);
    }

}
