/**
 * Clase que representa un nodo de la lista enlazada
 */
public class Node {
    public int data;      // Valor almacenado en el nodo
    public Node next;     // Referencia al siguiente nodo

    /**
     * Constructor del nodo
     * @param data Valor a almacenar en el nodo
     */
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}