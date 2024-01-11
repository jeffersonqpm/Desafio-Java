
import java.util.HashMap;

public class DDDEstados {
    
    
    public void imprimirDDD(int [] array, int ddd){
        
        if(contemValor(array, ddd)){// verificar se é verdadeiro ou não
            ddd = ddd;
        }else{
            ddd = 0;
        }
        
        HashMap<Integer, String> mapDDD = new HashMap<>();
        
        mapDDD.put(11,"Sao Paulo");
        mapDDD.put(81,"Pernambuco");
        mapDDD.put(87,"Petrolina");
        mapDDD.put(21,"Rio de Janeiro");
        mapDDD.put(0,"DDD nao encontado");
        mapDDD.put(111,": ");
        
        System.out.println(ddd + mapDDD.get(111)+mapDDD.get(ddd));
        
    }
    
    public boolean contemValor(int [] array, int valor){
        
        for(int elemento : array){
            if(elemento == valor){
                return true;
            }
            
        }
        return false;
    }

  

}
