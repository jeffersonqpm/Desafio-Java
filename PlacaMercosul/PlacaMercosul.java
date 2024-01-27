import java.util.Scanner;

public class PlacaMercosul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a placa");
        String G10 = scan.nextLine();
        // String G10 = "ABC1200"; // Substitua isso com o valor real de G10

        String resultado = concatenarFormula(G10);
        System.out.println(resultado);
    }

    public static String concatenarFormula(String G10) {
        // Obter os componentes da fórmula
        String parte1 = esquerda(G10, 5);
        String parte2 = esquerda(direita(G10, 2), 1);
        String parte3 = direita(G10, 1);

        switch (parte2) {
            case "0": parte2 = "A"; break;
            case "1": parte2 = "B"; break;
            case "2": parte2 = "C"; break;
            case "3": parte2 = "D"; break;
            case "4": parte2 = "E"; break;
            case "5": parte2 = "F"; break;
            case "6": parte2 = "G"; break;
            case "7": parte2 = "H"; break;
            case "8": parte2 = "I"; break;
            case "9": parte2 = "J"; break;
            default: System.out.println("Erro!");
        }

        //System.out.println(parte1 + parte2 + parte3);
        return parte1 + parte2 + parte3;
    }

    public static String esquerda(String texto, int numeroCaracteres) {
        return texto.substring(0, numeroCaracteres);
    }

    public static String direita(String texto, int numeroCaracteres) {
        return texto.substring(texto.length() - numeroCaracteres);
    }
}
