public class ArvoreBinariaGenerica {
    String valor;        // dado guardado no nó
    ArvoreBinariaGenerica esquerda;     // filho da esquerda
    ArvoreBinariaGenerica direita;      // filho da direita

    // construtor
    public ArvoreBinariaGenerica(String valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    // mostra os valores (pré-ordem)
    public void mostrar() {
        System.out.print(valor + " ");
        if (esquerda != null) esquerda.mostrar();
        if (direita != null) direita.mostrar();
    }
}

