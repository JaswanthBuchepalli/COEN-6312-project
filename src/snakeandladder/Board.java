package snakeandladder;

import java.util.ArrayList;

public class Board {
	private ArrayList<Square> squares = new ArrayList<Square>();
	private static int totalNumberOfSquares = 10;
	private int totalNumberOfSnakes;
	private int totalNumberOfLadders;

	public Board(int numSquares, int[][] ladders, int[][] snakes) {

		assert numSquares > totalNumberOfSquares : " There must be at least " + totalNumberOfSquares + " squares ";
		makeSquares(numSquares);
		makeLadders(ladders);
		makeSnakes(snakes);
	}

	private void makeSquares(int numSquares) {
		System.out.println(" There are " + numSquares + " squares ");
		for (int position = 0; position < numSquares; position++) {
			Square square = new Square(position, this);
			squares.add(square);
			square.setSquareRole(new SquareRole(square));
		}
		firstSquare().setSquareRole(new FirstSquare(firstSquare()));
		lastSquare().setSquareRole(new LastSquare(lastSquare()));
	}

	public Square firstSquare() {
		return squares.get(0);
	}

	public Square lastSquare() {
		return squares.get(squares.size() - 1);
	}

	public Square findSquare(int position) {
		assert (position > 0) && (position < numberOfSquares()) : " inexistent square ";
		return squares.get(position);
	}

	private int numberOfSquares() {
		assert !squares.isEmpty();
		return squares.size();
	}

	private void makeSnakes(int[][] snakes) {
		for (int i = 0; i < snakes.length; i++) {
			assert snakes[i].length == 2;
			totalNumberOfSnakes = snakes.length;

			int fromPosition = snakes[i][0] - 1;
			int toPosition = snakes[i][1] - 1;
			int transport = toPosition - fromPosition;

			assert transport < 0 : "In snake , destination after origin ";
			assert (toPosition > 0) && (toPosition < numberOfSquares() - 1);
			assert (fromPosition < numberOfSquares() - 1) && (fromPosition > 0);

			System.out.println(" snake from " + (fromPosition + 1) + " to " + (toPosition + 1));

			Square snakeSquare = squares.get(fromPosition);
			snakeSquare.setSquareRole(new SnakeSquare(snakeSquare, transport));
		}
	}

	private void makeLadders(int[][] ladders) {
		for (int i = 0; i < ladders.length; i++) {
			assert ladders[i].length == 2;
			totalNumberOfLadders = ladders.length;
			int fromPosition = ladders[i][0] - 1;
			int toPosition = ladders[i][1] - 1;

			int transport = toPosition - fromPosition;

			assert transport > 0 : "In ladder , origin after destination ";
			assert (toPosition < numberOfSquares()) && (toPosition > 0);
			assert (fromPosition > 0) && (fromPosition < numberOfSquares());

			System.out.println(" ladder from " + (fromPosition + 1) + " to " + (toPosition + 1));

			Square ladderSquare = squares.get(fromPosition);
			ladderSquare.setSquareRole(new LadderSquare(ladderSquare, transport));
		}
	}

	public int getLadderCount() {
		return totalNumberOfLadders;
	}

	public int getSnakeCount() {
		return totalNumberOfSnakes;
	}

	public int getSquareCount() {
		return totalNumberOfSquares;
	}
}