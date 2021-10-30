package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;

//player + Dealer
//Dealer extends player, has functions to play and deal game
public abstract class Hand {
	protected List<Card> cards = new ArrayList<>();
	
	public Hand() {
		cards = createHand();
	}
	
	private List<Card> createHand(){
		List<Card> hand = new ArrayList<>();
		for(Suit )
	}
	public void addCard(Card card) {
		
	}
	public void clear() {
		
	}
	
	public int getHandValue() {
		int value = 0;
		
		return value;
	}
	
}
