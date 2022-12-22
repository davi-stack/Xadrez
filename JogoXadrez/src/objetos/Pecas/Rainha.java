package objetos.Pecas;

import java.util.ArrayList;
import objetos.Posicao;

//package objetos;

public class Rainha extends PecaSimples implements Peca{
    public Rainha(int a, int b) {
		super(a, b, 'q');
		// TODO Auto-generated constructor stub
		this.opcMov = new ArrayList<Posicao>();
	}
public void atualizarOpcMov() {
	    this.getOpcMov().clear();
    	this.opcMov1();
    	this.opcMov2();
    	this.opcMov3();
    	this.opcMov4();
    	this.opcMov5();
    	this.opcMov6();
    	this.opcMov7();
    	this.opcMov8();
    }
	public Rainha(int a, int b, char c) {
		super(a, b, 'q');	
    	}
	
	public void mover(int i, int j){
        super.mover(i, j);
    }
	void opcMov1(){
		//opcao de movimento para cima e para direita
		
		for(int i=1;i<8;i++) {
			Posicao possibilidade = new Posicao(this.getpAtual().getLinha()+i,
					this.getpAtual().getColuna());
			if(possibilidade.DentroDoTabuleiro()) {
				this.getOpcMov().add(possibilidade);
			}else {
				i=10;
			}
			}
		}
	void opcMov2(){
		//opcao de movimento para cima e para direita
		
		for(int i=1;i<8;i++) {
			Posicao possibilidade = new Posicao(this.getpAtual().getLinha()-i,
					this.getpAtual().getColuna());
			if(possibilidade.DentroDoTabuleiro()) {
				this.getOpcMov().add(possibilidade);
			}else {
				i=10;
			}
			}
		}
	void opcMov3(){
		//opcao de movimento para cima e para direita
		
		for(int i=1;i<8;i++) {
			Posicao possibilidade = new Posicao(this.getpAtual().getLinha(),
					this.getpAtual().getColuna()+i);
			if(possibilidade.DentroDoTabuleiro()) {
				this.getOpcMov().add(possibilidade);
			}else {
				i=10;
			}
			}
		}
	void opcMov4(){
		//opcao de movimento para cima e para direita
		
		for(int i=1;i<8;i++) {
			Posicao possibilidade = new Posicao(this.getpAtual().getLinha(),
					this.getpAtual().getColuna()-i);
			if(possibilidade.DentroDoTabuleiro()) {
				this.getOpcMov().add(possibilidade);
			}else {
				i=10;
			}
			}
		}
	void opcMov5(){
		//opcao de movimento para cima e para direita
		
		for(int i=1;i<8;i++) {
			Posicao possibilidade = new Posicao(this.getpAtual().getLinha()+i,
					this.getpAtual().getColuna()+i);
			if(possibilidade.DentroDoTabuleiro()) {
				this.getOpcMov().add(possibilidade);
			}else {
				i=10;
			}
			}
		}
	void opcMov6(){
			//opcao de movimento para cima e para esquerda
			for(int i=1;i<8;i++) {
				Posicao possibilidade = new Posicao(this.getpAtual().getLinha()+i,
						this.getpAtual().getColuna()-i);
				if(possibilidade.DentroDoTabuleiro()) {
					this.getOpcMov().add(possibilidade);
				}
				}
			}
	void opcMov7(){
				//opcao de movimento para baixo e para esquerda
				for(int i=1;i<8;i++) {
					Posicao possibilidade = new Posicao(this.getpAtual().getLinha()-i,
							this.getpAtual().getColuna()-i);
					if(possibilidade.DentroDoTabuleiro()) {
						this.getOpcMov().add(possibilidade);
					}}
				}
    void opcMov8(){
					//opcao de movimento para baixo e para direita
					for(int i=1;i<8;i++) {
						Posicao possibilidade = new Posicao(this.getpAtual().getLinha()-i,
								this.getpAtual().getColuna()+i);
						if(possibilidade.DentroDoTabuleiro()) {
							this.getOpcMov().add(possibilidade);
						}}
					}
    public void kill(){
    
    }
   // @Override
    protected ArrayList<Posicao> opcMov;
    Posicao pAtual;
	@Override
	public void setpAtual(int i, int j) {
		this.pAtual.setPosicao(i, j);
		
	}
	@Override
	public ArrayList<Posicao> getOpcMov() {
		// TODO Auto-generated method stub
		return this.opcMov;
	}
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}
	
}
