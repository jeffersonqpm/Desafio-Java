import java.util.Scanner;

public class Estudo {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma placa para ser convertida.");
        String placa = scan.next();


        
        System.out.println(concatenar(placa));

    }

    private static String concatenar(String placa){

        String parte1 = esquerda(placa, 5);
        String parte2 = esquerda(direita(placa,2),1);
        String parte3 = direita(placa,1);

        if("3".equals(parte2)){
        parte2 = "D";

        }else{
            parte2 = parte2;
        }

        
        
        return parte1+parte2+parte3;

    }

    private static String esquerda(String texto, int numeroCaractere){

        return texto.substring(0, numeroCaractere);

    }

    private static String direita(String texto, int numeroCaractere){
        return texto.substring(texto.length() - numeroCaractere);

    }
    
}
