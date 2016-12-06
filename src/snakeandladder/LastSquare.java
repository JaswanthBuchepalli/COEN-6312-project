package snakeandladder;

public class LastSquare extends SquareRole {

	public LastSquare(Square s) {
		super(s);
	}

	@Override
	public boolean isLastSquare() {
		return true;
	}
}
