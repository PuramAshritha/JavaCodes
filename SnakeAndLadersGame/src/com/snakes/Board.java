package com.snakes;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private List<Snake> snakes = new ArrayList<>();
	private List<Ladder> ladders = new ArrayList<>();

	public Board() {

		// Ladders
		ladders.add(new Ladder(6, 16));
		ladders.add(new Ladder(10, 97));
		ladders.add(new Ladder(18, 45));
		ladders.add(new Ladder(21, 36));
		ladders.add(new Ladder(35, 85));
		ladders.add(new Ladder(41, 65));

		// Snakes
		snakes.add(new Snake(38, 5));
		snakes.add(new Snake(42, 17));
		snakes.add(new Snake(54, 32));
		snakes.add(new Snake(68, 30));
		snakes.add(new Snake(86, 20));
		snakes.add(new Snake(99, 7));

	}

	public int checkPosition(int position) {

		for (Ladder ladder : ladders) {

			if (ladder.getStart() == position) {

				System.out.println("🎉 Ladder Found!");
				System.out.println(position + " ➜ " + ladder.getEnd());

				return ladder.getEnd();
			}
		}

		for (Snake snake : snakes) {

			if (snake.getHead() == position) {

				System.out.println("🐍 Snake Bit!");
				System.out.println(position + " ➜ " + snake.getTail());

				return snake.getTail();
			}
		}

		return position;
	}
}