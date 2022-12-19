package objetos.Pecas;

import java.util.ArrayList;
import java.util.List;

import objetos.Posicao;

public interface Peca {
void mover();
void kill();

public Posicao pAtual = new Posicao();
public List<Posicao> opcMov = new ArrayList<Posicao>();

@SuppressWarnings("unused")
private void atualizarOpc() {
}




}
