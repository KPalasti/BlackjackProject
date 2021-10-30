package com.skilldistillery.cards;

import java.util.Scanner;

public class BlackJackApp {
	boolean stay;
	Deck d = new Deck();
	BlackJackHand bjh1;
	BlackJackHand bjh2;

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.play();
	}

	public void play() {
		stay = false;

		// Create a new deck
		// Shuffle the deck
		d.shuffle();
		// Create two new hands
		bjh1 = new BlackJackHand();
		bjh2 = new BlackJackHand();
		// Add two cards to the player's hand
		bjh1.addCard(d.dealCard());
		bjh1.addCard(d.dealCard());

		// Show dealer top card
		bjh2.addCard(d.dealCard());
		System.out.println("Dealer's card shows: ");
		bjh2.getHandValue();
		System.out.println();
		bjh2.addCard(d.dealCard());
		// Wrap Dealer's BlackJack Condition
		if (bjh2.isBlackJack() == false) {

			// Show the player their hand
			System.out.println("Your hand is: ");
			bjh1.getHandValue();
			System.out.println();
			// Wrap remaining conditions in player's blackjack advantage
			if (bjh1.isBlackJack() == false) {
				// Check player for hit or stay
				while (!bjh1.isBust() && !bjh1.isBlackJack() && stay == false) {
					prompt();
				}
				// Check dealer for hit or stay
				while (!bjh1.isBust() && bjh2.getHandValue2() < 17 && !bjh2.isBust() && !bjh2.isBlackJack() && stay == false) {
					bjh2.addCard(d.dealCard());
				}

				// show hands
				System.out.println("Your dealer reveals his hand: ");
				bjh2.getHandValue();
				System.out.println();

				// declare winner
				if ((bjh1.getHandValue2() > bjh2.getHandValue2() && bjh1.getHandValue2() <= 21) || (bjh1.getHandValue2()<=21 && bjh2.isBust())) {
					System.out.println("Congratulations, you've won!");

				} else if (bjh1.getHandValue2() == bjh2.getHandValue2()) {
					System.out.println("Push");
				} else if (bjh1.getHandValue2()< bjh2.getHandValue2() && !bjh2.isBust() || bjh1.isBust()){
					System.out.println("You lose.");
				}
			} else {
				System.out.println(bjh2.getHandValue());
				System.out.println("Beginner's luck...Player's Blackjack.");
			}

		} else {
			System.out.println();
			System.out.println("Your dealer flips his cards...");
			System.out.println(bjh2.getHandValue());
			System.out.println("Looks like the house does always win.");
		}

	}

	public void prompt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to hit or stay?");
		System.out.println("1: Hit");
		System.out.println("2: Stay");
		int input = scanner.nextInt();

		switch (input) {
		case 1:
			bjh1.addCard(d.dealCard());
			System.out.println(bjh1.getHandValue());
			System.out.println();
			break;

		case 2:
			while (bjh2.getHandValue2() < 17 && !bjh2.isBust() && !bjh2.isBlackJack() && stay == false) {
				bjh2.addCard(d.dealCard());
			}
			stay = true;
			scanner.close();
			break;
		}

	}
}
