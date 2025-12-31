package sistema.viagem;

import sistema.equipamento.EquipamentosEspeciais;

public abstract class ViagensEspaciais implements Processamento{


    // Atributos
    protected String destino; protected int duracao; public int preco; protected int numeroDias;
    protected int numeroServicos; protected String veiculo; protected int nivelUtilidadeEquipamento;
    protected EquipamentosEspeciais equipamento; protected int taxaTurista;

    @Override
    public int calcularPreco() {
        this.preco += (numeroDias * 200) + (numeroServicos * 500);

        if (destino != null) {
            if (destino.equals("Marte")) {
                this.preco += 1000;
            } else if (destino.equals("Lua")) {
                this.preco += 500;
            } else if (destino.equals("Jupiter")) {
                this.preco += 1500;
            }
        }   

        if (veiculo != null) {
            if (veiculo.equals("Foguete")) {
                this.preco += 150;
            } else if (veiculo.equals("Nave")) {
                this.preco += 200;
            } else if (veiculo.equals("Sonda")) {
                this.preco += 100;
            }
        }

        if (equipamento != null) {
            this.preco += equipamento.getPreco();
        }

        this.preco += taxaTurista;
        System.out.println("O preço do pacote ficou: " + this.preco);
        return this.preco;
    }

    // Gets e Sets

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public int getNumeroServicos() {
        return numeroServicos;
    }

    public void setNumeroServicos(int numeroServicos) {
        this.numeroServicos = numeroServicos;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public int getNivelUtilidadeEquipamento() {
        return nivelUtilidadeEquipamento;
    }

    public void setNivelUtilidadeEquipamento(int nivelUtilidadeEquipamento) {
        this.nivelUtilidadeEquipamento = nivelUtilidadeEquipamento;
    }

    public EquipamentosEspeciais getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(EquipamentosEspeciais equipamento) {
        this.equipamento = equipamento;
    }

    public int getTaxaTurista() {
        return taxaTurista;
    }
    
    public void setTaxaTurista(int taxaTurista) {
        this.taxaTurista = taxaTurista;
    }
}