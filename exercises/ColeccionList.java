import java.util.ArrayList;
import java.util.List;

public class ColeccionList {
public static void main(String[] args) {
    //creamos un listado de frutas tipo String en un ArrayList

    List<String> frutas = new ArrayList<>();

    frutas.add("manzana");
    frutas.add("peras");
    frutas.add("banana");
    frutas.add("manzana"); //si permite valores duplicados

    System.out.println(frutas);

    //primer ejemplo
    String primeraFruta=frutas.get(0);
    System.out.println(primeraFruta);

    //ciclo de la lista
    for (String fruta : frutas) {
        System.out.println(fruta);
    }

}
}
