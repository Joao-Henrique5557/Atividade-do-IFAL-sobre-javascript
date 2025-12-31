public class Main {
    public static void main(String[] args) {
        /* 
        // Testando a lista encadeada
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        System.out.println("Lista encadeada após adicionar elementos:");
        lista.imprimir(); // Deve imprimir: 10 20 30

        lista.remover();
        System.out.println("Lista encadeada após remover o primeiro elemento:");
        lista.imprimir(); // Deve imprimir: 20 30

        // Testando a pilha com array
        PilhaComArray pilha = new PilhaComArray(3);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4); // Deve indicar que a pilha está cheia

        // Testando a incrementação
        D_icrementacao incremento = new D_icrementacao();
        incremento.pre_incrementacao();
        incremento.pos_incrementacao();

        // testando a fila
        Fila fila = new Fila();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4); // Deve indicar que a fila está cheia
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue(); // Deve indicar que a fila está vazia

        // Testando a pilha com lista encadeada
        PilhaComListaEncadeada pilhaLista = new PilhaComListaEncadeada();
        pilhaLista.push(5);
        pilhaLista.push(10);
        pilhaLista.pop();
        pilhaLista.pop();
        pilhaLista.pop(); // Deve indicar que a pilha está vazia
        */
        
        /*
        ArvoreBinariaGenerica raiz = new ArvoreBinariaGenerica("A"); // Arvore binaria generica
        raiz.esquerda = new ArvoreBinariaGenerica("B");
        raiz.direita = new ArvoreBinariaGenerica("C");
        raiz.esquerda.esquerda = new ArvoreBinariaGenerica("D");
        raiz.esquerda.direita = new ArvoreBinariaGenerica("E");


        //       A
        //      / \
        //    B   C
        //    / \
        //   D   E


        //mostra os valores da árvore
        raiz.mostrar();

         */

        ArvoreBinariaDeBusca arvoredebusca = new ArvoreBinariaDeBusca();

        arvoredebusca.inserir(new Folha(10));
        arvoredebusca.inserir(new Folha(20));
        arvoredebusca.inserir(new Folha(5));
        arvoredebusca.inserir(new Folha(50));
        arvoredebusca.inserir(new Folha(100));
        arvoredebusca.inserir(new Folha(150));

        }
}
