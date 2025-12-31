package concessionaria.fabricas;

import concessionaria.fabricas.fabrica_de_exemplo.CarroFactore;
import produtos.Fiat;
import produtos.exemplo_de_carro.Carro;

public class FiatFactore extends CarroFactore {
    @Override
    public Carro criarCarro() {
        return new Fiat();
    }
}