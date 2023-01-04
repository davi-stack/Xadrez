package boardGame;

public class Board {
private int rows;
private int columns;
public int getColumns() {
	return columns;
}
public void setColumns(int columns) {
	this.columns = columns;
}
private Piece[][] pieces;
public Board(int rows, int columns) {
	this.setRows(rows);
	this.columns = columns;
	pieces = new Piece[rows][columns];
}
public int getRows() {
	return rows;
}
public void setRows(int rows) {
	this.rows = rows;
}
public Piece piece(Position position) {
	return pieces[position.getRown()][position.getColumn()];
}
public Piece piece(int i, int j) {
	return pieces[i][j];
}
public void placePiece(Piece piece, Position position) {
	pieces[position.getRown()][position.getColumn()]= piece;
    piece.position = position;
}






}
