package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;

//player
//dealer

public class Dealer {

	public static void main(String[] args) {
		Dealer d = new Dealer();
		d.dealing();
	}
	public void playGame() {
//		d.dealing();
	}

	public void dealing() {

		Deck deck = new Deck();
		deck.shuffle();
		int numCards = 2;
		
		List<Card> playerHand = new ArrayList<>(numCards);
		List<Card> dealerHand = new ArrayList<>(numCards);
		int playerValue = 0;
		int dealerValue = 0;
		for (int i = 0; i < numCards; i++) {
			Card c = deck.dealCard();
			Card d = deck.dealCard();
			playerValue += c.getValue();
			dealerValue += d.getValue();
			playerHand.add(c);
			dealerHand.add(d);
			
		}
		printHandAndValue(playerHand, playerValue, dealerHand, dealerValue);

	}

	public void printHandAndValue(List<Card> playerHand, int playerValue, List<Card> dealerHand, int dealerValue) {
		for (Card card : playerHand) {
			System.out.println(card);
		}
		System.out.println("Total player value: " + playerValue);
			for(Card card2 : dealerHand) {
				System.out.println(card2);
	}
			System.out.println("Total dealer value: "+ dealerValue);
	}

	public int getHandValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
		return value;
	}
}
