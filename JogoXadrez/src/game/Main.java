package game;

import objetos.Tabuleiro;
import objetos.Pecas.Bispo;
import objetos.Pecas.Cavalo;
import objetos.Pecas.Peao;
import objetos.Pecas.Rainha;
import objetos.Pecas.Rei;

public class Main{
		public static void main(String[] args) {
			
			//teste com cavalo
		/*Cavalo cavaloTeste = new Cavalo(5, 6);
	    System.out.print(cavaloTeste.getpAtual());
	    
	    cavaloTeste.atualizarOpcMov();
	    System.out.print(cavaloTeste.getOpcMov());
	    System.out.println();*/
	
	    //teste bispo
	    /*Bispo bispo = new Bispo(2, 3);
	    System.out.println();
	    
	    bispo.atualizarOpcMov();
        System.out.print(bispo.getOpcMov());
	    
	    //teste peao
	    /*Peao peao = new Peao(1, 2);
	    peao.atualizarOpcMov();
	    System.out.print(peao.getOpcMov());
	    peao.mover(2, 6);
	    System.out.println();
	    System.out.print(peao.getpAtual());
	    System.out.println();
	    peao.atualizarOpcMov();
	    System.out.print(peao.getOpcMov());*/
	    //teste rainha
	    /*
	    Rainha rainha = new Rainha(0, 4);
	    rainha.atualizarOpcMov();
	    System.out.println();
	    System.out.print(rainha.getOpcMov());
	    rainha.mover();
	    Rei rei = new Rei(0, 4);
	    rei.atualizarOpcMov();
	    System.out.println();
	    System.out.print(rei.getOpcMov());
	    rei.mover();*/
	    
	    Tabuleiro tabuleiro = new Tabuleiro();
	    System.out.println(tabuleiro.getTimeBaixo()
	    		.getTorre1().pAtual);
	    System.out.println(tabuleiro.getTimeBaixo()
	    		.getTorre1().opcMov);
	    tabuleiro.getTimeBaixo()
	    		.getTorre1().atualizarOpcMov();
	    System.out.println(tabuleiro.getTimeBaixo()
	    		.getTorre1().opcMov);
	    
	    System.out.println(tabuleiro.getTimeBaixo()
	    		.getPeoes().get(1).getpAtual());
	    Peao peao = new Peao(3, 4);
	    System.out.println(peao.pAtual);
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
		}
		//System.out.println("escolha um cavalor para mover, cavalo 1 ou 2");
		
	}

