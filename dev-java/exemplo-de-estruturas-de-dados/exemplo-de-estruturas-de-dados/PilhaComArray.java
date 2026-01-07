public class PilhaComArray {
    private int [] array; // array para armazenar os elementos da pilha
    private int topo; 

    public PilhaComArray(int capacidade){
        array = new int[capacidade]; // inicializa o array com a capacidade especificada
        topo = -1; // pilha vazia, topo é -1
    }

    public void push(int item){
        if(topo == array.length - 1){ // ex. tamanho = 10, array.length = 10, -1 = ultimo indice = 9. se topo for igual ao indice 9, a pilha está cheia
            System.out.println("pilha cheia");
        } else {
            // se a pilha não estiver cheia, adiciona o item
            array[++topo] = item; // incrementa o topo e adiciona o item
        }
    }

    public int pop(){
        if (topo == -1) {
            System.out.println("pilha vazia");
            return -1;
        } else {
            return array[topo--]; // retorna o item do topo e decrementa o topo
        }
    }

    public int peek(){
        if (topo == -1){
            return -1; // pilha vazia
        } else {
            return array[topo]; // retorna o item do topo sem removê-lo
        }
    }
    public boolean ismpty(){
        return topo == -1; // retorna true se a pilha estiver vazia
    }

    public int size(){
        return topo + 1; // retorna o número de elementos na pilha
    }
}
