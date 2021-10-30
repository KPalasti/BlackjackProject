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

	public void dealing() {

		Deck deck = new Deck();
		deck.shuffle();
		int numCards = 2;
		
		List<Card> hand = new ArrayList<>(numCards);
		int totalValue = 0;
		for (int i = 0; i < numCards; i++) {
			Card c = deck.dealCard();
			totalValue += c.getValue();
			hand.add(c);
		}
		printHandAndValue(hand, totalValue);

	}

	public void printHandAndValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);

		}
		System.out.println("Total value: " + value);
	}

	public int getHandValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
		return value;
	}
}
