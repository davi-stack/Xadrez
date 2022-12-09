package pecas;

public class Tabuleiro {
	char casa[][];
    int jogadas;
    void mover(Tabuleiro tabu, Posicao init, Posicao end){
    tabu.casa[end.linha][end.coluna] = tabu.casa[init.linha][init.coluna];
    tabu.casa[init.linha][init.coluna] = '*';
    }
}
