package sistema.banco;

import sistema.viagem.ViagensEspaciais;

public interface Pagamento {
    public void realizarPagamento(double preco, ViagensEspaciais viagem, String senhaDigitada);
    public double getSaldo();
    public void setSaldo(double saldo);
}