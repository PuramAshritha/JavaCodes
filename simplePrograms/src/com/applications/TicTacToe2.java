package com.applications;

import java.util.Scanner;

public class TicTacToe2 {

	private static char[][] board;
	private static char currentPlayer;
	private static final int size = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String playAgain;

		do {
			initGame();
			playGame(sc);

			System.out.print("Do you want to play again? (Y/N): ");
			playAgain = sc.next();
		} while (playAgain.equalsIgnoreCase("Y"));

		sc.close();
	}

	private static void initGame() {
		board = new char[size][size];
		currentPlayer = 'X';

		char value = '1';
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = value++;
			}
		}
	}


	private static void playGame(Scanner sc) {
		while (true) {
			displayBoard();
			makeMove(sc);

			if (checkWin()) {
				displayBoard();
				System.out.println("Player " + currentPlayer + " wins!");
				break;
			}

			if (isDraw()) {
				displayBoard();
				System.out.println("Game is a draw!");
				break;
			}

			switchPlayer();
		}
	}


	private static void displayBoard() {
		System.out.println("\n-------------");
		for (int i = 0; i < size; i++) {
			System.out.print("| ");
			for (int j = 0; j < size; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println("\n-------------");
		}
	}


	private static void makeMove(Scanner sc) {
		int pos;

		while (true) {
			System.out.print("Player " + currentPlayer + ", enter position (1-9): ");
			pos = sc.nextInt();

			if (pos < 1 || pos > 9) {
				System.out.println("Invalid input! Choose 1-9.");
				continue;
			}

			int row = (pos - 1) / size;
			int col = (pos - 1) % size;

			if (board[row][col] == 'X' || board[row][col] == 'O') {
				System.out.println("Position already taken! Try again.");
			} else {
				board[row][col] = currentPlayer;
				break;
			}
		}
	}


	private static void switchPlayer() {
		currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	}

	
	private static boolean checkWin() {
		return checkRows() || checkCols() || checkDiagonals();
	}

	private static boolean checkRows() {
		for (int i = 0; i < size; i++) {
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
				return true;
			}
		}
		return false;
	}

	private static boolean checkCols() {
		for (int i = 0; i < size; i++) {
			if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
				return true;
			}
		}
		return false;
	}

	private static boolean checkDiagonals() {
		return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||

				(board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
	}

	private static boolean isDraw() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (board[i][j] != 'X' && board[i][j] != 'O') {
					return false;
				}
			}
		}
		return true;
	}
}
