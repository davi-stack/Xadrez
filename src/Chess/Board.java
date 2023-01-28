package Chess;

import Objects.Position;
import Chess.Piece.*;

public class Board {
    protected Piece[][] casas;//lugar que reservam as pecas
    //private putAllOnBoard() {
    	//coloca todas as pecas no tabuleiro
    //}
    Rei rei;
    
    public Piece getCasa(Position n) {
    	return casas[n.getLinha()][n.getColuna()];
    }
    
    public void setCasa(Position n, Piece p) {
    	casas[n.getLinha()][n.getColuna()] = p;
    }
    
    private void InitialSetup() {
    	Rei rei = new Rei(4, 3, Team.BLACK);
    	Rei rei1 = new Rei(3, 5, Team.WHITE);
    	Rei rei2 = new Rei(3, 4, Team.WHITE);
    	Horse c1 = new Horse(Team.BLACK, 2, 4);
        setCasa(rei.getPosicaoAtual(), rei);//a posicao que rei estava recebe o rei
        setCasa(rei1.getPosicaoAtual(), rei1);
        setCasa(rei2.getPosicaoAtual(), rei2);
        setCasa(c1.getPosicaoAtual(), c1);
        rei1.atualizarOpcMov(this);
        rei.atualizarOpcMov(this);
        rei2.atualizarOpcMov(this);
        c1.atualizarOpcMov(this);
    }
    public Piece getCasa(int a, int b) {
    	return casas[a][b];
    }
    public Piece makeMove(Position origin, Position target){
    	
    	if(this.getCasa(origin)==null){
    		throw new ChessException("Position origin dont be in the board");
    	}else {
    		if(!this.getCasa(origin).canMoveTo(target)) {
    			throw new ChessException("Position target is unavailable");
    		}
    		//primeiro vou salvar peca na posicao alvo
    		this.getCasa(origin).getOpcMov().contains(target);
    		this.setCasa(target,this.getCasa(origin));
    		this.setCasa(origin, null);
    		this.atualizarBoard();
    		return this.getCasa(target);
    		
    	}
    }
    public void atualizarBoard() {
    	for(int i=0;i<8;i++) {
    		for(int ii=0;ii<8;ii++) {
    			if(this.getCasa(i, ii)!=null)
    				this.getCasa(i, ii).getOpcMov().clear();
    				this.getCasa(i, ii).atualizarOpcMov(this);
    			
    		}
    	}
    }
    
    public Piece makeMove(int a, int b, int c, int d){
    	var origin =new Position(a, b);
    	var target = new Position(c, d);
    	return makeMove(origin, target);
    }
    public boolean isOnBoard(Position p) {
    	//diz se uma posicao está dentro do tabuleiro ou não
    	return (p.getLinha()<8&&p.getLinha()>=0)&&
    			(p.getColuna()<8&&p.getColuna()>=0);
    }
    public void printBoard() {
    	for(int ii=0;ii<8;ii++) {
    		for(int i=0;i<8;i++) {
    			if(casas[ii][i]==null)
    			System.out.print(" - ");
    			else {
    			System.out.print(" " +this.getCasa(ii, i)+ " ");
    		}}
    		System.out.println();
    	}
    }
    public Board() {
    	this.casas = new Piece[8][8];
    	this.InitialSetup();
    }
}
