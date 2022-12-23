package objetos.Pecas;

import java.util.ArrayList;
import java.util.List;

import objetos.Posicao;

public class Cavalo extends PecaSimples implements Peca{
	    public Posicao pAtual = new Posicao();
	    List<Posicao> opcMov = new ArrayList<Posicao>();
	    char simbolo;
	    char time;
	    public Cavalo(int a, int b) {
	    	 this.simbolo = 'c';
	    	    
	    	 this.pAtual = new Posicao(a, b);
	         this.opcMov = new ArrayList<Posicao>();
	         this.time = 'm';
	    	
		}
		public void atualizarOpcMov() {
			this.opcMov.clear();
	    	this.mov1();
	    	this.mov2();
	    	this.mov3();
	    	this.mov4();
	    	this.mov5();
	    	this.mov6();
	    	this.mov7();
	    	this.mov8();
	    }
		public List<Posicao> getOpcMov() {
			return this.opcMov;
		}
	    void mov1() {
	    	Posicao retorno = new Posicao(this.getpAtual()
	    			.getLinha()  -2, 
	    			          this.getpAtual().getColuna()-1);
	    	
	        //retorna a primeira opção de movimento
	        if(retorno.DentroDoTabuleiro()) {
	        	this.opcMov.add(retorno);
	        	
	        }
	    	
	    	
	        
	    }
	    void mov2() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()-2, this.getpAtual().getColuna()+1);
	        //retorna a primeira opção de movimento
	        if((retorno.linha>=0&&retorno.linha<8)
	        		&&(retorno.coluna>0&&retorno.coluna<8)) {
	        	this.opcMov.add(retorno);
	        	
	        }
	    }
	    void mov3() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()+2, this.getpAtual().getColuna()+1);
	        //retorna a primeira opção de movimento
	        if(retorno.DentroDoTabuleiro()) {
	        	this.opcMov.add(retorno);
	        	
	        }
	    }
	    void mov4() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()+2, this.getpAtual().getColuna()-1);
	        //retorna a primeira opção de movimento
	        if(retorno.DentroDoTabuleiro()) {
	        	this.opcMov.add(retorno);
	        }
	    }
	    void mov5() {
	    
	    Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()-1, this.getpAtual().getColuna()+2);
	        //retorna a primeira opção de movimento
	        if(retorno.DentroDoTabuleiro()) {
	        	this.opcMov.add(retorno);
	        	
	        }
	    }
	    void mov6() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()+1, this.getpAtual().getColuna()+2);
	        //retorna a primeira opção de movimento
	        if(retorno.DentroDoTabuleiro()) {
	        	this.opcMov.add(retorno);
	        	
	        }
	    }
        void mov7() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()+1, this.getpAtual().getColuna()-2);
	        //retorna a primeira opção de movimento
	        if(retorno.DentroDoTabuleiro()) {
	        	this.opcMov.add(retorno);
	        	
	        }
	    }
	    void mov8() {
	    Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()-1, this.getpAtual().getColuna()-2);
	        //retorna a primeira opção de movimento
	        if(retorno.DentroDoTabuleiro()) {
	        	this.opcMov.add(retorno);
	        	
	        }
	    }
	      
	    
	   
	    
	    	
		@Override
		public void kill() {
			// TODO Auto-generated method stub
			
		}
		
		
		
		@Override
		public void mover(int a, int b) {
			this.pAtual.setPosicao(a, b);
		}

	
        public Posicao getpAtual() {
    		return this.pAtual;
    	}
		
		
}
