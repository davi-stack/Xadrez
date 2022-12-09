package pecas;

public class Cavalo implements Peca{
	    void toKill(){
	        
	    }
	    Posicao pAtual;
	    /*void opcoesDeMov();
	    void escolherMovimento();//vai mostrar a partir da função de opções de movimento, qual posicao que sera mudada a peça
	    void ehPossivelMov();//limita se o movimento eh possivel;
	    void toMove();//ato de mover
	    void toKill();*/
	    Posicao mov1(){
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        //retorna a primeira opção de movimento
	        atual.linha -=2;
	        atual.coluna -=1;
	        return atual;
	    }
	    Posicao mov2(){
	        //retorna a segunda opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha -=2;
	        atual.coluna +=1;
	        return atual;
	    }
	    Posicao mov3(){
	        //retorna a terceira opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha +=2;
	        atual.coluna +=1;
	        return atual;
	    }
	    Posicao mov4(){
	        //retorna a quarta opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha +=2;
	        atual.coluna -=1;
	        return atual;
	    }
	    Posicao mov5(){
	        //retorna a quarta opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha -=1;
	        atual.coluna -=2;
	        return atual;
	    }
	    Posicao mov6(){
	        //retorna a quarta opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha +=1;
	        atual.coluna -=2;
	        return atual;
	    }
	    Posicao mov7(){
	        //retorna a quarta opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha +=1;
	        atual.coluna +=2;
	        return atual;
	    }
	    Posicao mov8(){
	        //retorna a quarta opção de movimento
	        Posicao atual = new Posicao();
	        atual.linha = this.pAtual.linha;
	        atual.coluna = this.pAtual.coluna;
	        atual.linha +=1;
	        atual.coluna -=2;
	        return atual;
	    }
	    
	    ConjCasas QuantopcDeMov(){
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
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    
	        
	        
	        return retorno;
	    }
	    Cavalo(Posicao inicial){
	        this.pAtual = inicial;
	    }
	    outMov() {
	    	
	    }
}
