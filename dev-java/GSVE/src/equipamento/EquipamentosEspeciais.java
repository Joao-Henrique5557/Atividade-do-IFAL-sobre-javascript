package sistema.equipamento;

public abstract class EquipamentosEspeciais implements InfoEquipamento{
    protected double preco;
    protected double nivelUtilidade;
    protected String nome;

    @Override
    public void mostrarInformacao() {
        System.out.println("Equipamento: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Nível de Utilidade: " + nivelUtilidade);
    }
    
    // sets e gets
    public double getPreco() {
        return preco;
    }

    public double getNivelUtilidade() {
        return nivelUtilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNivelUtilidade(double nivelUtilidade) {
        this.nivelUtilidade = nivelUtilidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
