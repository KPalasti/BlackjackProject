package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//player
//dealer

public class Dealing {
	
	public static void main(String[] args) {
		Dealing d = new Dealing();
		d.dealing();
	}
	
	public void dealing() {
		
		Deck deck = new Deck();
		deck.shuffle();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many cards would you like?");
		
		try {
		      int numCards = scanner.nextInt();
		      if(numCards > 52) {
		        throw new InputMismatchException();
		      }
		      
		      List<Card> hand = new ArrayList<>(numCards);
		      int totalValue = 0;
		      for(int i = 0; i < numCards; i++) {
		        Card c = deck.dealCard();
		        totalValue += c.getValue();
		        hand.add(c);
		      }
		  printHandAndValue(hand, totalValue);
    }
    catch (InputMismatchException e) {
      System.out.println("That is not a valid number of cards.");
    }
    finally {
      scanner.close();
    }
	}
	public void printHandAndValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
			
		}
		System.out.println("Total value: "+value);
	}
	public int getHandValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
		return value;
	}
}
