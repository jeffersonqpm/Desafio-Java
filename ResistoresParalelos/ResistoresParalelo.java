import java.util.Scanner;

public class ResistoresParalelo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perguntar quantos resistores serão calculados
        System.out.print("Quantos resistores você deseja calcular? ");
        int quantidadeResistores = scanner.nextInt();

        // Criar um array para armazenar os valores dos resistores
        double[] resistores = new double[quantidadeResistores];

        // Preencher o array com os valores dos resistores
        for (int i = 0; i < quantidadeResistores; i++) {
            System.out.print("Digite o valor do resistor " + (i + 1) + " (em ohms): ");
            resistores[i] = scanner.nextDouble();
        }

        // Calcular o valor equivalente de resistores em paralelo
        double resultado = calcularResistoresParalelo(resistores);

        // Imprimir o resultado
        System.out.println("O valor equivalente de resistores em paralelo é: " + resultado + " ohms");

        scanner.close();
    }

    // Método para calcular o valor equivalente de resistores em paralelo
    public static double calcularResistoresParalelo(double[] resistores) {
        double somaInversos = 0.0;

        // Somar os inversos dos resistores
        for (double resistor : resistores) {
            somaInversos += 1.0 / resistor;
        }

        // Calcular o inverso da soma
        double inversoSoma = 1.0 / somaInversos;

        return inversoSoma;
    }
}
