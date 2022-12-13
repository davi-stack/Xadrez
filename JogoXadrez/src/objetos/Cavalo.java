package objetos;

import java.util.ArrayList;
import java.util.List;

public class Cavalo implements Peca{
	    Posicao pAtual;
	    List<Posicao> opcMov;
	    
	    void atualizarOpc() {
	    	this.mov1();
	    	this.mov2();
	    	this.mov3();
	    	this.mov4();
	    	this.mov5();
	    	this.mov6();
	    	this.mov7();
	    	this.mov8();
	    }
	    Posicao mov1(){
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        //retorna a primeira opção de movimento
	        atual.linha -=2;
	        atual.coluna -=1;
	        if((atual.linha>0&&atual.linha<8)
	        		&&(atual.coluna>0&&atual.coluna<8)) {
	        	this.opcMov.add(atual);
	        	return atual;
	        }else {
	        	atual.setPosicao(-1, -1);
	        	return atual;
	        }
	    }
		Posicao mov2(){
	        //retorna a segunda opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha -=2;
	        atual.coluna +=1;
	        if((atual.linha>0&&atual.linha<8)
	        		&&(atual.coluna>0&&atual.coluna<8)) {
	        	this.opcMov.add(atual);
	        	return atual;
	        }else {
	        	atual.setPosicao(-1, -1);
	        	return atual;
	        }
	    }
	    Posicao mov3(){
	        //retorna a terceira opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha +=2;
	        atual.coluna +=1;
	        if((atual.linha>0&&atual.linha<8)
	        		&&(atual.coluna>0&&atual.coluna<8)) {
	        	this.opcMov.add(atual);
	        	return atual;
	        }else {
	        	atual.setPosicao(-1, -1);
	        	return atual;
	        }
	    }
	    Posicao mov4(){
	        //retorna a quarta opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha +=2;
	        atual.coluna -=1;
	        if((atual.linha>0&&atual.linha<8)
	        		&&(atual.coluna>0&&atual.coluna<8)) {
	        	this.opcMov.add(atual);
	        	return atual;
	        }else {
	        	atual.setPosicao(-1, -1);
	        	return atual;
	        }
	    }
	    Posicao mov5(){
	        //retorna a quarta opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha -=1;
	        atual.coluna -=2;
	        if((atual.linha>0&&atual.linha<8)
	        		&&(atual.coluna>0&&atual.coluna<8)) {
	        	this.opcMov.add(atual);
	        	return atual;
	        }else {
	        	atual.setPosicao(-1, -1);
	        	return atual;
	        }
	    }
	    Posicao mov6(){
	        //retorna a quarta opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha +=1;
	        atual.coluna -=2;
	        if((atual.linha>0&&atual.linha<8)
	        		&&(atual.coluna>0&&atual.coluna<8)) {
	        	this.opcMov.add(atual);
	        	return atual;
	        }else {
	        	atual.setPosicao(-1, -1);
	        	return atual;
	        }
	    }
	    Posicao mov7(){
	        //retorna a quarta opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha +=1;
	        atual.coluna +=2;
	        if((atual.linha>0&&atual.linha<8)
	        		&&(atual.coluna>0&&atual.coluna<8)) {
	        	this.opcMov.add(atual);
	        	return atual;
	        }else {
	        	atual.setPosicao(-1, -1);
	        	return atual;
	        }
	    }
	    Posicao mov8(){
	        //retorna a quarta opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha +=1;
	        atual.coluna -=2;
	        if((atual.linha>0&&atual.linha<8)
	        		&&(atual.coluna>0&&atual.coluna<8)) {
	        	this.opcMov.add(atual);
	        	return atual;
	        }else {
	        	atual.setPosicao(-1, -1);
	        	return atual;
	        }
	    }
	    
	    public Posicao getpAtual() {
			return this.pAtual;
		}
	    public Cavalo(int a, int b) {	
	    	this.pAtual = new Posicao(a, b);
	    	this.opcMov = new ArrayList<Posicao>();
	    	this.atualizarOpc();//atualiza as opcDeMov
	    	
	    }
	    	public Cavalo() {
	    		
	    	}
			
		
	    
	    /*int QuantOpcDeMov(){
       
	        ConjCasas retorno = new ConjCasas();
	        if(this.mov1().linha>0&&((this.mov1()).linha<9)&&((this.mov1()).coluna>0)&&((this.mov1()).coluna<9)){
	            retorno.quant++;
	        }
	        if(this.mov2().linha>0&&((this.mov2()).linha<9)&&((this.mov2()).coluna>0)&&((this.mov2()).coluna<9)){
	            retorno.quant++;
	        }
	        if(this.mov3().linha>0&&((this.mov3()).linha<9)&&((this.mov3()).coluna>0)&&((this.mov3()).coluna<9)){
	            retorno.quant++;
	        }
	        if(this.mov4().linha>0&&((this.mov4()).linha<9)&&((this.mov4()).coluna>0)&&((this.mov4()).coluna<9)){
	            retorno.quant++;
	        }
	        if(this.mov5().linha>0&&((this.mov5()).linha<9)&&((this.mov5()).coluna>0)&&((this.mov5()).coluna<9)){
	            retorno.quant++;
	        }
	        if(this.mov6().linha>0&&((this.mov6()).linha<9)&&((this.mov6()).coluna>0)&&((this.mov6()).coluna<9)){
	            retorno.quant++;
	        }
	        if(this.mov7().linha>0&&((this.mov7()).linha<9)&&((this.mov7()).coluna>0)&&((this.mov7()).coluna<9)){
	            retorno.quant++;
	        }
	        if(this.mov8().linha>0&&((this.mov8()).linha<9)&&((this.mov8()).coluna>0)&&((this.mov8()).coluna<9)){
	            retorno.quant++;
	        }
	        return retorno;}
	    public Cavalo(int a, int b){
	    	this.pAtual = new Posicao();
	    	this.pAtual.setPosicao(a, b);
	    }*/
		@Override
		public void mover(int a, int b) {
			this.getpAtual().setPosicao(a, b);//muda a posicao da peca
			// depois de mudar a posica
			this.opcMov.clear();//limpa as opcoes de movimento
		}
		
	
		
		@Override
		public void kill() {
			// TODO Auto-generated method stub
			
		}
		
		public String imprimirOpcMov() {
			String retorno = "";
			for(int i=0;i<this.opcMov.size();i++) {
				retorno += this.opcMov.get(i).toString();
				if(i<this.opcMov.size()-1) {
					retorno += ", ";
				}
			}
			return retorno;
		}
		@Override
		public void mover() {
			// TODO Auto-generated method stub
			
		}
		
		
		
}
