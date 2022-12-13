package objetos;
public class Posicao {
	@Override
	public String toString() {
		return "[" + this.linha + ", " + this.coluna + "]";
	}
	int linha;
    int coluna;
    void setPosicao(int l, int c){
        this.linha = l;
        this.coluna = c;
    }
    Posicao(int l, int c){
        this.linha = l;
        this.coluna = c;
    }
    Posicao(){
        
    }
}
