package objetos;

import java.util.ArrayList;

import objetos.Pecas.Bispo;
import objetos.Pecas.Cavalo;
import objetos.Pecas.Peao;
import objetos.Pecas.Peca;
import objetos.Pecas.PecaSimples;
import objetos.Pecas.Rainha;
import objetos.Pecas.Rei;
import objetos.Pecas.Torre;

public class Time {
	ArrayList<Peca> pecasNoTabuleiro;
	String cor;
	protected Peca rei;
    protected Peca rainha;
    protected Peca bispo1;
    protected Peca bispo2;
    protected Peca torre1;
    protected Peca torre2;
    protected Peca cavalo1;
    protected Peca cavalo2;
    protected ArrayList<Peao> peoes;
    @SuppressWarnings("static-access")
	public boolean ocupaPosicao(Posicao p) {
    	boolean tem = false;//diz se a posicao eh opupada por uma peca do time
    	for(int i=0;i<this.pecasNoTabuleiro.size();i++) {
    		if(this.pecasNoTabuleiro.get(i).pAtual==p) {
    			tem = true;
    		}
    	}
    	return tem;
    }
    @SuppressWarnings("static-access")
	public Peca selecionarPeca(Posicao p) {
    	Peca retorno = null;
    	for(int i=0;i<this.pecasNoTabuleiro.size();i++) {
    		if(this.pecasNoTabuleiro.get(i).pAtual==p) {
    		   retorno =this.pecasNoTabuleiro.get(i);
    		}
    	}
		return retorno;
    }
    public Time(String cor){
    	this.pecasNoTabuleiro = new ArrayList<>();
    	this.cor = cor;
    	this.peoes = new ArrayList<Peao>();
    	if(this.cor =="branco" ) {    	
    	for(int i=0;i<8;i++){
	        this.peoes.add(new Peao(6,i));
	        }
    	//this.casas[7][7]='t';//essa posicao tem uma torre, t==torre
    	this.torre1 = new Torre(7, 7);
	    //this.casas[7][0]='t';//essa posicao tem uma torre, t==torre
    	this.torre2 = new Torre(7, 0);
    	
	    //this.casas[7][6]='c';//essa posicao tem uma cavalo, c==cavalo
	    //criar cavalo
	    this.cavalo1 = new Cavalo(7, 6);
	    
	    //this.casas[7][1]='c';//essa posicao tem uma cavalo, c==cavalo
	    this.cavalo2 = new Cavalo(7, 1);
	    //this.casas[7][5]='c';//essa posicao tem uma bispo, b=bispo
	    this.bispo1 = new Bispo(7, 5);
	    
	    //this.casas[7][2]='b';//essa posicao tem uma bispo, b=bispo
	    this.bispo2 = new Bispo(7, 2);
	    //this.casas[7][3]='r';//essa posicao é a do rei, r = rei
	    this.rei = new Rei(7, 3);
	    //this.casas[7][4]='q';//essa posicao é a do rainha, q ==rainha
	    this.rainha = new Rainha(7, 4);

    	}else {
    		for(int i=0;i<8;i++){
    	        this.peoes.add(new Peao(6,i));
    	        }
        	//this.casas[7][7]='t';//essa posicao tem uma torre, t==torre
        	this.torre1 = new Torre(0, 7);
        	
    	    //this.casas[7][0]='t';//essa posicao tem uma torre, t==torre
        	this.torre2 = new Torre(0, 0);
        	
    	    //this.casas[7][6]='c';//essa posicao tem uma cavalo, c==cavalo
    	    //criar cavalo
    	    this.cavalo1 = new Cavalo(0, 6);
    	    
    	    //this.casas[7][1]='c';//essa posicao tem uma cavalo, c==cavalo
    	    this.cavalo2 = new Cavalo(0, 1);
    	    //this.casas[7][5]='c';//essa posicao tem uma bispo, b=bispo
    	    this.bispo1 = new Bispo(0, 5);
    	    
    	    //this.casas[7][2]='b';//essa posicao tem uma bispo, b=bispo
    	    this.bispo2 = new Bispo(0, 2);
    	    //this.casas[7][3]='r';//essa posicao é a do rei, r = rei
    	    this.rei = new Rei(0, 4);
    	    //this.casas[7][4]='q';//essa posicao é a do rainha, q ==rainha
    	    this.rainha = new Rainha(0, 3);

    	}
    	this.pecasNoTabuleiro.add(torre1);
    	this.pecasNoTabuleiro.add(torre2);
    	this.pecasNoTabuleiro.add(cavalo1);
    	this.pecasNoTabuleiro.add(cavalo2);
    	this.pecasNoTabuleiro.add(rei);
    	this.pecasNoTabuleiro.add(rainha);
    	this.pecasNoTabuleiro.add(bispo1);
    	this.pecasNoTabuleiro.add(bispo2);
    	for(int i=0;i<8;i++) {
    		this.pecasNoTabuleiro.add(this.peoes.get(i));
    	}
    	
    	
    }
 public void atualizar() {
    	
    	for(int i=0;i<this.pecasNoTabuleiro.size();i++) {
    		this.pecasNoTabuleiro.get(i).atualizarOpcMov();
    	}
    }
	public ArrayList<Peca> getPecasNoTabuleiro() {
		return pecasNoTabuleiro;
	}
	public void setPecasNoTabuleiro(ArrayList<Peca> pecasNoTabuleiro) {
		this.pecasNoTabuleiro = pecasNoTabuleiro;
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Peca getRei() {
		return this.rei;
	}
	public void setRei(PecaSimples rei) {
		this.rei = rei;
	}
	public Peca getRainha() {
		return this.rainha;
	}
	public void setRainha(PecaSimples rainha) {
		this.rainha = rainha;
	}
	public Peca getBispo1() {
		return this.bispo1;
	}
	public void setBispo1(PecaSimples bispo1) {
		this.bispo1 = bispo1;
	}
	public Peca getBispo2() {
		return this.bispo2;
	}
	public void setBispo2(PecaSimples bispo2) {
		this.bispo2 = bispo2;
	}
	public Peca getTorre1() {
		return this.torre1;
	}
	public void setTorre1(PecaSimples torre1) {
		this.torre1 = torre1;
	}
	public Peca getTorre2() {
		return this.torre2;
	}
	public void setTorre2(PecaSimples torre2) {
		this.torre2 = torre2;
	}
	public Peca getCavalo1() {
		return this.cavalo1;
	}
	public void setCavalo1(PecaSimples cavalo1) {
		this.cavalo1 = cavalo1;
	}
	public Peca getCavalo2() {
		return this.cavalo2;
	}
	public void setCavalo2(PecaSimples cavalo2) {
		this.cavalo2 = cavalo2;
	}
	public ArrayList<Peao> getPeoes() {
		return this.peoes;
	}
	
}
