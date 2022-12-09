package game;


	public class Main
	{
		public static void main(String[] args) {
			char tabuleiro[][] = new char[8][8];
	    
	    for(int l=0;l<8;l++){
	        for(int c=0;c<8;c++){
	        tabuleiro[l][c] = '*';
	        }
	        
	    }
	    for(int c=0;c<8;c++){
	        tabuleiro[6][c] = 'p';
	        }//segunda linha é a linha que tem apenas peoes
	        
	    tabuleiro[7][7]='t';//essa posicao tem uma torre, t==torre
	    tabuleiro[7][0]='t';//essa posicao tem uma torre, t==torre
	    tabuleiro[7][6]='c';//essa posicao tem uma cavalo, c==cavalo
	    tabuleiro[7][1]='c';//essa posicao tem uma cavalo, c==cavalo
	    //Cavalo cavalo1 = new cavalo(Posicao p(7,1));
	    tabuleiro[7][5]='b';//essa posicao tem uma bispo, b=bispo
	    tabuleiro[7][2]='b';//essa posicao tem uma bispo, b=bispo
	    tabuleiro[7][3]='r';//essa posicao é a do rei, r = rei
	    tabuleiro[7][4]='q';//essa posicao é a do rainha, q ==rainha


	    for(int l=0;l<8;l++){
	        for(int c=0;c<8;c++){
	        System.out.print(tabuleiro[l][c] +" ");
	        
	    }
	    System.out.println();
	    }
		}
		//System.out.println("escolha um cavalor para mover, cavalo 1 ou 2");
		
	}

