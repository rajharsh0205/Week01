import java.util.Scanner;

public class DeckOfCards {
	
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
			}
		}
        return deck;
	}
	
    public static String[] shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            // Swap the current card with a random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
		}
        return deck;
	}
	
    public static String[][] distributeDeck(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (cardsPerPlayer * numPlayers > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return new String[0][0]; // Return empty array if not enough cards
		}
		
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
			}
		}
        return players;
	}
	
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + " cards: ");
            for (String card : players[i]) {
                System.out.print(card + " | ");
			}
            System.out.println();
		}
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
		
        System.out.print("Enter the number of players: ");
        int numPlayers = input.nextInt();
		
        System.out.print("Enter the number of cards each player should receive: ");
        int cardsPerPlayer = input.nextInt();
		
        String[][] playersCards = distributeDeck(deck, numPlayers, cardsPerPlayer);
        
        if (playersCards.length > 0) {
            printPlayersCards(playersCards);
		}
		
        input.close();
	}
}
