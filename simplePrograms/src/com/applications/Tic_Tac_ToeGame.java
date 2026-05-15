package com.applications;

import java.util.Scanner;

public class Tic_Tac_ToeGame {
	private static char[][] board = new char[3][3];
	private static char currentPlayer = 'X';

	private static void initialize() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}

	private static boolean checkRow() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
				return true;
			}
		}
		return false;
	}

	private static boolean checkCol() {
		for (int i = 0; i < 3; i++) {
			if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
				return true;
			}
		}
		return false;
	}

	private static boolean checkDiag() {
		// left diagonal
		if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
			return true;
		}
		//right diagonal
		if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
			return true;
		}
		return false;
	}

	private static boolean checkWin() {
		if (checkRow() || checkCol() || checkDiag()) {
			return true;
		}
		return false;
	}

	private static void display() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	private static void switchPlayer() {
		currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	}

	private static boolean isDraw() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans;
		do {
			initialize();
			currentPlayer = 'X';
			display();
			while (true) {
				System.out.println("Enter " + currentPlayer + " row Position: ");
				int row = sc.nextInt();
				System.out.println("Enter " + currentPlayer + " column Position: ");
				int col = sc.nextInt();
				if (row > 2 || row < 0 || col > 2 || col < 0) {
					System.out.println("Invalid Input ! Try Again");
					continue;
				}

				if (board[row][col] != ' ') {
					System.out.println("This Position is taken! Try again ");
					continue;
				}
				board[row][col] = currentPlayer;
				if (checkWin()) {
					display();
					System.out.println(currentPlayer + " wins");
					break;
				}
				if (isDraw()) {
					display();
					System.out.println("This Game is Draw");
					break;
				}
				display();
				switchPlayer();
			}
			System.out.println("Do you want to play again? Y/N");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("Y"));
		sc.close();
	}
}
