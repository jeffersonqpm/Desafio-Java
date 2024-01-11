package Testes;

import java.util.Scanner;

public class teste2 {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um numero ou ZERO para SAIR: ");
            int valor = leitor.nextInt();

            if (valor == 0) {

                continuarPrograma = false;
                System.out.println("Ate mais!");

            } else {

                int[] array = { 1, 2, 3, 5, 6, 8, 9, 11,12 };

                if (vericaNumero(array, valor)) {
                    System.out.println("O numero " + valor + " EXISTE na array");

                } else {
                    System.out.println("O numero " + valor + " NÃO EXISTE na array");

                }
            }

        }

    }

    private static boolean vericaNumero(int[] array, int valor) {

        for (int elementos : array) {
            if (elementos == valor)
                return true;

        }
        return false;
    }

}
