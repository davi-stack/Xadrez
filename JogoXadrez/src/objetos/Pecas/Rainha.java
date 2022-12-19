package objetos.Pecas;

import objetos.Posicao;

//package objetos;

public class Rainha extends PecaSimples implements Peca{
    public Rainha(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
    
	public Rainha(int a, int b, char c) {
		super(a, b);
    	this.time = c;	}
	public void mover(){

    }
    public void kill(){

    }
    Posicao pAtual;
	
}
