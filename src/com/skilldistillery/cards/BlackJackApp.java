package com.skilldistillery.cards;

public class BlackJackApp {
	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.play();
	}
	
	public void play() {
		BlackJackRules bjr;
		BlackJackHand bjh1;
		BlackJackHand bjh2;
		
		Deck d = new Deck();
		bjh1 = new BlackJackHand();
		bjh2 = new BlackJackHand();
		
		bjr = new BlackJackRules();
		
		bjh1.addCard(d.dealCard());
		bjh1.addCard(d.dealCard());
		//Draw card or stay
		bjh1.isBlackJack();
		bjh1.isBust();
		
		bjh2 = new BlackJackHand();
		bjh2 = new BlackJackHand();
		//Check value
		bjh2.isBlackJack();
		bjh2.isBust();
		
		//show hands
		
		
		bjr.createHands(c, d);
		bjr.displayPlayer(null, 0);
		bjr.halfDisplayDealer(null, 0);
		bjr.addCardPlayer();
		bjr.addCardDealer();
		bjr.showHands(null, 0, null, 0);
		
	}

}
