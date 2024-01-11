
import java.util.Scanner;

public class DDd {

    public static void main(String[] args) {

        boolean continuar = true;

        while (continuar) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o DDD ou ZERO para sair: ");
            int dDD = scan.nextInt();

            if (dDD == 0) {

                continuar = false;// o programa para de funcionar
                System.out.println("Voce saiu. Ate Mais!");

            } else {
                
                DDDEstados estados = new DDDEstados();
                estados.imprimirDDD(dDD);

            }

        }

    }

}
