package sistema.Principal;
import java.util.Scanner;

import sistema.automovel.Foguete; import sistema.automovel.Nave; import sistema.automovel.Sonda;
import sistema.banco.Nubank; import sistema.banco.Picpay;
import sistema.equipamento.Capacete;
import sistema.equipamento.EquipamentosEspeciais;
import sistema.equipamento.Traje;
import sistema.turista.Turistas; import sistema.turista.Humano; import sistema.turista.Robo;
import sistema.viagem.ViagensEspaciais; import sistema.viagem.ViagemExploracao; import sistema.viagem.ViagemLuxo;

public class SaidaCLI implements Exibivel{
    protected int taxa = 0;
    @Override
    public void linha() {
        System.out.println("**********************************************************");
    }

    @Override
    public void meioLinha() {
        System.out.println("*    Gerenciamento de um sistema de viagens espaciais    *");
    }

    public void cabecalho() {
        linha();
        meioLinha();
        linha();
    }

    public void processarPagamento(Scanner tc, double valor, ViagensEspaciais viagem) {
        System.out.print("Qual banco você pretende usar? PicPay (1) ou Nubank (2): ");
        int bancoEscolhido = tc.nextInt(); tc.nextLine();

        if (bancoEscolhido == 1) {
            System.out.println("Você escolheu o PicPay.");
            Picpay picpay = new Picpay();
            System.out.print("Digite a senha para realizar o pagamento: ");
            String senha = tc.nextLine();
            picpay.realizarPagamento(valor, viagem, senha);
        } else if (bancoEscolhido == 2) {
            System.out.println("Você escolheu o Nubank.");
            Nubank nubank = new Nubank();
            System.out.print("Digite a senha para realizar o pagamento: ");
            String senha = tc.nextLine();
            nubank.realizarPagamento(valor, viagem, senha);
        } else {
         System.out.println("Opção de banco inválida.");
        }
    }

    public void menuVeiculo(Scanner tc, ViagensEspaciais viagem) {
        System.out.print("Qual tipo de veículo você deseja? Nave(1) foguete(2) ou sonda(3): ");
        int tipoVeiculo = tc.nextInt(); tc.nextLine();


        switch (tipoVeiculo) {
            case 1:
                System.out.println("Você escolheu viajar em uma nave.");
                viagem.setVeiculo("Nave");
                Nave nave = new Nave();
                nave.mostrarInformacao();
                break;
            case 2:
                System.out.println("Você escolheu viajar em um foguete.");
                viagem.setVeiculo("Foguete");
                Foguete foguete = new Foguete();
                foguete.mostrarInformacao();
                break;
            case 3:
                System.out.println("Você escolheu viajar em uma sonda.");
                viagem.setVeiculo("Sonda");
                Sonda sonda = new Sonda();
                sonda.mostrarInformacao();
                break;
            default:
                System.out.println("Opção de veículo inválida.");
                return;
        }
    }

    public void perguntarDestino(Scanner tc, ViagensEspaciais viagem){
        System.out.print("Escolha o destino da viagem: Marte(1), Lua(2) ou Jupiter(3): ");
        int destino = tc.nextInt(); tc.nextLine();
        
        switch (destino) {
            case 1:
                viagem.setDestino("Marte");
                break;
            case 2:
                viagem.setDestino("Lua");
                break;
            case 3: 
                viagem.setDestino("Jupiter");
                break;
            default:
                System.out.println("Resposta incorreta!");
                break;
        }
    }

    public Turistas perguntarTipoTurista(Scanner tc){
        System.out.print("Qual tipo de turista você é? humano(1) ou Robo(2): ");
        int resposta = tc.nextInt(); tc.nextLine();

        switch (resposta) {
            case 1:
                // Cria um objeto humano e chama os métodos de saudação e necessidade
                Humano humano = new Humano();

                perguntarNome(tc, humano);
                perguntarIdade(tc, humano);
                linha();
                humano.saudacao(); humano.necessidade();
                this.taxa = humano.getTaxa();
                
                return humano;
        
            case 2:
                // Cria um objeto robo e chama os métodos de saudação e necessidade
                Robo robo = new Robo();

                perguntarNome(tc, robo);
                perguntarIdade(tc, robo);
                linha();
                robo.saudacao(); robo.necessidade();
                this.taxa = robo.getTaxa();
                
                return robo;
            default:
                System.out.println("Opção invalida!");
                return null;
        }
    }

    @Override
    public ViagensEspaciais perguntarPacote(Scanner tc){
        System.out.print("Qual tipo de pacote você prefere? Viagem de Exploração(1) ou Viagem de Luxo(2): ");
        int resposta = tc.nextInt(); tc.nextLine();

        switch (resposta) {
            case 1:
                System.out.println("Você escolheu a Viagem de Exploração.");
                return new ViagemExploracao();
            case 2:
                System.out.println("Você escolheu a Viagem de Luxo.");
                return new ViagemLuxo();
            default:
                System.out.println("Opção inválida.");
                return null;
        }
    }

    @Override
    public void perguntarNumDias(Scanner tc, ViagensEspaciais viagem) {
        System.out.print("Quantos dias você pretende ficar na viagem? 1 dia = R$200: ");
        int numDias = tc.nextInt(); tc.nextLine();
        System.out.println("Você escolheu ficar por " + numDias + " dias. Dar um total de R$" + numDias * 200);
        viagem.setNumeroDias(numDias);
        linha();
    }

    @Override
    public void perguntarNumServicos(Scanner tc, ViagensEspaciais viagem) {
        System.out.print("Quantos serviços você deseja contratar? 1 Serviço = R$500: ");
        int numServicos = tc.nextInt(); tc.nextLine();
        System.out.println("Você escolheu contratar " + numServicos + " serviços. Dar um total de R$" + numServicos * 500);
        viagem.setNumeroServicos(numServicos);
        linha();
    }

    @Override
    public void perguntarNome(Scanner tc, Turistas turista) {
        System.out.print("Qual é seu nome?: ");
        String nome = tc.nextLine();
        turista.setNome(nome);
    }

    @Override
    public void perguntarIdade(Scanner tc, Turistas turista) {
        System.out.print("Qual é a sua idade?: ");
        int idade = tc.nextInt(); tc.nextLine();
        turista.setIdade(idade);
    }

    @Override
    public void adicionarTaxaTurista(ViagensEspaciais viagem, Turistas turista) {
        viagem.preco += this.taxa;
        System.out.println("A taxa de R$" + this.taxa + " foi adicionada para o tipo de cliente escolhido: " + turista.getTipo());
    }

    public void precoAtualPacote(ViagensEspaciais viagem){
        System.out.println("Preço atual do pacote: " + viagem.preco);
        linha();
    }

    public void setEquipamento(ViagensEspaciais viagem){
        if (viagem.getNivelUtilidadeEquipamento() <= 5) {
            viagem.setEquipamento(new Capacete());
            System.out.println("Equipamento obrigatorio adicionado: " + viagem.getEquipamento().getNome());
            System.out.println("Preço do equipamento: R$" + viagem.getEquipamento().getPreco());
        } else if (viagem.getNivelUtilidadeEquipamento() > 5) {
            viagem.setEquipamento(new Traje());
            System.out.println("Equipamento obrigatorio adicionado: " + viagem.getEquipamento().getNome());
            System.out.println("Preço do equipamento: R$" + viagem.getEquipamento().getPreco());
        }
        linha();
        EquipamentosEspeciais equipamento = viagem.getEquipamento();
        equipamento.mostrarInformacao();;
        linha();
    }
}