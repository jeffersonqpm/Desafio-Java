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

        Scanner leitor = new Scanner(System.in);

        int dDD = leitor.nextInt();

        imprimirDDD(dDD);

    }

    static void imprimirDDD(int ddd) {

        int[] array = { 61, 71, 11, 21, 32, 19, 27, 31,81 };
       // int valor = ddd;
        if (contemValor(array, ddd)) {

            ddd = ddd;

        } else {
            ddd = 0;
        }

        HashMap<Integer, String> mapDDD = new HashMap<>();

        mapDDD.put(61, "Brasilia");
        mapDDD.put(71, "Salvador");
        mapDDD.put(11, "São Paulo");
        mapDDD.put(21, "Rio de Janeiro");
        mapDDD.put(32, "Juiz de Fora");
        mapDDD.put(19, "Campinas");
        mapDDD.put(27, "Vitoria");
        mapDDD.put(31, "Belo Horizonte");
        mapDDD.put(81, "Pernambuco");
        mapDDD.put(0, "DDD Não cadastrado");
        
        System.out.println(ddd + ": " + mapDDD.get(ddd));
     
    }

    

    private static boolean contemValor(int[] array, int valor) {
        for (int elemento : array) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }

}
