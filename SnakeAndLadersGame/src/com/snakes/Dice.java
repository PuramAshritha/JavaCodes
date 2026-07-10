package com.snakes;

import java.util.Random;

public class Dice {

	private Random random = new Random();

	public int rollDice() {

		try {

			System.out.print("Rolling");

			for (int i = 0; i < 3; i++) {
				Thread.sleep(400);
				System.out.print(".");
			}

			System.out.println();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return random.nextInt(6) + 1;
	}

	public void printDice(int value) {

		String[] dice = { "⚀", "⚁", "⚂", "⚃", "⚄", "⚅" };

		System.out.println("Dice : " + dice[value - 1] + " (" + value + ")");
	}
}