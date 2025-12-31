package concessionaria.fabricas.fabrica_de_exemplo;

import produtos.exemplo_de_carro.Carro;

public abstract class CarroFactore {
    int quant_portas;
    String cor;
    String modelo;

    public abstract Carro criarCarro();
}
