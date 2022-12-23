package objetos.Pecas;

import java.util.ArrayList;
import java.util.List;

import objetos.Posicao;

public class Peao extends PecaSimples implements Peca{
	public Posicao pAtual;
	protected char simbolo;
	protected char time;
    public Peao(int a, int b) {
     this.simbolo = 'p';
	    
   	 this.pAtual = new Posicao(a, b);
        this.opcMov = new ArrayList<Posicao>();
        this.time = 'm';
	}
	
public Posicao getpAtual() {
		return pAtual;
	}

	public void setpAtual(Posicao pAtual) {
		this.pAtual = pAtual;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	public char getTime() {
		return time;
	}

	public void setTime(char time) {
		this.time = time;
	}

	public void setOpcMov(ArrayList<Posicao> opcMov) {
		this.opcMov = opcMov;
	}

public void mover(Posicao a) {
		// TODO Auto-generated method stub
		this.setpAtual(a);
	}
	
	Posicao opcMov1(){
		Posicao retorno = new Posicao(this.getpAtual()
    			.getLinha() +1, 
    			          this.getpAtual().getColuna());
		//uma linha a mais e a mesma coluna
        //retorna a primeira opção de movimento
      
	    if((retorno.getLinha()>=0)&&  (retorno.getLinha()<8)&&
	    		  (retorno.getColuna()<8)&& (retorno.getColuna()>=0)) {
	    	this.opcMov.add(retorno);
	    	return retorno;
	    }else {
	    	return retorno;
	    }
	    	
	}
	Posicao opcMov2(){
		Posicao retorno = new Posicao(this.getpAtual()
    			.getLinha() +2, 
    			          this.getpAtual().getColuna());
		//uma linha a mais e a mesma coluna
        //retorna a primeira opção de movimento
        
	    if((retorno.getLinha()>=0)&&  (retorno.getLinha()<8)&&
	    		  (retorno.getColuna()<8)&& (retorno.getColuna()>=0)) {
	    	this.opcMov.add(retorno);
	    	return retorno;
	    }else {
	    	return retorno;
	    }
	    	
	}
	Posicao opcMov3(){
		Posicao retorno = new Posicao(this.getpAtual()
    			.getLinha()  +1, 
    			          this.getpAtual().getColuna()-1);
		//uma linha a mais e a mesma coluna
        //retorna a primeira opção de movimento
        
	    if((retorno.getLinha()>=0)&&  (retorno.getLinha()<8)&&
	    		  (retorno.getColuna()<8)&& (retorno.getColuna()>=0)) {
	    	this.opcMov.add(retorno);
	    	return retorno;
	    }else {
	    	return retorno;
	    }
	    	
	}
	Posicao opcMov4(){
		Posicao retorno = new Posicao(this.getpAtual()
    			.getLinha()  +1, 
    			          this.getpAtual().getColuna()+1);
		//uma linha a mais e a mesma coluna
        //retorna a primeira opção de movimento
        
	    if((retorno.getLinha()>=0)&&  (retorno.getLinha()<8)&&
	    		  (retorno.getColuna()<8)&& (retorno.getColuna()>=0)) {
	    	this.opcMov.add(retorno);
	    	return retorno;
	    }else {
	    	return retorno;
	    }
	    	
	}
	ArrayList<Posicao> opcMov = new ArrayList<>();
	
		
	public void atualizarOpcMov() {
		this.opcMov.clear();
		this.opcMov1();
		this.opcMov2();
		this.opcMov3();
		this.opcMov4();
	}
	
	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}
	
	public void mover(int i, int j) {
		this.pAtual.setPosicao(i, j);
		
	}
	@Override
	public List<Posicao> getOpcMov() {
		// TODO Auto-generated method stub
		return this.opcMov;
	}


	

	
}
