package application.Main;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import Objects.Position;
import Chess.Board;
import Chess.Piece.ChessException;
import Chess.Piece.Team;

public class UI {
	
	Board tabuleiro = new Board();
	private Team rodada;
	private void setRodada() {
		if(this.rodada==Team.BLACK) {
			this.rodada = Team.WHITE;
		}else {
			this.rodada = Team.BLACK;

		}
	}
	public static void clearScreen()  {
	if(System.getProperty("os.name").contains("Windows")) {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else {
		try {
			Runtime.getRuntime().exec("clear");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
public UI() {
		super();
		this.rodada = Team.WHITE;
	}
public boolean moverPeca(Scanner sr) {
	int a, b, c, d;
	try {
	System.out.print("Position origin: ");
	a = sr.nextInt();
	b = sr.nextInt();
	System.out.println();
	var p1 = new Position(a, b);
	if(!p1.isOnBoard()) {
		throw new ChessException("Position origin is out of the Board");
	}
	if(tabuleiro.getCasa(p1)==null) {
		throw new ChessException("Position dont have a Piece");
	}
	if(tabuleiro.getCasa(p1).getTeam()!=this.rodada) {
		throw new ChessException("pliese select a Piece "+ this.rodada);
	}
	System.out.println(tabuleiro.getCasa(p1));
	tabuleiro.getCasa(p1).imprimirOpcMov();
    System.out.println();
	System.out.print("Position target: ");
	c = sr.nextInt();
	d = sr.nextInt();
	System.out.println();
	var p2 = new Position(c, d);
	if(!new Position(c, d).isOnBoard()) {
		throw new ChessException("Position target is not in the Board");
	}
	if(!tabuleiro.getCasa(p1).canMoveTo(p2)) {
		throw new ChessException("This piece dont can go to this position");
	}
			tabuleiro.makeMove(a, b, c, d);
	}catch(ChessException e) {
		System.out.println(e.getMessage());
		sr.nextLine();
		//e.printStackTrace();
		return false;
	}
	catch(InputMismatchException e) {
		System.out.println(e.getMessage());
		sr.nextLine();
		//e.printStackTrace();
		return false;
	}
	catch(NullPointerException e) {
		System.out.println("Piece Origin doesnt exist");
		sr.nextLine();
		return false;
	}
	return true;
	//tabuleiro.printBoard();
}
public void chessMove(Scanner sr) {
	System.out.println("Team BLACK is Tiny(minusculo)");
	System.out.print("Round: "+ this.rodada+ "\n");
	this.tabuleiro.printBoard();
    if(this.moverPeca(sr)) {
    	this.setRodada();//se der certo o movimento o jogador a jogar vai mudar
    }
    //UI.clearScreen();
}
public void game(Scanner sr) {
	while(true) {
		chessMove(sr);
		
	}
}
}
