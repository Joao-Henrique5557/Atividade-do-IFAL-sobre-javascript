public class ListaEncadeada {
    private Nodo cabeca; // referencia para o primeiro nó na memoria

    public ListaEncadeada(){
        cabeca = null; // esvazia a lista
    }

    // inserir no final

    public void adicionar(int valor){
        Nodo novoNodo = new Nodo(valor); // cria um novo nó, seja o primeiro(cabeça) ou o ultimo
        
        if (cabeca == null){ // se a lista estiver vazia
            cabeca = novoNodo; // o novo nó (com um valor e sem proximo(null)) é a cabeça
        } else { // se a lista não estiver vazia (considere que tem mais de um elemento)
            Nodo temp = cabeca; // pegar o endereço da cabeça (primeiro elemento) sem perder a referência a ela
            while (temp.proximo != null) {// seja qual for o elemento, enquanto o próximo não for null (ou seja, enquanto não for o último)
            // avançar para o próximo
                temp = temp.proximo; 
            }
            temp.proximo = novoNodo;// quando chegar no último, o próximo dele (que é null) passa a ser o novo nó
        }
        // ou seja, cabeça nula -> novo nó é a cabeça e sem referência para próximo (null)
        // senão -> criar uma referencia temporária para a cabeça
        // enquanto a referencia que começa na cabeça tiver uma referencia para outro nó
        // será pego a referencia do próximo nó e atribuído a referencia temporária até que o próximo seja null
        // quando chegar no último, o próximo dele (que é null) passa a ser o novo nó
    }

    // imprimir lista

    public void imprimir(){
        Nodo temp = cabeca;
        while (temp != null){
            System.out.println(temp.valor + " ");
            temp = temp.proximo;
        }
        System.out.println();
    }

    // remover o primeiro elemento
    public void remover(){
        if (cabeca!=null){
            cabeca = cabeca.proximo;
        }
    }
}
