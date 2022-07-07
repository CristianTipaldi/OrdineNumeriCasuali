import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Random;
import java.util.stream.IntStream;
import java.lang.Integer;

public class Main {

    public static void main(String[] args) {

        Random numeri = new Random();

        ArrayList<Integer> listanumeri = new ArrayList<>();
        for(int i = 0; i < 10000; i++){
            listanumeri.add(i, numeri.nextInt(0, 100000));
        }

        System.out.print(listanumeri);
        System.out.println(listanumeri.size());
        System.out.println("");

        riordinaNum(listanumeri);
        moltiplicaNum(listanumeri);
        sonoInOrdine(listanumeri);


    }

    public static void riordinaNum(ArrayList<Integer> listanumeri){

        List<Integer> listanew = listanumeri.stream().sorted().toList();
        for (int i = 0; i < 3; i++){
            System.out.println("la nuova lista e': " +listanew.get(i));
        }
    }

    public static void moltiplicaNum(ArrayList<Integer> listanumeri){

        List<Integer> listanew2 = listanumeri.stream().map(x -> x * 3).toList();
        for (int i = 0; i < 3; i++){
            System.out.println("la lista moltiplicata e': " +listanew2.get(i));
        }
    }

    /*public static void sommaNumPrecedente(ArrayList<Integer> listanumeri){

        IntStream
    }*/

    public static void sonoInOrdine(ArrayList<Integer> listanumeri){

        ArrayList<Integer> primi5 = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            primi5.add(i, listanumeri.get(i));
            System.out.println(primi5.get(i));
        }

        List<Integer> primi5ordinati = new ArrayList<>();
        primi5ordinati = primi5.stream().sorted().toList();

        if(primi5ordinati.equals(primi5)){
            System.out.println("sono ordinati");
        }
        else {
            System.out.println("non sono ordinati");
        }


    }

}
