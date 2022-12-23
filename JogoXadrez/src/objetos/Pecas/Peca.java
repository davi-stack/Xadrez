package objetos.Pecas;

import java.util.ArrayList;
import java.util.List;

import objetos.Posicao;

public interface Peca {

void kill();
char time = 'm';
public Posicao pAtual = new Posicao();
public List<Posicao> opcMov = new ArrayList<Posicao>();
char simbolo = 'p';
@SuppressWarnings("unused")
private void atualizarOpc() {
}
void atualizarOpcMov();
Posicao getpAtual();

}
