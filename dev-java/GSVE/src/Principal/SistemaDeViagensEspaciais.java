package sistema.Principal;
import java.util.Scanner;

import sistema.viagem.ViagensEspaciais;

public class SistemaDeViagensEspaciais {
    

    public static void main(String[] args) {
        // Objetos de entrada e saida
        Scanner tc = new Scanner(System.in); 
        SaidaCLI ui = new SaidaCLI();
        // cabeçalHho do programa
        ui.cabecalho();


        ViagensEspaciais pacote = ui.perguntarPacote(tc); 
        ui.setEquipamento(pacote);
        // cria a ferramenta. seu preco só vai no calcular preço se for chamado o metodo
        // pacote não tem preço padrao
        
        ui.adicionarTaxaTurista(pacote, ui.perguntarTipoTurista(tc)); //adiciona o obejeto turista, e envia sua taxa para o preço

        ui.perguntarNumDias(tc, pacote);
        ui.perguntarNumServicos(tc, pacote);

        ui.perguntarDestino(tc, pacote);
        ui.menuVeiculo(tc, pacote);

        // algumas variaveis precisam ser preenchidas antes de chamar o metodo precoAtualDoPacote, pois fazem parte do metodo
        // da classe viagem, e portanto, nâo fará diferença no preco até o metodo calcularPreco ser chamado
        // como numDias, numServiços, destino e veiculo
        ui.processarPagamento(tc, pacote.calcularPreco(), pacote);
        tc.close();
    }
}