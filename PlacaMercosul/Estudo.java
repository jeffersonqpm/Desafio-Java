import java.util.Scanner;

public class Estudo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        System.out.println("Digite a placa ou ZERO para sair: ");

        String placa = scan.nextLine();

        System.out.println(concatenar(placa));

    }

    private static String concatenar(String placa){

        String parte1 = esquerda(placa, 5);
        String parte2 = esquerda(diretia(placa, 2), 1);
        String parte3 = diretia(placa, 1);

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
               
        
            default:
            System.out.println("Inválido!");
                break;
        }

        return (parte1 + parte2 + parte3);
    }

    private static String esquerda(String texto, int numeroCaractere){

        return texto.substring(0,numeroCaractere);

    }

    private static String diretia(String texto, int numeroCaractere){
        return texto.substring(texto.length() - numeroCaractere);
    }

}
