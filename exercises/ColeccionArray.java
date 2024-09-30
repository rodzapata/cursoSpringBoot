import java.util.ArrayList;
import java.util.Collection;

public class ColeccionArray {
public static void main(String[] args) {
    //creamos una coleccion de frutas tipo String
    Collection<String> frutas =new ArrayList<>();
    frutas.add("manzana");
    frutas.add("pera");
    frutas.add("banana");

    //imprime todos los elementos de la frutas
    System.out.println(frutas);

    //verificamos si banana esta en el array
    if(frutas.contains("fresa")){
        System.out.println("si se encuentra banana");
    }else{
        System.out.println("no se encuentra");
    }

    //eliminamos el elemento banana
    frutas.remove("banana");
    System.out.println(frutas);
}
}
