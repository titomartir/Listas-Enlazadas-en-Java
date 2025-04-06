import java.util.Scanner;

/**
 * Clase principal con menú interactivo para probar la lista enlazada
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        
        // Inicializar con lista predeterminada: 2, 3, 6, 9, 3, 8, 6, 1, 4, 1, 2, 1, 3
        int[] defaultList = {2, 3, 6, 9, 3, 8, 6, 1, 4, 1, 2, 1, 3};
        for (int num : defaultList) {
            list.add(num);
        }
        
        int option;
        do {
            System.out.println("\n=== MENÚ INTERACTIVO ===");
            System.out.println("Lista actual:");
            list.printList();
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar número al inicio");
            System.out.println("2. Agregar número al final");
            System.out.println("3. Agregar número en posición 1");
            System.out.println("4. Mostrar lista actual");
            System.out.println("5. Remover número");
            System.out.println("6. Mostrar lista después de eliminación");
            System.out.println("7. Verificar si número existe");
            System.out.println("8. Revertir lista");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Ingrese número para agregar al inicio: ");
                    int num = scanner.nextInt();
                    list.addFirst(num);
                    System.out.println("Número agregado al inicio.");
                    break;
                    
                case 2:
                    System.out.print("Ingrese número para agregar al final: ");
                    num = scanner.nextInt();
                    list.add(num);
                    System.out.println("Número agregado al final.");
                    break;
                    
                case 3:
                    System.out.print("Ingrese número para agregar en posición 1: ");
                    num = scanner.nextInt();
                    list.addMiddle(num, 1);
                    System.out.println("Número agregado en posición 1.");
                    break;
                    
                case 4:
                    System.out.println("Lista actual:");
                    list.printList();
                    break;
                    
                case 5:
                    System.out.print("Ingrese número a remover: ");
                    num = scanner.nextInt();
                    list.remove(num);
                    System.out.println("Operación de eliminación completada.");
                    break;
                    
                case 6:
                    System.out.println("Lista actual después de eliminación:");
                    list.printList();
                    break;
                    
                case 7:
                    System.out.print("Ingrese número a verificar: ");
                    num = scanner.nextInt();
                    boolean exists = list.contains(num);
                    System.out.println("El número " + num + (exists ? " SÍ" : " NO") + " está en la lista");
                    break;
                    
                case 8:
                    list.reverse();
                    System.out.println("Lista revertida con éxito.");
                    break;
                    
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
        } while (option != 0);
        
        scanner.close();
    }
}