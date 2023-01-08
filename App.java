package War;
import java.util.Scanner;

public class App {

	public  Deck deck = new Deck();
	static final Scanner in = new Scanner(System.in);
	int round = 1;

	void startGame(){
		
	System.out.println("Welcome to the 2 player card game: WAR ");
		/*
		 * The game will run until the end 
		 * creating 2 players
		 * player one enters name then player two
		 * 
		*/
	System.out.println("Player one enter your name");
	String playerone = in.nextLine();
	Player playerOne = new Player(playerone);
	System.out.println("Player two enter your name");
	String playertwo = in.nextLine();
	Player playerTwo = new Player(playertwo);	
	System.out.println("\n***"+playerOne.name() + " is playing "+ playerTwo.name()+"***");
	
	
		
    	//start game
	do{
		System.out.println("press enter to continue ");			
		String go = in.nextLine();
			//number of rounds per game
		System.out.println("   ***Round "+ (round++) + "***");					
		
			
		playerOne.setHand(deck.deck());
		playerOne.flipCard(deck.deck());		
		
		playerTwo.setHand(deck.deck());
		playerTwo.flipCard(deck.deck());
		
		//compare the two cards
		playerOne.compare(playerTwo.getHand());
		playerTwo.compare(playerOne.getHand());		
		
		System.out.println(playerOne + "\n" + playerTwo);		
		System.out.println("There are "+ deck.deck().size()+" remaining cards left in the deck");
		
	}while (!deck.deck().isEmpty());//ends while loop
		
		//End of  game 
	System.out.println("End of rounds");
	System.out.println("press enter to continue \n");
	String goo = in.nextLine();
			//final score of the game
	playerOne.compareScore(playerOne.getScore(), playerTwo.getScore());
	playerTwo.compareScore(playerTwo.getScore(), playerOne.getScore());
	System.out.println("press enter to continue \n");
	String gooo = in.nextLine();
	System.out.println(playerOne.name() +"'s deck"+ "           "+ playerTwo.name()+"'s deck\n");	
	for(int j = 0; j < 26; j++ ) {
		System.out.println(playerOne.getHand().get(j)+ "        " +playerTwo.getHand().get(j));		
	}//ends for loop
		//return cards from both player back to deck
	while(!playerOne.getHand().isEmpty()) {
	deck.deck().add((playerOne.flipCard(playerOne.getHand())));
	}//ends while
	while (!playerTwo.getHand().isEmpty()) {
		deck.deck().add(playerOne.flipCard(playerTwo.getHand()));
	}//ends while*/
	System.out.println("\nGoodbye");
			 
}//ends starGame
	
	
	
	
	public static void main(String[] args) {
		
	App play = new App();	
	play.startGame();
	
	}//ends main
}//ends App class
