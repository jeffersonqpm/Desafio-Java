import java.util.Scanner;

public class ArmazenarNomes {

    public static void main(String[] args) {
        // Criar um Scanner para a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Definir o tamanho do array
        int tamanhoArray = 5; // Você pode ajustar conforme necessário

        // Criar o array para armazenar os nomes
        String[] nomes = new String[tamanhoArray];

        // Solicitar nomes ao usuário e armazenar no array
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Fechar o Scanner para liberar recursos
        scanner.close();

        // Exibir os nomes armazenados no array
        System.out.print("Nomes armazenados:\n");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

