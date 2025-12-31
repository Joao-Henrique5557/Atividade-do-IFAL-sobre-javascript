package sistema.turista;

public class Humano extends Turistas{
    @Override
    public void saudacao() {
        System.out.println("Olá, eu sou uma pessoa!");
        System.out.println("Meu nome é " + getNome() + " e tenho " + getIdade() + " anos.");
        System.out.println("Confimando usúario...");
        System.out.println("A taxa de entrada de um Humano é de R$500.");
    }

    @Override
    public void necessidade() {
        System.out.println("Eu preciso de Alimentação!");
    }

    public Humano(){
        tipo = "Humano";
        taxa = 500;
    }
}