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
    
    protected PecaSimples reiM;
    protected PecaSimples rainhaM;
    protected PecaSimples bispo1M;
    protected PecaSimples bispo2M;
    protected PecaSimples torre1M;
    protected PecaSimples torre2M;
    protected PecaSimples cavalo1M;
    protected PecaSimples cavalo2M;
    protected ArrayList<Peao> peoesM;
    protected Rei rei;
    protected Rainha rainha;
    protected Bispo bispo1;
    protected Bispo bispo2;
    protected Torre torre1;
    protected Torre torre2;
    protected Cavalo cavalo1;
    protected Cavalo cavalo2;
    protected ArrayList<Peao> peoes;
    
    
    
    public char[][] getCasas() {
		return casas;
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

	public Cavalo getCavalo1() {
		return cavalo1;
	}

	public Cavalo getCavalo2() {
		return cavalo2;
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
    void atualizarTabuleiro() {
    	this.cavalo1.atualizarOpc();
    	this.cavalo2.atualizarOpc();
    	
    }
    public Tabuleiro() {
    	this.casas = new char[8][8];
    	this.jogadas =0;
    	for(int i=0;i<8;i++) {
    		for(int ii=0;ii<8;ii++) {
    			casas[i][ii]= '*';
    		}
    	}
    	
    	this.peoes = new ArrayList<Peao>();
    	this.peoesM = new ArrayList<Peao>();
    	for(int i=0;i<8;i++){
	        this.casas[1][i] = 'P';
	        this.peoesM.add(new Peao(6,i));
	        }
    	for(int i=0;i<8;i++){
	        this.casas[6][i] = 'p';
	        this.peoes.add(new Peao(6,i));
	        }
    	this.casas[7][7]='t';//essa posicao tem uma torre, t==torre
    	this.torre1 = new Torre(0, 7);
    	
	    this.casas[7][0]='t';//essa posicao tem uma torre, t==torre
    	this.torre2 = new Torre(7, 0);
    	
	    this.casas[7][6]='c';//essa posicao tem uma cavalo, c==cavalo
	    //criar cavalo
	    this.cavalo1 = new Cavalo(7, 6);
	    
	    this.casas[7][1]='c';//essa posicao tem uma cavalo, c==cavalo
	    this.cavalo2 = new Cavalo(7, 1);
	    this.casas[7][5]='c';//essa posicao tem uma bispo, b=bispo
	    this.bispo1 = new Bispo(7, 5);
	    
	    this.casas[7][2]='b';//essa posicao tem uma bispo, b=bispo
	    this.bispo2 = new Bispo(7, 2);
	    this.casas[7][3]='r';//essa posicao é a do rei, r = rei
	    this.rei = new Rei(7, 3);
	    this.casas[7][4]='q';//essa posicao é a do rainha, q ==rainha
	    this.rainha = new Rainha(7, 4);
	    
	    this.casas[0][7]='T';//essa posicao tem uma torre, t==torre
	    this.torre1M = new Torre(0, 0);
	    this.torre1M.setTime('M');
    	
	    this.casas[0][0]='T';//essa posicao tem uma torre, t==torre
    	this.torre2M = new Torre(7, 0);
    	this.torre2M.setTime('M');
	    this.casas[0][6]='C';//essa posicao tem uma cavalo, c==cavalo
	    //criar cavalo
	    this.cavalo1M = new Cavalo(0, 6);
	    this.cavalo1M.setTime('M');
	    this.casas[0][1]='C';//essa posicao tem uma cavalo, c==cavalo
	    this.cavalo2M = new Cavalo(0, 1);
	    this.cavalo2M.setTime('M');
	    this.casas[0][5]='B';//essa posicao tem uma bispo, b=bispo
	    this.bispo1M = new Bispo(0, 5);
	    this.bispo1.setTime('M');
	    
	    this.casas[0][2]='B';//essa posicao tem uma bispo, b=bispo
	    
	    this.casas[0][3]='R';//essa posicao é a do rei, r = rei
	    this.reiM = new Rei(0, 3);
	    this.reiM.setTime('M');
	    this.casas[0][4]='Q';//essa posicao é a do rainha, q ==rainha
	    this.rainhaM = new Rainha(0, 4);
	    this.atualizarTabuleiro();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
    }

	public PecaSimples getReiM() {
		return reiM;
	}

		public PecaSimples getRainhaM() {
		return rainhaM;
	}

	public PecaSimples getBispo1M() {
		return bispo1M;
	}


	public PecaSimples getBispo2M() {
		return bispo2M;
	}

	

	public PecaSimples getTorre1M() {
		return torre1M;
	}

	public PecaSimples getTorre2M() {
		return torre2M;
	}

	

	public PecaSimples getCavalo1M() {
		return cavalo1M;
	}

	

	public PecaSimples getCavalo2M() {
		return cavalo2M;
	}

	public List<PecaSimples> getPeoesM() {
		return peoesM;
	}

	public Rei getRei() {
		return rei;
	}

	public Rainha getRainha() {
		return rainha;
	}

	public Bispo getBispo1() {
		return bispo1;
	}


	public Bispo getBispo2() {
		return bispo2;
	}

	public Torre getTorre1() {
		return torre1;
	}


	public Torre getTorre2() {
		return torre2;
	}

	public ArrayList<Peao> getPeoes() {
		return this.peoes;
	}

	
    
    
    
}
