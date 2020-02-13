import java.util.ArrayList;
import java.util.Collections;

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
        Collections.shuffle(cards);

    }

    public void dealCard(Player player){
        Card card = this.cards.remove(0);
        player.receiveCard(card);
    }

    public String decideWinner(Player player1, Player player2) {
        int p1Value = player1.getCard().getRank().ordinal();
        int p2Value = player2.getCard().getRank().ordinal();
        if (p1Value > p2Value){
            return "P1 Win!";
        }
        else if (p1Value < p2Value){
            return "P2 Win!";
        }
        else {
            return "Draw!";
        }
    }
}
