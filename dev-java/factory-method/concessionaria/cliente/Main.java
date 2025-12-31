package concessionaria.cliente;

import concessionaria.fabricas.FiatFactore;
import concessionaria.fabricas.UnoFactore;
import concessionaria.fabricas.fabrica_de_exemplo.CarroFactore;
import produtos.exemplo_de_carro.Carro;

public class Main {
    public static void main(String[] args) {
        CarroFactore UnoFactore = new UnoFactore();
        CarroFactore FiatFactore = new FiatFactore();

        // Criando carros usando as fábricas (aqui não se sabe qual classe concreta está sendo instanciada)

        Carro uno = UnoFactore.criarCarro();
        Carro fiat = FiatFactore.criarCarro();  

        // interface grafica simples para mostrar os detalhes dos carros criados
        
        System.out.println("Detalhes do Carro Uno:");
        System.out.println("Modelo: " + uno.modelo);
        System.out.println("Quantidade de Portas: " + uno.quant_portas);
        System.out.println("Cor: " + uno.cor);
        
        System.out.println("Detalhes do Carro Fiat:");
        System.out.println("Modelo: " + fiat.modelo);
        System.out.println("Quantidade de Portas: " + fiat.quant_portas);
        System.out.println("Cor: " + fiat.cor);
    }
}
