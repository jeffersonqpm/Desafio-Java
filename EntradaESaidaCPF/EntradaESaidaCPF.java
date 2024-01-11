import java.util.Scanner;
import java.util.Locale;

public class EntradaESaidaCPF{
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));

		Scanner scan = new Scanner(System.in);
		
		String[] cpf = new String[4]; 

		cpf = scan.nextLine().split("\\.|-");

    for (int i = 0; i < 4; i++) {
      System.out.printf("%s\n",cpf[i]);
    }

		scan.close();
	}
}