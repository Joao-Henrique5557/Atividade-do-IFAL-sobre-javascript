package sistema.turista;

public abstract class Turistas implements Interagir{
    protected String nome;
    protected int idade;
    protected String tipo;
    protected int taxa;

    public abstract void saudacao();
    public abstract void necessidade();

    // gets e sets
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }
}