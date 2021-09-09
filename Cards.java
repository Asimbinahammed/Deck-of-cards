package bridgelabz;

import java.util.HashSet;
import java.util.Set;

public class Cards {
	private static String[][] cardCombo = new String[4][13];
	private static String[] suits = { "Diamond", "Heart", "Spades", "Club" };
	private static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	public void setupDeck() {
		// Created combination of cards
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.println(cardCombo[i][j] = suits[i] + " " + rank[j]);
			}
		}
	}

	// main method
	public static void main(String[] args) {
		Cards deckOfCards = new Cards();
		deckOfCards.setupDeck();
	}
}


