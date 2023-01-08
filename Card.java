package War;

public class Card {

	private String suit;
    private String rank;
	private int value ;
	
	public Card(String suits, String ranks, int values) {
		this.rank = ranks;
		this.suit = suits;
		this.value = values;		
	}

	public String getSuits() {	
		return suit;
	}

	public void setSuits(String suit) {
		this.suit = suit;
	}

	public String getRanks() {
		return rank;
	}

	public void setRanks(String rank) {
		this.rank = rank;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

@Override
 	public String toString() {	
		return rank + " of " + suit ;
	}
		
}