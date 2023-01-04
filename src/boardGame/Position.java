package boardGame;

public class Position {
	private int column;
	private int rown;
public Position(int row, int column) {
	this.setRown(row);
	this.setColumn(column);
}
public int getColumn() {
	return column;
}
public void setColumn(int column) {
	this.column = column;
}
public int getRown() {
	return rown;
}
public void setRown(int rown) {
	this.rown = rown;
}
}
