package snakeandladder;

public class SnakeSquare extends SquareRole {

	int from, to;
	public void setSnake(int f, int t) {
		from = f;
		to = t;
	}

	public int getFrom() {
		return from;
	}

	public int getTo() {
		return to;
	}

	private int transport;

	public SnakeSquare(Square s, int t) {
		super(s);
		assert t < 0 : "A snake shift must be negative ";
		transport = t;

	}

	public SnakeSquare() {
		super();
	}

	@Override
	public Square landHereOrGoHome() {
		System.out.println(" snake from " + (square.getPosition() + 1) + " to " + (destination().getPosition() + 1));
		return destination().landHereOrGoHome();
	}

	private Square destination() {
		return square.findRelativeSquare(transport);
	}
}
