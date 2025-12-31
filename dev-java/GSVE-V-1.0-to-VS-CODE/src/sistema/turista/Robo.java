package sistema.turista;

public class Robo extends Turistas{
    @Override
    public void saudacao() {
        System.out.println("Eu sou um robo!, bipi bipi!!!");
        System.out.println("Meu nome é " + getNome() + " e tenho " + getIdade() + " anos.");
        System.out.println("Confimando usúario...");
        System.out.println("A taxa de entrada de um Robo é de R$800.");
    }

    @Override
    public void necessidade() {
        System.out.println("Eu preciso de Manutenção!");
    }

    public Robo(){
        tipo = "Robo";
        taxa = 800;
    }
}