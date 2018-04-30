package com.basic;

import java.util.Scanner;

public class ScissorPaperRock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		SignGenerator sg = new SignGenerator();
		
		System.out.println("Hi! Let's play the game of Rock, Paper, Scissors");
		System.out.println("For Rock press R\n"
				+ "For Paper press P\n"
				+ "For Scissor press S\n"
				+ "For quit the game press Q\n"
				+ "START");

		while(true) {
			String yourChoice = sc.nextLine().toLowerCase();
			
			if (yourChoice.equalsIgnoreCase("q")) {
				System.out.println("Thanks  for playing\n" + "Bye\n");
				break;
			}

			switch (yourChoice) {

			case "s":
				if (sg.getSign() == HandSign.SCISSOR) {
					System.out.println("My sign is Scissor");
					System.out.println("There are no winners");
					System.out.println("Try me again");					
				} else if (sg.getSign() == HandSign.PAPER) {
					System.out.println("My sign is Paper");
					System.out.println("You win");
				} else {
					System.out.println("My sign is Rock");
					System.out.println("You loose");
				}
				break;
			case "p":
				if (sg.getSign() == HandSign.PAPER) {
					System.out.println("My sign is Paper");
					System.out.println("There are no winners");
					System.out.println("Try me again");
				} else if (sg.getSign() == HandSign.ROCK) {
					System.out.println("My sign is Rock");
					System.out.println("You win");
				} else {
					System.out.println("My sign is Scissor");
					System.out.println("You loose");
				}
				break;
			case "r":
				if (sg.getSign() == HandSign.ROCK) {
					System.out.println("My sign is Rock");
					System.out.println("There are no winners");
					System.out.println("Try me again");
				} else if (sg.getSign() == HandSign.SCISSOR) {
					System.out.println("My sign is Scissor");
					System.out.println("You win");
				} else {
					System.out.println("My sign is Paper");
					System.out.println("You loose");
				}
				break;
			default:
				System.out.println("Invalid input \n" + "Try again\n");
				break;
			}
		}

		sc.close();
	}
}
