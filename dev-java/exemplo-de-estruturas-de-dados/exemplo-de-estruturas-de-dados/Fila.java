public class Fila {
    private Nodo primeiro;

    
    public Fila() {
        this.primeiro = null;
    }

    public void enqueue(int item) {
        Nodo novoNodo = new Nodo(item);

        if (this.primeiro == null) {
            // Fila vazia
            this.primeiro = novoNodo;
        } else {
            // fila não vazia
            Nodo atual = this.primeiro; // começa do primeiro
            while(atual.proximo != null){
                atual = atual.proximo; // anda na fila
            }
            atual.proximo = novoNodo; // adiciona o novo nodo ao final
        }
    }

    public int dequeue(){
        if (this.primeiro == null) {
            System.out.println("Fila vazia");
            return -1; // valor inválido
        } else{
            int valorRemovido = this.primeiro.valor;
            this.primeiro = this.primeiro.proximo; // avança o primeiro
            return valorRemovido;
        }
    }

    public int front(){
        if (this.primeiro == null) {
            System.out.println("Fila vazia");
            return -1; // valor inválido
        } else{
            return this.primeiro.valor;
        }
    }

    public boolean isEmpty(){
        return this.primeiro == null;
    }

    public int size(){
        int tamanho = 0;
        Nodo atual = this.primeiro;
        while(atual != null){
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }
}
