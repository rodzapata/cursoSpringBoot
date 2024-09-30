import java.util.HashMap;
import java.util.Map;

public class ColeccionMap {
public static void main(String[] args) {
    // Crear un HashMap para almacenar claves y valores de tipo String de paises y sus capitales
    Map<String, String> capitales= new HashMap<>();
    
    //insertamos el pais y la capital con el mento Put()
    capitales.put("colombia","bogota");
    capitales.put("chile","santiago");
    capitales.put("argentina","buenos aires");

    System.out.println(capitales);

    //obtener el valor por su llave
    String capitalChile = capitales.get("chile");
    System.out.println("la capital de chile es:  "+capitalChile);

    //verificar si una llave existe
    if (capitales.containsKey("colombia")){
        System.out.println("colombia si existe");
    }

    //vericar si un valor existe
    if (capitales.containsValue("bogota")){
        System.out.println("bogota si existe como capital");
    }

    //recorrer el mapa
    System.out.println("------ Recorrido del mapa -----");
        for (Map.Entry<String, String> pais  : capitales.entrySet()) {
            System.out.println("el pais es "+pais.getKey()+ " y su capital es "+pais.getValue());
            
        }

    // eliminamo pais por su key
    System.out.println("eliminamos a argentina por la su key");
    capitales.remove("argentina");
    System.out.println(capitales);
}
}
