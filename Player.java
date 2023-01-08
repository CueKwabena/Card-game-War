package War;

import java.util.ArrayList;
import java.util.List;


public class Player {
	
	private List<Card> playerDeck = new ArrayList<>();		
	private String name;
	private int score;	



	Player(String name){		
		this.name = name;
		this.score = 0;	
		
	}	
		
	public String name() {
		return this.name;
	}
	
	public int getScore() {
		return score;
	}	
	
	public int cardValue(List<Card> deck){            
		 return deck.get(0).getValue();
	}
	
	public Card flipCard(List <Card> deck){ 		
		return deck.remove(0);       
	}
    
	
	public List<Card> getHand() {
		return playerDeck;
	}
	
	public void setHand(List<Card> deck) {
		playerDeck.add(0,deck.get(0));
	}
		
	   	
   	public void compareScore(int score, int other) {
   		if(this.score > other) {
   			System.out.println(name()+" is the Winner!!!!") ;
	   		System.out.println(name()+" won with a score of "+ score); 
   		}else if (this.score == other) {
   			System.out.println("The score was tied");
   			System.out.println(name() + "'s final score is "+ score);
   		}else {
	   		System.out.println("Sorry "+ name() + " your final score is "+ score + " you lost");
   		}
   	}
		
	public int compare( List<Card> card){	
		if(card.get(0).getValue() < playerDeck.get(0).getValue()) {
			System.out.println("*** " + name() + " Wins this round ***");
			score++;			
			return score ;		
		}else if (card.get(0).getValue() == this.playerDeck.get(0).getValue()) {		
			System.out.println("*** Draw ***");
			return 0;
		}else 
			return 0;
	}	   	
		
	@Override	
	public String toString() {			
		return name + "'s score is " + score + " card is "+ getHand().get(0);
	}

}//ends Players class
