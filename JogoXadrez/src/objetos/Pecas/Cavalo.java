package objetos.Pecas;

import java.util.ArrayList;
import java.util.List;

import objetos.Posicao;

public class Cavalo extends PecaSimples implements Peca{
	    Posicao pAtual = new Posicao();
	    List<Posicao> opcMov = new ArrayList<Posicao>();
	    
	    public Cavalo(int i, int j) {
			// TODO Auto-generated constructor stub
	    	super(i, j);
		}
		public void atualizarOpc() {
	    	this.mov1();
	    	this.mov2();
	    	this.mov3();
	    	this.mov4();
	    	this.mov5();
	    	this.mov6();
	    	this.mov7();
	    	this.mov8();
	    }
	    Posicao mov1() {
	    	Posicao retorno = new Posicao(this.getpAtual()
	    			.getLinha()  -2, 
	    			          this.getpAtual().getColuna()-1);
	        //retorna a primeira opção de movimento
	        if((retorno.linha>=0&&retorno.linha<8)
	        		&&(retorno.coluna>0&&retorno.coluna<8)) {
	        	this.opcMov.add(retorno);
	        	return retorno;
	        }else {
	        	retorno.setPosicao(-1, -1);
	        	return retorno;
	        }
	        
	    }
	    Posicao mov2() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()-2, this.getpAtual().getColuna()+1);
	        //retorna a primeira opção de movimento
	        if((retorno.linha>=0&&retorno.linha<8)
	        		&&(retorno.coluna>0&&retorno.coluna<8)) {
	        	this.opcMov.add(retorno);
	        	return retorno;
	        }else {
	        	retorno.setPosicao(-1, -1);
	        	return retorno;
	        }
	    }
	    Posicao mov3() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()+2, this.getpAtual().getColuna()+1);
	        //retorna a primeira opção de movimento
	        if((retorno.linha>=0&&retorno.linha<8)
	        		&&(retorno.coluna>0&&retorno.coluna<8)) {
	        	this.opcMov.add(retorno);
	        	return retorno;
	        }else {
	        	retorno.setPosicao(-1, -1);
	        	return retorno;
	        }
	    }
	    Posicao mov4() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()+2, this.getpAtual().getColuna()-1);
	        //retorna a primeira opção de movimento
	        if((retorno.linha>=0&&retorno.linha<8)
	        		&&(retorno.coluna>0&&retorno.coluna<8)) {
	        	this.opcMov.add(retorno);
	        	return retorno;
	        }else {
	        	retorno.setPosicao(-1, -1);
	        	return retorno;
	        }
	    }
	    Posicao mov5() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()-1, this.getpAtual().getColuna()+2);
	        //retorna a primeira opção de movimento
	        if((retorno.linha>=0&&retorno.linha<8)
	        		&&(retorno.coluna>0&&retorno.coluna<8)) {
	        	this.opcMov.add(retorno);
	        	return retorno;
	        }else {
	        	retorno.setPosicao(-1, -1);
	        	return retorno;
	        }
	    }
	    
	    Posicao mov6() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()+1, this.getpAtual().getColuna()+2);
	        //retorna a primeira opção de movimento
	        if((retorno.linha>=0&&retorno.linha<8)
	        		&&(retorno.coluna>0&&retorno.coluna<8)) {
	        	this.opcMov.add(retorno);
	        	return retorno;
	        }else {
	        	retorno.setPosicao(-1, -1);
	        	return retorno;
	        }
	    }
	    
	    Posicao mov7() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()+1, this.getpAtual().getColuna()-2);
	        //retorna a primeira opção de movimento
	        if((retorno.linha>=0&&retorno.linha<8)
	        		&&(retorno.coluna>0&&retorno.coluna<8)) {
	        	this.opcMov.add(retorno);
	        	return retorno;
	        }else {
	        	retorno.setPosicao(-1, -1);
	        	return retorno;
	     
	    }
	    }
	    Posicao mov8() {
	    	Posicao retorno = new Posicao(this.getpAtual() 
	    			          .getLinha()-1, this.getpAtual().getColuna()-2);
	        //retorna a primeira opção de movimento
	        if((retorno.linha>=0&&retorno.linha<8)
	        		&&(retorno.coluna>0&&retorno.coluna<8)) {
	        	this.opcMov.add(retorno);
	        	return retorno;
	        }else {
	        	retorno.setPosicao(-1, -1);
	        	return retorno;
	        }
	    }
	        
	    
	    public Posicao getpAtual() {
			return this.pAtual;
		}
	    
	    	
		@Override
		public void kill() {
			// TODO Auto-generated method stub
			
		}
		
		
		
		@Override
		public void mover() {
			// TODO Auto-generated method stub
			
		}
		
		
		
}
