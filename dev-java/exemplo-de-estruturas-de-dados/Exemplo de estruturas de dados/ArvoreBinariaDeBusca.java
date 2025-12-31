
public class ArvoreBinariaDeBusca {

    private Folha folha;      
    private ArvoreBinariaDeBusca esquerda;    
    private ArvoreBinariaDeBusca direita;     


    public ArvoreBinariaDeBusca(){
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }


    public ArvoreBinariaDeBusca(Folha folha){
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }


    public boolean isEmpty(){
        return this.folha == null;
    }


    public void inserir(Folha novo){
        System.out.println("Inserindo novo valor");
        if(isEmpty()){
            System.out.print("Essa arvore não possui uma raiz...   ");
            this.folha = novo;
            System.out.println("Nova raiz com o valor " + this.folha.getValor()+".");
        } else {
            System.out.println("Criando uma subárvore...");
            ArvoreBinariaDeBusca novaArvore = new ArvoreBinariaDeBusca(novo);
            System.out.println("nova subárvore 'novaArvore' criada com o valor: " + novaArvore.folha.getValor());
            if(novo.getValor() < this.folha.getValor()){
                System.out.println("Verificando se o valor é menor que o da raiz da árvore binaria...  True");
                if(this.esquerda == null){
                    System.out.println("Verificando se a esquerda da arvore está vazia... True");
                    this.esquerda = novaArvore;
                    System.out.println("Nova subárvore criada com o valor: " + this.esquerda.folha.getValor() + " e colocada a esquerda");
                } else {
                    System.out.println("Verificando se a esquerda da arvore está vazia... False");
                    System.out.println("Tratando a esquerda atual como uma nova subárvore... Pronto. Pecorrendo a arvore...");
                    this.esquerda.inserir(novo);
                    
                }
            } 
            else if (novo.getValor() > this.folha.getValor()){
                System.out.println("Verificando se o valor é maior que o da raiz da árvore binaria...  True");
                if(this.direita == null){
                    System.out.println("Verificando se a direita da arvore está vazia... True");
                    this.direita = novaArvore;
                    System.out.println("Nova subárvore criada com o valor: " + this.direita.folha.getValor() + " e colocada a direita");
                } else {
                    System.out.println("Verificando se a direita da arvore está vazia... False");
                    System.out.println("Tratando a direita atual como uma nova subárvore... Pronto. Pecorrendo a arvore...");
                    this.direita.inserir(novo);
                    
                }
            }
        }
    }
}