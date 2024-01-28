import java.util.Scanner;

public class ArmazenamentoNomes {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int tamanhoLista = 3;

        String [] listName = new String[tamanhoLista];

        for(int i =0; i< tamanhoLista; i++){
            System.out.println("Digite um nome");
            listName[i] = scan.next();

        }
        scan.close();

        System.out.println("Nomes armazenados:");
        for(String nomes : listName){
            System.out.println(nomes);

        }
    }
    
}
