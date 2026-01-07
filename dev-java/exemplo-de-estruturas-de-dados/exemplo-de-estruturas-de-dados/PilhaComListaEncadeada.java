public class PilhaComListaEncadeada {
    private Nodo topo; // referencia para o nodo do topo da pilha

    public PilhaComListaEncadeada(){
        topo = null; // pilha vazia, topo é null
    }
    public void push(int item){
        Nodo novoNodo = new Nodo(item);
        novoNodo.proximo = topo; // o próximo do novo nodo é o antigo topo
        topo = novoNodo; // atualiza o topo para o novo nodo    
    }
    
    public int pop(){
        if (topo == null) {
            System.out.println("pilha vazia");
            return -1; // valor indicativo de pilha vazia
        } else{
            int valor = topo.valor;
            topo = topo.proximo;
            return valor;
        }
    }

    public int peek(){
        if(topo==null){
            System.out.println("pilha vazia");
            return -1; // valor indicativo de pilha vazia
        } else {
            return topo.valor;
        }
    }

    public boolean ismpty(){
        return topo == null; // retorna true se a pilha estiver vazia
    }

    public int size(){
        int count = 0;
        Nodo atual = topo;
        while(atual != null){
            count++;
            atual = atual.proximo;
        }
        return count; // retorna o número de elementos na pilha
    }
}
