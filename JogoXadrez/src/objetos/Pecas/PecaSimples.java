package objetos.Pecas;

import java.util.ArrayList;
import java.util.List;

import objetos.Posicao;

public abstract class PecaSimples implements Peca{
	protected char time;
	public char getTime() {
		return time;
	}

	public void setTime(char time) {
		this.time = time;
	}
	public void kill() {
	}

	public Posicao pAtual = new Posicao();
	protected ArrayList<Posicao> opcMov = new ArrayList<Posicao>();
    
	
    
		
	
    char simbolo;
    
    public PecaSimples() {
   	
	  }
	public Posicao getpAtual() {
		return pAtual;
	}
	public void setpAtual(Posicao pAtual) {
		this.pAtual = pAtual;
		this.atualizarOpcMov();
	}
	
	
	
	public String imprimirOpcMov() {
		String retorno = "";
		//this.opcMov.isEmpty()==false
		if(this.opcMov.isEmpty()==false) {
		for(int i=0;i<this.opcMov.size();i++) {
			retorno += this.opcMov.get(i).toString();
			if(i<this.opcMov.size()-1) {
				retorno += ", ";
			}
		}
		return retorno;}else {
			return "\n";
		}
		}

    public PecaSimples(int a, int b, char c) {
    	 this.simbolo = c;
    	    
    	 this.pAtual = new Posicao(a, b);
         this.opcMov = new ArrayList<Posicao>();
         this.time = 'm';

    }
    public abstract void atualizarOpcMov();
	public void setpAtual(int i, int j) {
		this.pAtual.setPosicao(i, j);
	}

	public abstract List<Posicao> getOpcMov();

	public void mover(int i, int j) {
		this.pAtual.setPosicao(i, j);
		
	}
    
	
    }
