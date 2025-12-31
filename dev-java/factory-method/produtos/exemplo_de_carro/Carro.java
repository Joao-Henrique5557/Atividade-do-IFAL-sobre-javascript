package produtos.exemplo_de_carro;

public abstract class Carro {
    public int quant_portas;
    public String cor;
    public String modelo;

    // Construtor para inicializar as propriedades
    public Carro(int quant_portas, String cor, String modelo) {
        this.quant_portas = quant_portas;
        this.cor = cor;
        this.modelo = modelo;
    }
}