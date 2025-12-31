package concessionaria.fabricas;

import concessionaria.fabricas.fabrica_de_exemplo.CarroFactore;
import produtos.Uno;
import produtos.exemplo_de_carro.Carro;

public class UnoFactore extends CarroFactore {
    @Override
    public Carro criarCarro() {
        return new Uno();
    }
}