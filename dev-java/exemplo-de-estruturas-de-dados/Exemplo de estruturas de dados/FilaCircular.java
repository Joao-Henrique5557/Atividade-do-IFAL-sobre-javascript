public class FilaCircular {
    private int[] elementos;  // array que guarda os itens
    private int tamanho;      // capacidade máxima
    private int inicio;       // índice do primeiro elemento
    private int fim;          // índice da próxima posição livre
    private int qtdElementos; // quantidade atual de elementos

    // Construtor
    public FilaCircular(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new int[tamanho];
        this.inicio = 0;
        this.fim = 0;
        this.qtdElementos = 0;
    }

    // Verifica se a fila está cheia
    public boolean estaCheia() {
        return qtdElementos == tamanho;
    }

    // Verifica se a fila está vazia
    public boolean estaVazia() {
        return qtdElementos == 0;
    }

    // Adiciona um elemento na fila
    public void enfileirar(int valor) {
        if (estaCheia()) {
            System.out.println("Fila cheia! Não é possível adicionar " + valor);
            return;
        }

        elementos[fim] = valor;
        fim = (fim + 1) % tamanho; // volta ao início se chegar ao final
        qtdElementos++;
    }

    // Remove o elemento do início da fila
    public int desenfileirar() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
            return -1; // valor padrão para indicar erro
        }

        int removido = elementos[inicio];
        inicio = (inicio + 1) % tamanho; // move o início circularmente
        qtdElementos--;
        return removido;
    }

    // Mostra os elementos da fila
    public void mostrarFila() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
            return;
        }

        System.out.print("Fila: ");
        for (int i = 0; i < qtdElementos; i++) {
            int index = (inicio + i) % tamanho;
            System.out.print(elementos[index] + " ");
        }
        System.out.println();
    }
}