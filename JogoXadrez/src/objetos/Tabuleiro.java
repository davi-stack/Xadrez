package objetos;

import java.util.ArrayList;
import java.util.List;

import objetos.Pecas.Bispo;
import objetos.Pecas.Cavalo;
import objetos.Pecas.Peao;
import objetos.Pecas.PecaSimples;
import objetos.Pecas.Torre;
import objetos.Pecas.Rainha;
import objetos.Pecas.Rei;
public class Tabuleiro {
	protected char casas[][] = new char[8][8];
    protected int jogadas;
    
    Time timeCima;
    Time timeBaixo;
    
    
    
    public char[][] getCasas() {
		return casas;
	}
    public char getCasa(Posicao c) {
    	return this.casas[c.getLinha()][c.getColuna()];
    }

	public void setCasas(char[][] casas) {
		this.casas = casas;
	}

	public int getJogadas() {
		return jogadas;
	}

	public void setJogadas(int jogadas) {
		this.jogadas = jogadas;
	}

	

	
	void mover(Tabuleiro tabu, Posicao init, Posicao end){
    tabu.casas[end.linha][end.coluna] = tabu.casas[init.linha][init.coluna];
    tabu.casas[init.linha][init.coluna] = '*';
    }
    
   
    public void imprimir(){
    	for(int i=0;i<8;i++) {
    		for(int ii=0;ii<8;ii++) {
    			System.out.printf(this.casas[i][ii]+ " ");
    		}
    		System.out.println();
    	}
    }
    
    public Tabuleiro() {
    	
    	this.casas = new char[8][8];
    	this.jogadas =0;
    	for(int i=0;i<8;i++) {
    		for(int ii=0;ii<8;ii++) {
    			casas[i][ii]= '*';
    		}
    	}
    	this.timeCima = new Time("branco");
    	this.timeBaixo = new Time("preto");
	    
	     
	    
    }

	public Time getTimeCima() {
		return this.timeCima;
	}

	public void setTimeCima(Time timeCima) {
		this.timeCima = timeCima;
	}

	public Time getTimeBaixo() {
		return this.timeBaixo;
	}

	public void setTimeBaixo(Time timeBaixo) {
		this.timeBaixo = timeBaixo;
	}
    
    
    
}
