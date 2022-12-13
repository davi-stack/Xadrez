package objetos;

public class Tabuleiro {
	protected char casas[][];
    protected int jogadas;
    protected Cavalo cavalo1;
    protected Cavalo cavalo2;
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

	public void setCavalo1(Cavalo cavalo1) {
		this.cavalo1 = cavalo1;
	}

	public Cavalo getCavalo2() {
		return cavalo2;
	}

	public void setCavalo2(Cavalo cavalo2) {
		this.cavalo2 = cavalo2;
	}

	void mover(Tabuleiro tabu, Posicao init, Posicao end){
    tabu.casas[end.linha][end.coluna] = tabu.casas[init.linha][init.coluna];
    tabu.casas[init.linha][init.coluna] = '*';
    }
    
    /*
     tabuleiro[7][7]='t';//essa posicao tem uma torre, t==torre
	    tabuleiro[7][0]='t';//essa posicao tem uma torre, t==torre
	    tabuleiro[7][6]='c';//essa posicao tem uma cavalo, c==cavalo
	    tabuleiro[7][1]='c';//essa posicao tem uma cavalo, c==cavalo
	    tabuleiro[7][5]='b';//essa posicao tem uma bispo, b=bispo
	    tabuleiro[7][2]='b';//essa posicao tem uma bispo, b=bispo
	    tabuleiro[7][3]='r';//essa posicao é a do rei, r = rei
	    tabuleiro[7][4]='q';//essa posicao é a do rainha, q ==rainha
     */
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
    	for(int i=0;i<8;i++){
	        this.casas[6][i] = 'p';
	        }
    	this.casas[7][7]='t';//essa posicao tem uma torre, t==torre
	    this.casas[7][0]='t';//essa posicao tem uma torre, t==torre
	    this.casas[7][6]='c';//essa posicao tem uma cavalo, c==cavalo
	    //criar cavalo
	    this.cavalo1 = new Cavalo(7, 6);
	    this.casas[7][1]='c';//essa posicao tem uma cavalo, c==cavalo
	    this.casas[7][5]='b';//essa posicao tem uma bispo, b=bispo
	    this.casas[7][2]='b';//essa posicao tem uma bispo, b=bispo
	    this.casas[7][3]='r';//essa posicao é a do rei, r = rei
	    this.casas[7][4]='q';//essa posicao é a do rainha, q ==rainha
	    
    }
}
