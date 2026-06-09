package Lista5FA;

public class foguete {

    public static void main(String[] args) {

        // aqui mostra o titulo do programa
        System.out.println("=== Foguete Lento ===");
        
        // aqui inicia o contador em 10
        int contador = 10;
        
        // aqui vai diminuindo o contador ate chegar em 0
        while (contador >= 0) {
            
            // aqui mostra o valor atual do contador
            System.out.println(contador);
            
            // aqui diminui 2 a cada repeticao
            contador = contador - 2;
        }
        
        // aqui mostra quando o foguete decola
        System.out.println("Decolou!");
    }
}