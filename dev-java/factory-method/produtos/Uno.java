package produtos;

import produtos.exemplo_de_carro.Carro;

public class Uno extends Carro {
    // Construtor chama o construtor de Carro para inicializar as propriedades herdadas
    public Uno() {
        super(4, "Vermelho", "Uno");
    }
    // Você pode remover todas as declarações de campo duplicadas
}