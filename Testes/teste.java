package Testes;

import java.util.HashMap;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um DDD ou ZERO para sair: ");
            int opc = scan.nextInt();

            if (opc == 0) {
                continuarPrograma = false;
                System.out.println("Ate mais!");
            } else {
                int[] array = { 11, 21, 81, 87 };
                imprimirDDD(array, opc);

            }

        }

    }

    private static void imprimirDDD(int[] array, int ddd) {

        if (vericaNumero(array, ddd) == true) {

            ddd = ddd;
        } else {
            ddd = 0;
        }

        HashMap<Integer, String> mapDDD = new HashMap<>();

        mapDDD.put(11, "Sao Paulo");
        mapDDD.put(21, "Rio de Janeiro");
        mapDDD.put(81, "Pernembuco");
        mapDDD.put(87, "Petrolina");
        mapDDD.put(0, "DDD não existe ou não está cadastrado.");

        System.out.println(ddd + ": " + mapDDD.get(ddd));

    }

    private static boolean vericaNumero(int[] array, int valor) {

        for (int elementos : array) {
            if (elementos == valor) {
                return true;

            }
        }
        return false;

    }

}
