import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ColeccionQueue {
public static void main(String[] args) {
    // Crear una Queue de tipo String usando LinkedList
    Queue<String> frutas= new ConcurrentLinkedQueue<>();

    frutas.add("manzana");
    frutas.add("peras");
    frutas.add("manzana");

    System.out.println(frutas);

    //primer elemento de la fila es
    String primerElemento=frutas.peek();
    System.out.println(primerElemento);

    //eliminamo el primer elemento con Poll
    String elementoEliminado= frutas.poll();
    System.out.println(elementoEliminado);
    System.out.println(frutas);

}
}
