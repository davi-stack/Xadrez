package game;

import objetos.Tabuleiro;

public class Main{
		public static void main(String[] args) {
			Tabuleiro tabuleiro = new Tabuleiro();
			
			tabuleiro.imprimir();
			System.out.println(tabuleiro.getCavalo1()
					.imprimirOpcMov());
			tabuleiro.getCavalo1().atualizarOpc();
			System.out.println(tabuleiro.getCavalo1()
					.imprimirOpcMov());
			System.out.println();
			System.out.println(tabuleiro.getPeoes().get(0).imprimirOpcMov());
			//tabuleiro.getPeoes().
			
			
	        
	    
	    


	    
		}
		//System.out.println("escolha um cavalor para mover, cavalo 1 ou 2");
		
	}

