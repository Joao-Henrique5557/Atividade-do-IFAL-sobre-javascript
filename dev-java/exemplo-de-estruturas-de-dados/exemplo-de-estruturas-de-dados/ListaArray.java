public class ListaArray {
    public static void main(String[] args) {
        // Criando um array
        int[] lista = {2, 3, 8, 10, 3};

        // Acessando o primeiro e último elemento

        System.out.println("Primeiro elemento: " + lista[0]);
        System.out.println("Ultimo elemento: " + lista[lista.length - 1]);


        // Substituindo o terceiro elemento
        lista[2] = 7;
        System.out.println("Novo terceiro elemento: " + lista[2]);

        // Adicionando um novo elemento (criação de um novo array)

        int[] novaLista = new int[lista.length + 1];
        System.arraycopy(lista, 0, novaLista, 0, lista.length);
        novaLista[novaLista.length - 1] = 15;

        // imprimindo a lista
        System.out.println("Lista após a adição de 15:");

        for (int num : novaLista) {
            System.out.println(num + " ");
        }
    }
}
