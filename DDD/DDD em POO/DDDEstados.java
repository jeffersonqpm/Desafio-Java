
import java.util.HashMap;

public class DDDEstados {

    public void imprimirDDD(int ddd) {

        int[] array = {11, 21, 81, 32};

        if (contemValor(array, ddd) == true) {
            ddd = ddd;

        } else {
            ddd = 0;
        }

        HashMap<Integer, String> mapDDD = new HashMap<>();

        if (ddd == 0) {

            System.out.println("DDD nao cadastrado ou nao existe");

        } else {

            mapDDD.put(11, "Sao paulo");
            mapDDD.put(21, "Rio de Janeiro");
            mapDDD.put(81, "Pernambuco");
            mapDDD.put(32, "Juiz de Fora");
            //mapDDD.put(0,"DDD nao cadastrado ou nao existe.");

            System.out.println(ddd + ": " + mapDDD.get(ddd));
        }
    }

    public boolean contemValor(int[] array, int valor) {

        for (int elemento : array) {
            if (elemento == valor) {
                return true;

            }

        }
        return false;
    }

}
