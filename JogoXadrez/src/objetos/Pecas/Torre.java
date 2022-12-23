package objetos.Pecas;

import java.util.ArrayList;

import objetos.Posicao;
import objetos.Tabuleiro;

public class Torre extends PecaSimples implements Peca{
    protected Posicao pAtual;
    public Posicao getpAtual() {
		return this.pAtual;
	}
	public void setpAtual(Posicao pAtual) {
		this.pAtual = pAtual;
	}
	public Torre(int a, int b) {
		super(a, b, 't');
		
		// TODO Auto-generated constructor stub
	}
	protected ArrayList<Posicao> opcMov;
    public ArrayList<Posicao> getOpcMov() {
		return this.opcMov;
	}
	public void setOpcMov(ArrayList<Posicao> opcMov) {
		this.opcMov = opcMov;
	}
public void atualizarOpcMov(Tabuleiro tabuleiro) {
    	this.opcMov.clear();
    	this.opcMov1(tabuleiro);
    	this.opcMov2(tabuleiro);
    	this.opcMov3(tabuleiro);
    	this.opcMov4(tabuleiro);
    }
//@SuppressWarnings("static-access")
void opcMov1(Tabuleiro tabuleiro){
	//opcao de movimento para cima 
	
	for(int i=1;i<8;i++) {
		boolean ehIgual = false;
		Posicao possibilidade = new Posicao(this.getpAtual().getLinha()+i,
				this.getpAtual().getColuna());
		if(tabuleiro.getCasa(possibilidade)!='*') {
			i=10;//nessa direcao entao eh o ultimo movimento possivel
			if(tabuleiro.getTimeBaixo().ocupaPosicao(possibilidade)) {
				if(tabuleiro.getTimeBaixo()
				.selecionarPeca(possibilidade).time == this.getTime()) {
					//se os times forem iguais
					ehIgual = true;
				}
			}
			if(tabuleiro.getTimeCima().ocupaPosicao(possibilidade)) {
				if(tabuleiro.getTimeCima()
				.selecionarPeca(possibilidade).time == this.getTime()) {
					//se os times forem iguais
					ehIgual = true;
				}
			}
			
		}
		if(possibilidade.DentroDoTabuleiro()&& !ehIgual) {
			this.getOpcMov().add(possibilidade);
		}else {
			i=10;
		}
		}
	}

	
@SuppressWarnings("static-access")
void opcMov2(Tabuleiro tabuleiro){
	//opcao de movimento para baixo
	
	for(int i=1;i<8;i++) {
		boolean ehIgual = false;
		Posicao possibilidade = new Posicao(this.getpAtual().getLinha()-i,
				this.getpAtual().getColuna());
		if(tabuleiro.getCasa(possibilidade)!='*') {
			i=10;//nessa direcao entao eh o ultimo movimento possivel
			if(tabuleiro.getTimeBaixo().ocupaPosicao(possibilidade)) {
				if(tabuleiro.getTimeBaixo()
				.selecionarPeca(possibilidade).time == this.getTime()) {
					//se os times forem iguais
					ehIgual = true;
				}
			}
			if(tabuleiro.getTimeCima().ocupaPosicao(possibilidade)) {
				if(tabuleiro.getTimeCima()
				.selecionarPeca(possibilidade).time == this.getTime()) {
					//se os times forem iguais
					ehIgual = true;
				}
			}
			
		}
		if(possibilidade.DentroDoTabuleiro()&& !ehIgual) {
			this.getOpcMov().add(possibilidade);
		}else {
			i=10;
		}
		}
	}
	
@SuppressWarnings("static-access")
void opcMov3(Tabuleiro tabuleiro){
	//opcao de movimento para direita
	
	for(int i=1;i<8;i++) {
		boolean ehIgual = false;
		Posicao possibilidade = new Posicao(this.getpAtual().getLinha(),
				this.getpAtual().getColuna()+i);
		if(tabuleiro.getCasa(possibilidade)!='*') {
			i=10;//nessa direcao entao eh o ultimo movimento possivel
			if(tabuleiro.getTimeBaixo().ocupaPosicao(possibilidade)) {
				if(tabuleiro.getTimeBaixo()
				.selecionarPeca(possibilidade).time == this.getTime()) {
					//se os times forem iguais
					ehIgual = true;
				}
			}
			if(tabuleiro.getTimeCima().ocupaPosicao(possibilidade)) {
				if(tabuleiro.getTimeCima()
				.selecionarPeca(possibilidade).time == this.getTime()) {
					//se os times forem iguais
					ehIgual = true;
				}
			}
			
		}
		if(possibilidade.DentroDoTabuleiro()&& !ehIgual) {
			this.getOpcMov().add(possibilidade);
		}else {
			i=10;
		}
		}
	}
@SuppressWarnings("static-access")
void opcMov4(Tabuleiro tabuleiro){
	//opcao de movimento para esquerda
	
	for(int i=1;i<8;i++) {
		boolean ehIgual = false;
		Posicao possibilidade = new Posicao(this.getpAtual().getLinha(),
				this.getpAtual().getColuna()-i);
		if(tabuleiro.getCasa(possibilidade)!='*') {
			i=10;//nessa direcao entao eh o ultimo movimento possivel
			if(tabuleiro.getTimeBaixo().ocupaPosicao(possibilidade)) {
				if(tabuleiro.getTimeBaixo()
				.selecionarPeca(possibilidade).time == this.getTime()) {
					//se os times forem iguais
					ehIgual = true;
				}
			}
			if(tabuleiro.getTimeCima().ocupaPosicao(possibilidade)) {
				if(tabuleiro.getTimeCima()
				.selecionarPeca(possibilidade).time == this.getTime()) {
					//se os times forem iguais
					ehIgual = true;
				}
			}
			
		}
		if(possibilidade.DentroDoTabuleiro()&& !ehIgual) {
			this.getOpcMov().add(possibilidade);
		}else {
			i=10;
		}
		}
	}
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setpAtual(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atualizarOpcMov() {
		// TODO Auto-generated method stub
		
	}
	

}
