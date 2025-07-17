import java.util.ArrayList;
import java.util.List;

public class ManipularArrayNumeros {

    public static void adicionarNumero(List<Integer> arrayList, int numero){
        if(buscarPosicaoNumero(arrayList, numero) > 0){
            throw new IllegalArgumentException("Numero jah contido na lista");
        }else{
            arrayList.add(numero);
        }
    }
    public static int buscarPosicaoNumero(List<Integer> arrayList, int numero){
        if(arrayList.contains(numero)){
               return arrayList.indexOf(numero);
        }else{
            return -1;
        }
    }

    public static void removerNumero(List<Integer> arrayList, int numero){
        try{
            arrayList.remove(buscarPosicaoNumero(arrayList, numero));
        }catch (Exception e){
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
    }
    public static void substituirNumero(List<Integer> arrayList, int numeroASubstituir, int novoNumero){
        try {
            arrayList.set(arrayList.indexOf(numeroASubstituir), novoNumero);
        } catch (Exception e) {
           arrayList.add(novoNumero);
        }
    }


}