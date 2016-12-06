package snakeandladder;

public class LadderSquare extends SquareRole {
	int from, to; 

	public void setLadders(int f, int t) {
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

	public LadderSquare(Square s, int t) {
		super(s);
		assert t > 0 : "A ladder shift must be positive ";
		transport = t;
	}

	public LadderSquare() {
		super();
	}

	@Override
	public Square landHereOrGoHome() {
		System.out.println(" ladder from " + (square.getPosition() + 1) + " to " + (destination().getPosition() + 1));
		return destination().landHereOrGoHome();
	}

	private Square destination() {
		return square.findRelativeSquare(transport);
	}
}
