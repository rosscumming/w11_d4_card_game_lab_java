public class Player {
    private Card card;

    public void receiveCard(Card card){
        this.card = card;
    }

    public Card getCard() {
        return card;
    }
}
