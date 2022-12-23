package objetos.Pecas;

import java.util.ArrayList;
import java.util.List;

import objetos.Posicao;

public class Rei extends PecaSimples implements Peca{
    
	public Rei(int a, int b) {
		
		super(a, b, 'r');
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
    
    void opcMov1(){
		//opcao de movimento para cima
		
		int i=1;
			Posicao possibilidade = new Posicao(this.getpAtual().getLinha()+i,
					this.getpAtual().getColuna());
			if(possibilidade.DentroDoTabuleiro()) {
				this.getOpcMov().add(possibilidade);
			}else {
				i=10;
			}
			
		}
	void opcMov2(){
		//opcao de movimento para baixo
		int i=1;
			Posicao possibilidade = new Posicao(this.getpAtual().getLinha()-i,
					this.getpAtual().getColuna());
			if(possibilidade.DentroDoTabuleiro()) {
				this.getOpcMov().add(possibilidade);
			}else {
				i=10;
			
			}
		}
	void opcMov3(){
		//opcao de movimento para direita
		int i=1;
		
			Posicao possibilidade = new Posicao(this.getpAtual().getLinha(),
					this.getpAtual().getColuna()+i);
			if(possibilidade.DentroDoTabuleiro()) {
				this.getOpcMov().add(possibilidade);
			}else {
				i=10;
			
			}
		}
	void opcMov4(){
		//opcao de movimento para esquerda
		int i=1;
			Posicao possibilidade = new Posicao(this.getpAtual().getLinha(),
					this.getpAtual().getColuna()-i);
			if(possibilidade.DentroDoTabuleiro()) {
				this.getOpcMov().add(possibilidade);
			}else {
				i=10;
			
			}
		}
	void opcMov5(){
		//opcao de movimento para cima e para direita
		int i=1;
			Posicao possibilidade = new Posicao(this.getpAtual().getLinha()+i,
					this.getpAtual().getColuna()+i);
			if(possibilidade.DentroDoTabuleiro()) {
				this.getOpcMov().add(possibilidade);
			}else {
				i=10;
			}
			
		}
	void opcMov6(){
		int i=1;
			//opcao de movimento para cima e para esquerda
			
				Posicao possibilidade = new Posicao(this.getpAtual().getLinha()+i,
						this.getpAtual().getColuna()-i);
				if(possibilidade.DentroDoTabuleiro()) {
					this.getOpcMov().add(possibilidade);
				
				}
			}
	void opcMov7(){
		int i=1;
				//opcao de movimento para baixo e para esquerda
				
					Posicao possibilidade = new Posicao(this.getpAtual().getLinha()-i,
							this.getpAtual().getColuna()-i);
					if(possibilidade.DentroDoTabuleiro()) {
						this.getOpcMov().add(possibilidade);
					}
				}
    void opcMov8(){
    	int i=1;
					//opcao de movimento para baixo e para direita
					
						Posicao possibilidade = new Posicao(this.getpAtual().getLinha()-i,
								this.getpAtual().getColuna()+i);
						if(possibilidade.DentroDoTabuleiro()) {
							this.getOpcMov().add(possibilidade);
						}
					}
    

	@Override
	public void mover(int i, int j) {
	super.mover(i, j);
		
	}
	@Override
	public void setpAtual(int i, int j) {
		super.setpAtual(i, j);
		
	}
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}
	public ArrayList<Posicao> opcMov;
	@Override
	public List<Posicao> getOpcMov() {
		// TODO Auto-generated method stub
		return this.opcMov;
	}

}
