package blackjack;

public class Deck {
	private Card[] deck;
	
		
	public Deck() {
		deck = new Card[52];	
		int color = 4;
		int value = 13;
		int cardCount = 0;
        for (int i = 1; i <= color; i++)
            for (int j = 1; j <= value; j++) {
                deck[cardCount] = new Card(i, j);
                cardCount++;
                }
        
        
	}
	public String toString() {
		return "" + this.deck + ".";
	}
	String getCard() {
		int i =15;
		return "." + i;
	}

}
