import java.util.ArrayDeque;
import java.util.Deque;

public class ColeccionDeque {
public static void main(String[] args) {
     // Crear una Deque de tipo String usando ArrayDeque
     Deque<String> deque = new ArrayDeque<>();

     //agregamos item al final de deque
     deque.addLast("Elemento 1");
     deque.addLast("elemento 2");
     deque.addLast("elemento 3");

     System.out.println(deque);
     //adicionamo al inicio
     deque.addFirst("elemento 0");
     System.out.println(deque);

     System.out.println("primer elemento de las lista: "+deque.getFirst());
     System.out.println("ultimo elemento de la lista:  "+deque.getLast());

     System.out.println("elimna el primer elemento");
     deque.removeFirst();
     System.out.println(deque);

     System.out.println("eliminamos el elemento 2");
     deque.remove("elemento 2");
     System.out.println(deque);
}
}
