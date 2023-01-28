package Objects;

public class Position {
private int linha;
private int coluna;
public int getLinha() {
	return linha;
}
public Position(int linha, int coluna) {
	this.linha = linha;
	this.coluna = coluna;
}
public void setLinha(int linha) {
	this.linha = linha;
}
public int getColuna() {
	return coluna;
}
public void setColuna(int coluna) {
	this.coluna = coluna;
}
public boolean equals(Position p) {
	return (p.getLinha()==linha && p.getColuna()==coluna);
}
public String toString() {
	return "(" + this.linha + " " + this.coluna + ")";
}

public boolean isOnBoard() {
	return (linha>=0&&linha<8)&&(coluna>=0&&coluna<8);
}

}
