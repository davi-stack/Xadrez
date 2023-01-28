package Chess.Piece;

import java.util.ArrayList;

import Chess.Board;
import Objects.Position;

public class Piece {
  protected int rounds;
  protected void mover(Position p) {
	  //mover a partir de uma posicao
	  posicaoAtual=p;
  }
 
  public char simbolo;
  protected void mover(int a, int b) {
	  this.posicaoAtual.setLinha(a);
	  this.posicaoAtual.setColuna(b);
  }
  protected Position Calcmover(int a, int b) {
	  //calcula movimento para add nas opc de mov
	  Position p = new Position(posicaoAtual.getLinha()+a, posicaoAtual.getColuna()+a);
	  return p;
  }
  private void possibleKill(Board board, Position p) {
	  //captura uma peça se os times forem diferente
	  if(this.team!=board.getCasa(p).team) {
		  this.opcMov.add(p);
	  }
  }
  public void imprimirOpcMov() {
	  for(Position p : this.opcMov) {
		  System.out.print(p);
	  }
  }
  protected boolean validateOptMove(Board board, Position p) {
	  /*vai checar se uma posivel opção de movimento segue as seguintes exigenias:
	   * esta dentro do tabuleiro, se não estiver ele vai retornar falso
	   * não tem uma peca, se tiver ele vai retornar falso
	   * se estiver uma peça na posicao ele vai checar se ela eh do mesmo time
	   * se não for ele adiciona nas opcao de movimento da peca
	   */
	  if(!p.isOnBoard()) {
		  return false;
	  }else {
		  //peca precisa estar dentro do tabuleiro
		  if(board.getCasa(p)==null) {
			  //se a posicao estiver vazia
			  this.opcMov.add(p);
			  return true;
		  }else {
			  this.possibleKill(board, p);
			  /*
			   * adiciona ás opcoes de movimento se os times forem diferentes
			   */
			  return false;
		  }
		  
	  }
	  
  }
  private Team team;
  protected ArrayList<Position> opcMov = new ArrayList<>();
  
  private Position posicaoAtual;


public Position getPosicaoAtual() {
	return posicaoAtual;
}
public void setPosicaoAtual(Position posicaoAtual) {
	this.posicaoAtual = posicaoAtual;
}
  protected Position aPartirDaPositionAtual(int a, int b) {
	  //move 'a' linhas e b colunas
	  Position p = new Position(posicaoAtual.getLinha()-a,posicaoAtual.getColuna()-b);
      return p;
  }
  
  public boolean canMoveTo(Position position) {
	  boolean retorno = false;
	  for(Position  p: this.opcMov) {
		  if(p.equals(position)) {
			  retorno = true;
		  }
	  }
	  return retorno;
  }
  public Piece(char simbolo, Team team, Position posicaoAtual) {
	
	this.simbolo = simbolo;
	this.team = team;
	this.posicaoAtual = posicaoAtual;
	this.rounds = 0;
}
public String toString() {
		return "" + this.simbolo;
	}
public String getSimbolo() {
	// TODO Auto-generated method stub
	return ""+ this.simbolo;
}
protected void senseOfMov1(Board b) {
	
}
protected void senseOfMov2(Board b) {
	
}
protected void senseOfMov3(Board b) {
	
}
protected void senseOfMov4(Board b) {
	
}
protected void senseOfMov5(Board b) {
	
}
protected void senseOfMov6(Board b) {
	
}
protected void senseOfMov7(Board b) {
	
}
protected void senseOfMov8(Board b) {
	
}

public void atualizarOpcMov(Board b) {
	//vai atualizar as opcDeMov
	//qualquer peça tem no maximo 8 sentidos de opcoes de movimento
	this.senseOfMov1(b);
	this.senseOfMov2(b);
	this.senseOfMov3(b);
	this.senseOfMov4(b);
	this.senseOfMov5(b);
	this.senseOfMov6(b);
	this.senseOfMov7(b);
	this.senseOfMov8(b);
}
public Team getTeam() {
	return team;
}
protected void setTeam(Team team) {
	this.team = team;
}
public ArrayList<Position> getOpcMov() {
	return this.opcMov;
}
  
}
