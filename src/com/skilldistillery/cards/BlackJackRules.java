package com.skilldistillery.cards;

import java.util.List;
import java.util.Scanner;

public class BlackJackRules extends Hands{

	public BlackJackRules() {
		
	}
	
	public void playerPrompt(List<Card> playerHand, int playerValue, Card c) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to hit or stay?");
		System.out.println("1: Hit!");
		System.out.println("2: Stay...");
		int input = scanner.nextInt();
		
		switch (input) {
		case 1: 
			isBust(false, playerValue);
			isBlackJack(true, playerValue);
			addCardPlayer(playerHand, playerValue, c);
			
			break;
		
		case 2:
			System.out.println("You are staying with"+ playerValue);
			scanner.close();
			break;
			
		default:
			System.out.println("Incorrect Selection.");
			addCardPlayer(playerHand, playerValue, c);
		}
	}
	public boolean isBlackJack(boolean blackjack, int playerValue) {
		if(playerValue == 21) {
			System.out.println("BLACKJACK");
		}
		return blackjack;
	}
	
	public boolean isBust(boolean keepGoing, int playerValue) {
		if(playerValue < 21) {
			keepGoing = false;
		}
		if (keepGoing = false) {
		System.out.println("BUST");	
		}
		return keepGoing;
	}
	
//	public void getHandValue(List<Card> playerHand, int playerValue, List<Card> dealerHand, int dealerValue) {
//		for (Card card : playerHand) {
//			System.out.println(card);
//		}
//		System.out.println("Total player value: " + playerValue);
//		for (Card card2 : dealerHand) {
//			System.out.println(card2);
//		}
//		System.out.println("Total dealer value: " + dealerValue);
//	}
}
