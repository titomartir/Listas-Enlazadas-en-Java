/**
 * Clase que implementa una lista enlazada con sus operaciones básicas
 */
public class LinkedList {
    private Node head;  // Primer nodo de la lista

    /**
     * Constructor de la lista enlazada
     */
    public LinkedList() {
        this.head = null;
    }

    /**
     * Agrega un nuevo nodo al final de la lista
     * @param data Valor a agregar
     */
    public void add(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    /**
     * Agrega un nuevo nodo al inicio de la lista
     * @param data Valor a agregar
     */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Agrega un nuevo nodo en una posición específica
     * @param data Valor a agregar
     * @param position Posición donde insertar (0-based)
     */
    public void addMiddle(int data, int position) {
        if (position < 0) {
            System.out.println("Posición inválida");
            return;
        }
        
        if (position == 0) {
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node current = head;
        int currentPosition = 0;
        
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        
        if (current == null) {
            System.out.println("Posición fuera de rango");
            return;
        }
        
        newNode.next = current.next;
        current.next = newNode;
    }

    /**
     * Elimina el nodo que contiene el valor especificado
     * @param data Valor a eliminar
     */
    public void remove(int data) {
        if (head == null) return;
        
        if (head.data == data) {
            head = head.next;
            return;
        }
        
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    /**
     * Imprime los valores de todos los nodos en la lista
     */
    public void printList() {
        Node current = head;
        System.out.print("Lista: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * Revierte el orden de la lista enlazada
     */
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        head = prev;
    }

    /**
     * Verifica si un valor existe en la lista
     * @param value Valor a buscar
     * @return true si existe, false si no
     */
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}