package com.skilldistillery.cards;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	private String name;

	Suit(String names) {
		name = names;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
