import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Player player1;
    private Player player2;

    @Before
    public void before(){
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canPopulateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void highCardWinsOrDraw(){
        deck.populateDeck();
        deck.dealCard(player1);
        deck.dealCard(player2);
        deck.decideWinner(player1, player2);
        assertEquals("P2 Win!", deck.decideWinner(player1, player2));
    }
}
