package Array;


import java.util.Scanner;

public class VerificarNumero {

    public static void main(String[] args) {

        boolean continuar = false;

        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero ou 666 para sair:");
            int opc = scan.nextInt();

            if (opc == 666) {
                continuar = true;
                System.out.println("Até mais Capiroto.");
            } else {
                int [] arriado = {1,2,3,5,6,8,9,11};

                if(verificaValor(arriado, opc) == true){
                    System.out.println("O número " + opc + " EXISTE NA ARRAY");
                    
                }else{
                    System.out.println("O número " + opc + " NÃO EXISTE NA ARRAY");

                }

            }

        } while (continuar == false);

    }



    private static boolean verificaValor(int[] array, int valorDigitado) {

        for (int elementos : array) {
            if (elementos == valorDigitado) {
                return true;

            }

        }
        return false;
    }

}
