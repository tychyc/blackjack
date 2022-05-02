package blackjack;

public class Card {
	
	private int value;
	private char color;
	
	public Card( int c, int v) {
		this.value = v;
		if (c ==0) {
			this.color='H';
		}
		if (c ==1) {
			this.color='D';
		}
		if (c ==2) {
			this.color='S';
		}
		if (c ==3) {
			this.color='C';
		}
	}
	
	public String toString() {
		return "" + this.color + this.value;
	}
	
}
