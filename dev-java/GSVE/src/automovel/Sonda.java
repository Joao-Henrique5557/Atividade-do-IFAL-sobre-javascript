package sistema.automovel;

public class Sonda extends VeiculosEspaciais {
    public Sonda() {
        this.nome = "Sonda";
        this.capacidadePassageiros = 10; // Sondas não transportam passageiros
        this.velocidadeViagem = 5000.0; // km/h
    }

}
