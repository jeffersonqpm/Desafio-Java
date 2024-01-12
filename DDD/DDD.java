/*
====================================================
Iniciando a programação em Java
====================================================
3/3 - DDD
====================================================

Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

--------------------------------
| DDD  | Destination           |
| 61   | Brasilia              |
| 71   | Salvador              |
| 11   | São Paulo             |
| 21   | Rio de Janeiro        |
| 32   | Juiz de Fora          |
| 19   | Campinas              |
| 27   | Vitoria               |
| 31   | Belo Horizonte        |
--------------------------------

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

Entrada
A entrada consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.
 
-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
| 11                 | São Paulo        |
-----------------------------------------

SOLUÇÃO 01 ABAIXO: */

package DDD;

import java.util.HashMap;
import java.util.Scanner;

public class DDD {

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
            valor = valor+1;
        }

        HashMap<Integer, String> mapDDD = new HashMap<>();

        if (valor != valor2) {
            System.out.println("DDD " + (valor-1) + " não cadastrado ou não existe.");

        // } else if(valor == valor){
        } else {

            mapDDD.put(11, "São Paulo");
            mapDDD.put(21, "Rio de Janeiro");
            mapDDD.put(81, "Pernambuco");
            mapDDD.put(87, "Petrolina");

            mapDDD.put(123, ": ");

            System.out.println("DDD " + valor + mapDDD.get(123) + mapDDD.get(valor));
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
