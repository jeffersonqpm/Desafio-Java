package Testes;

import java.util.HashMap;
import java.util.Scanner;

/* criar um programa para verificar se o nome numero digitado está cadastrado em uma Array */

public class PaginaTeste {

    public static void main(String[] args) {

        // Digite um DDD e retorne o estado.

        boolean continuar = false;

        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um DDD ou ZERO para sair: ");
            int DDD = scan.nextInt();
            int DDD2 = DDD;

            if (DDD == 0) {
                continuar = true;
                System.out.println("Saiu!");
            } else {
                int[] array = { 11, 21, 81, 87 };
                imprimirDDD(array, DDD, DDD2);
            }


        } while (continuar == false);

    }

    private static void imprimirDDD(int[] array, int valor, int valor2) {
       

        if (verificarDDD(array, valor)) {
            valor = valor;

        } else {
            valor = valor2+1;
        }

        HashMap<Integer, String> mapDD = new HashMap<>();

        if (valor != valor2) {
            System.out.println("DDD " + (valor-1) + " não cadastrado ou não existe.");

        // } else if(valor == valor){
        } else {

            mapDD.put(11, "São Paulo");
            mapDD.put(21, "Rio de Janeiro");
            mapDD.put(81, "Pernambuco");
            mapDD.put(87, "Petrolina");

            mapDD.put(123, ": ");

            System.out.println("DDD " + valor + mapDD.get(123) + mapDD.get(valor));
        }

    }

    private static boolean verificarDDD(int[] array, int valorDigitado) {

        for (int elementosArray : array) {
            if (elementosArray == valorDigitado) {
                return true;

            }

        }
        return false;
    }

}
