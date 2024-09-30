import java.util.HashSet;
import java.util.Set;

public class ColeccionSet {
public static void main(String[] args) {
    //creamos un Set de frutas tipo String usando HashSet
    Set<String> frutas = new HashSet<>();

    frutas.add("banana");
    frutas.add("manzana");
    frutas.add("banana"); // no se adiciona porque no puede haber repetidos

    System.out.println(frutas);


}
}
