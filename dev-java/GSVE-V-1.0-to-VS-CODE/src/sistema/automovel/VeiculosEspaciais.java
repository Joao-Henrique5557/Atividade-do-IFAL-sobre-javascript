package sistema.automovel;

public abstract class VeiculosEspaciais implements InfoAutomovel {
    protected String nome;
    protected int capacidadePassageiros;
    protected double velocidadeViagem;

    @Override
    public void mostrarInformacao() {
        System.out.println("**********************************************************");
        System.out.println("Veículo Espacial: " + nome);
        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
        System.out.println("Velocidade de Viagem: " + velocidadeViagem + " km/h");
        System.out.println("**********************************************************");
    }

    // gets e sets

    public String getNome() {
        return nome;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public double getVelocidadeViagem() {
        return velocidadeViagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public void setVelocidadeViagem(double velocidadeViagem) {
        this.velocidadeViagem = velocidadeViagem;
    }
}
