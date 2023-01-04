package boardGame;



public class Piece {
private Board board;
public Piece(Board board) {
	this.board = board;
	position = null;
}
protected Board getBoard() {
	return board;
}
protected Position position;



}
