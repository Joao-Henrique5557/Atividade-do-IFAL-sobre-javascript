public class D_icrementacao {
    // ++a
    int a = 5; 
    int result = ++a;
    
    int b = 5;
    int result2 = b++;

    public void pre_incrementacao(){
        System.out.println("Valor de a: " + a); // 6 pois já foi incrementado!
        System.out.println("Valor de result: " + result); // 6 ainda
    }

    public void pos_incrementacao(){
        System.out.println("Valor de b: " + b); // 6 agora, a linha 7 já incrementou
        System.out.println("Valor de result2: " + result2); // 5 ainda, pois o incremento só vale para a próxima vez que b for usado
    }

    // ++a
    // O valor é incrementado antes de ser usado na expressão.
    // b++
    // O valor é usado na expressão e depois incrementado.
}