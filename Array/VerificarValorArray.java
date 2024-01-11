package Array;

import java.util.Scanner;

public class VerificarValorArray {
    public static void main(String[] args) {
        // Criar a array
        int[] array = {1, 2, 3, 4, 5};

        // Pedir ao usuário um valor inteiro
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        // Verificar se o valor está na array
        if (contemValor(array, valor)) {
            System.out.println("O valor está na array.");
        } else {
            System.out.println("O valor não está na array. Retornando 100.");
            valor = 100;
        }

        // Exibir o valor (pode ser 100 se não estiver na array)
        System.out.println("Valor final: " + valor);
    }

    // Função para verificar se o valor está na array
    private static boolean contemValor(int[] array, int valor) {
        for (int elemento : array) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }
}
