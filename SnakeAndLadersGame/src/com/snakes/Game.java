package com.snakes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	private Board board;
	private Dice dice;
	private List<Player> players;
	private Scanner sc;

	public Game() {
		board = new Board();
		dice = new Dice();
		players = new ArrayList<>();
		sc = new Scanner(System.in);
	}

	public void addPlayers() {

		System.out.println("=================================");
		System.out.println("      SNAKE AND LADDER GAME");
		System.out.println("=================================");

		System.out.print("Enter Number of Players : ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {

			System.out.print("Enter Player " + i + " Name : ");
			String name = sc.nextLine();

			players.add(new Player(name));
		}

	}

	public void displayScoreBoard() {

		System.out.println();
		System.out.println("========== SCORE BOARD ==========");

		for (Player player : players) {
			System.out.printf("%-15s : %d%n", player.getName(), player.getPosition());
		}

		System.out.println("=================================");
		System.out.println();

	}

	public void startGame() {

		boolean winnerFound = false;
		int turn = 1;

		while (!winnerFound) {

			System.out.println();
			System.out.println("============== TURN " + turn + " ==============");

			for (Player player : players) {

				System.out.println();
				System.out.println("--------------------------------");
				System.out.println("Player : " + player.getName());
				System.out.println("Current Position : " + player.getPosition());
				System.out.println("Press ENTER to Roll Dice...");
				sc.nextLine();

				int value = dice.rollDice();

				dice.printDice(value);

				int oldPosition = player.getPosition();
				int newPosition = oldPosition + value;

				if (newPosition > 100) {

					System.out.println("Move Skipped! Need Exact Number.");

				} else {

					System.out.println(player.getName() + " moved from " + oldPosition + " ➜ " + newPosition);

					newPosition = board.checkPosition(newPosition);

					player.setPosition(newPosition);

					System.out.println("Current Position : " + player.getPosition());

				}

				if (player.getPosition() == 100) {

					System.out.println();
					System.out.println("#########################################");
					System.out.println("🏆 WINNER : " + player.getName());
					System.out.println("CONGRATULATIONS!");
					System.out.println("#########################################");

					winnerFound = true;
					break;
				}

			}

			displayScoreBoard();

			turn++;

		}

	}

	public void play() {

		boolean playAgain = true;

		while (playAgain) {

			players.clear();

			addPlayers();

			startGame();

			System.out.print("\nPlay Again (Y/N) : ");

			String choice = sc.nextLine();

			if (!choice.equalsIgnoreCase("Y")) {

				playAgain = false;

				System.out.println();
				System.out.println("==================================");
				System.out.println(" Thank You For Playing 😊");
				System.out.println("==================================");
			}

		}

		sc.close();

	}

}