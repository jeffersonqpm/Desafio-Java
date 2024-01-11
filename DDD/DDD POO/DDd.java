
import java.util.Scanner;

public class DDd {

    public static void main(String[] args) {

        boolean continuar = false;

        while (continuar == false) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o DDD ou ZERO para sair:");
            int dDD = scan.nextInt();
            
            if(dDD == 0){
                
                continuar = true;
                System.out.println("SAIU!");
                
            }else{
                
                DDDEstados estados = new DDDEstados();
                
                 int [] array = {11,81,87,21};
                
                estados.imprimirDDD(array, dDD);
            }
           
        }

    }
}
