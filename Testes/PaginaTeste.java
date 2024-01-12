package Testes;

import java.util.HashMap;
import java.util.Scanner;

/* criar um programa para verificar se o nome numero digitado está cadastrado em uma Array */

public class PaginaTeste {

    public static void main(String[] args) {

        boolean continuar = true;

        while (continuar) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um DDD ou ZERO para sair: ");
            int ddd = scan.nextInt();
            int ddd2 = ddd;

            if (ddd == 0) {
                continuar = false;
                System.out.println("Ate mais!!");

            } else {

                int[] array = { 11, 21, 81, 87 };

                imprimirDDD(array, ddd, ddd2);

            }
        }

    }

    private static void imprimirDDD(int[] array, int ddd, int ddd2) {

        if (verificaDDD(array, ddd)) {
            ddd = ddd;

        } else {
            ddd = ddd2 + 1;
        }

        if (ddd != ddd2) {
            System.out.println("DDD " + (ddd - 1) + " não está cadastrado ou não existe.");

        } else {

            HashMap<Integer, String> mapDDD = new HashMap<>();

            mapDDD.put(11, "São Paulo");
            mapDDD.put(81, "Pernambuco");
            mapDDD.put(21, "Rio de Janeiro");

            System.out.println(ddd + ": " + mapDDD.get(ddd));

        }

    }

    private static boolean verificaDDD(int[] array, int valor) {

        for (int elementos : array) {
            if (elementos == valor) {
                return true;

            }
        }
        return false;
    }

}
