package snakeandladder;

import java.util.ArrayList;

public class FirstSquare extends SquareRole {
	private ArrayList<Player> players = new ArrayList<Player>();

	public FirstSquare(Square s) {
		super(s);
	}

	@Override
	public boolean isFirstSquare() {
		return true;
	}

	@Override
	public void landPlayer(Player player) {
		players.add(player);
		player.setSquare(square);
	}

	@Override

	public void leavePlayer(Player player) {
		players.remove(player);
	}

	@Override
	public boolean isOccupied() {
		return !players.isEmpty();
	}

	public int getNumberOfPlayers() {
		return players.size();
	}
}
