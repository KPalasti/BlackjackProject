package com.skilldistillery.cards;

public class BlackJackHand extends Hand {

	public BlackJackHand() {
	}

	public boolean isBlackJack() {
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
		}
		if (value == 21) {
			System.out.println("BLACKJACK");
			return true;
		}
		return false;
	}

	public boolean isBust() {
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();

		}
		if (value >= 22) {
			System.out.println("BUST");
			return true;
		}
		return false;
	}
	
	@Override
	public int getHandValue() {
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
		}
		System.out.println(cards);
		System.out.println(value);
		return value;
	}
	public int getHandValue2() {
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
		}
		return value;
	}

}
