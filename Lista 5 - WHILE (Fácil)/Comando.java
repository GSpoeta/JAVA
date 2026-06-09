package Lista5FA;

public class Comando {
  
     public static void main(String[] args) {
    
         // aqui mostra o titulo da execucao
         System.out.println("\n=== Comendo Pizza ===");
         
         // aqui define quantas fatias de pizza tem no inicio
         int fatiasPizza = 8;
         
         // aqui vai repetindo enquanto ainda tiver fatias
         while (fatiasPizza > 0) {
             
             // aqui diminui uma fatia a cada rodada
             fatiasPizza--;
             
             // aqui mostra que comeu uma fatia e quantas restam
             System.out.println("Comi uma fatia! Restam: " + fatiasPizza);
         }
         
         // aqui mostra quando acabou a pizza
         System.out.println("Comi demais!");
    }
}