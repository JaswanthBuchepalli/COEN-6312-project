package snakeandladder;

public class Die {
	private int value;
	String rolledBy;

	public int getValue() {
		return generateDieValue();
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getRolledBy() {
		return rolledBy;
	}

	public void setRolledBy(String rolledBy) {
		this.rolledBy = rolledBy;
	}

	private int generateDieValue() {
		return (int) (Math.random() * 6) + 1;
	}

	public int rolls() {
		return getValue();
	}
}
