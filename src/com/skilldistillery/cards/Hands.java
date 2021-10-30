package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Hands {
	
	public void createHands(Card c, Card d) {

		Deck deck = new Deck();
		deck.shuffle();
		int numCards = 2;

		List<Card> playerHand = new ArrayList<>(numCards);
		List<Card> dealerHand = new ArrayList<>(numCards);
		int playerValue = 0;
		int dealerValue = 0;
		for (int i = 0; i < numCards; i++) {
			c = deck.dealCard();
			d = deck.dealCard();
			playerValue += c.getValue();
			dealerValue += d.getValue();
			playerHand.add(c);
			dealerHand.add(d);

		}
		showHands(playerHand, playerValue, dealerHand, dealerValue);

	}

//	public void addCardPlayer(List<Card> playerHand, int playerValue, Card c) {
//		playerHand.add(c);
//	}
//
//	public void addCardDealer(List<Card> dealerHand, int dealerValue, Card d) {
//		dealerHand.add(d);
//
//	}

//	public void showHands(List<Card> playerHand, int playerValue, List<Card> dealerHand, int dealerValue) {
//		for (Card card : playerHand) {
//			System.out.println(card);
//		}
//		System.out.println("Total player value: " + playerValue);
//		for (Card card2 : dealerHand) {
//			System.out.println(card2);
//		}
//		System.out.println("Total dealer value: " + dealerValue);
//	}

	public void halfDisplayDealer(List<Card> dealerHand, int dealerValue) {
		System.out.println(dealerHand.get(1));
	}

	public void displayPlayer(List<Card> playerHand, int playerValue) {
		for (Card card : playerHand) {
			System.out.println(card);
		}
		System.out.println("Your totaly value is: " + playerValue);
	}
	
	public void declareWinner(int playerValue, int dealerValue) {
		if(playerValue > dealerValue) {
			System.out.println("Congratulations, you win!");
		}
		else{
			System.out.println("You lose.");
		}
	}

	public void clear() {
		Deck deck = new Deck();
		deck.shuffle();
	}
}
