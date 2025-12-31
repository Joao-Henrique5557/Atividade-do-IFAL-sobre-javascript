package sistema.banco;

import sistema.viagem.ViagensEspaciais;
import java.util.Date;

public abstract class Bancos implements Pagamento{
    private double saldo = 20000;
    private String senha = "1234";

    
    @Override
    public void realizarPagamento(double preco, ViagensEspaciais viagem, String senhaDigitada) {
        System.out.println("Iniciando o processo de pagamento...");
        Date data = new Date();
        
        if (senhaDigitada.equals(this.senha)) {
            if (this.saldo >= preco) {
                System.out.println("Pagamento realizado com sucesso!");
                System.out.println("Data do pagamento: " + data.toString());
                this.saldo -= preco;
                System.out.println("Saldo atual: R$" + this.saldo);
            } else{
                System.out.println("Saldo insuficiente.");
            }
        } else {
                System.out.println("Senha incorreta. Pagamento não realizado.");
        }
    }
    

    // gets e sets

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}