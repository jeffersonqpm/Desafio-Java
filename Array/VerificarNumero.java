package Array;

import java.util.Scanner;

public class VerificarNumero {

    public static void main(String[] args) {

        boolean continuar = false;

        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero ou 999 para sair");
            int valor = scan.nextInt();

            if (valor == 999) {

                continuar = true;
                System.out.println("Ate mais capiroto");

            } else {

                int[] array = { 1, 2, 3, 5, 6, 8, 9, 11,12 };

                if (verificaNumero(array, valor) == true) {
                    System.out.println("O numero " + valor + " EXISTE NA ARRAY");
                } else {
                    System.out.println("O numero " + valor + " NÃO EXISTE NA ARRAY");

                }

            }

        } while (continuar == false);

    }

    private static boolean verificaNumero(int[] array, int valorDigitado) {

        for (int elementos : array) {
            if (elementos == valorDigitado) {
                return true;

            }

        }
        return false;
    }

}
