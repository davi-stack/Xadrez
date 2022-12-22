package objetos;
public class Posicao {
	@Override
	public String toString() {
		return "[" + this.linha + ", " + this.coluna + "]";
	}
	public int linha =0;
    public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	public int coluna =0;
    public void setPosicao(int l, int c){
        this.linha = l;
        this.coluna = c;
    }
    public Posicao(int l, int c){
        this.linha = l;
        this.coluna = c;
    }
    boolean equals(Posicao a) {
    	if((this.linha == a.linha)&&(this.coluna == a.coluna)){
    		return true;
    	}else {
    		return false;
    	}
    }
    public boolean DentroDoTabuleiro() {
    	return ((this.linha<8)&&(this.linha>=0)&&(this.coluna<8)&&(this.coluna>=0));
    }
    public Posicao(){
        this.linha = 0;
        this.coluna = 0;
        }
}
