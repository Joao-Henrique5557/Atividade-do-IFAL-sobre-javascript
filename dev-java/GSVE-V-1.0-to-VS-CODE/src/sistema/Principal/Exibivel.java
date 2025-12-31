package sistema.Principal;
import java.util.Scanner;

import sistema.turista.Turistas;
import sistema.viagem.ViagensEspaciais;

public interface Exibivel {
    public void linha();
    public void meioLinha();
    public Turistas perguntarTipoTurista(Scanner tc);
    public ViagensEspaciais perguntarPacote(Scanner tc);
    public void perguntarNumDias(Scanner tc, ViagensEspaciais viagem);
    public void perguntarNumServicos(Scanner tc, ViagensEspaciais viagem);
    public void perguntarNome(Scanner tc, Turistas turista);
    public void perguntarIdade(Scanner tc, Turistas turista);
    public void adicionarTaxaTurista(ViagensEspaciais viagem, Turistas turista);
}
