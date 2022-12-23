package objetos.Pecas;

import java.util.ArrayList;
import java.util.List;

import objetos.Posicao;

public class Bispo extends PecaSimples implements Peca{

	
	public Bispo(int a, int b) {
		super(a, b, 'b');
		// TODO Auto-generated constructor stub
		this.opcMov = new ArrayList<>();
	}
	 
	public ArrayList<Posicao> opcMov;
 	void opcMov1(){
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
	void opcMov2(){
			//opcao de movimento para cima e para esquerda
			for(int i=1;i<8;i++) {
				Posicao possibilidade = new Posicao(this.getpAtual().getLinha()+i,
						this.getpAtual().getColuna()-i);
				if(possibilidade.DentroDoTabuleiro()) {
					this.getOpcMov().add(possibilidade);
				}
				}
			}
			void opcMov3(){
				//opcao de movimento para baixo e para esquerda
				for(int i=1;i<8;i++) {
					Posicao possibilidade = new Posicao(this.getpAtual().getLinha()-i,
							this.getpAtual().getColuna()-i);
					if(possibilidade.DentroDoTabuleiro()) {
						this.getOpcMov().add(possibilidade);
					}}
				}
				void opcMov4(){
					//opcao de movimento para baixo e para direita
					for(int i=1;i<8;i++) {
						Posicao possibilidade = new Posicao(this.getpAtual().getLinha()-i,
								this.getpAtual().getColuna()+i);
						if(possibilidade.DentroDoTabuleiro()) {
							this.getOpcMov().add(possibilidade);
						}}
					}
				

public void atualizarOpcMov() {
	
	    this.getOpcMov()
	    .clear();
    	this.opcMov1();
    	this.opcMov2();
    	this.opcMov3();
    	this.opcMov4();
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
	public List<Posicao> getOpcMov() {
		// TODO Auto-generated method stub
		return this.opcMov;
	}

}
