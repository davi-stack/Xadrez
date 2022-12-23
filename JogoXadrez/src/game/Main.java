package game;

import objetos.Tabuleiro;
import objetos.Pecas.Bispo;
import objetos.Pecas.Cavalo;
import objetos.Pecas.Peao;
import objetos.Pecas.Rainha;
import objetos.Pecas.Rei;

public class Main{
		public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		System.out.print(tabuleiro.getTimeBaixo()
				.getPeoes().get(1).getOpcMov());
		tabuleiro.getTimeBaixo().atualizar();
		System.out.print(tabuleiro.getTimeBaixo()
				.getPeoes().get(1).getOpcMov());
		

        
        


	    

	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
		}
		//System.out.println("escolha um cavalor para mover, cavalo 1 ou 2");
		
	}

