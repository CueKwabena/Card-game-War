package War;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private static final Random random = new Random();
	private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	private int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	private List <Card> deck= new ArrayList<>();


   	public Deck(){
   		this.deck = makeDeck();
   	}
   	
   		private List<Card> makeDeck() {
			for(int i = 0 ; i < suits.length ; i++){
				for (int j = 0; j< ranks.length; j++){
        			 deck.add( new Card(suits[i] , ranks[j] , values[j]));         			 
				}//end 2nd for loop            
			} //end 1st for loop 			
			shuffle(deck);
			return deck;
   		}//ends deck	
	
   		public List<Card> deck() {
   			return this.deck;
   		}

   		public List<Card> deal(List<Card> deck){            
   			deck.remove(0);
   			return deck;        
   		}

	
	public  List<Card> shuffle(List<Card> deck) {		
		Card temp;
		int j = 0;
		while (j++ < 1000) {		          
		   int x = random.nextInt(51);
		   temp = deck.get(x);
		   deck.remove(x);
		   deck.add(temp);	
		   j++;
		}//ends while loop    	
		return deck;		   
			}//ends shuffle
	


}
