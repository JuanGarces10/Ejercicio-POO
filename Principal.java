import java.util.*;

public class Principal {

    private static Map<Integer, Radios> radios = new HashMap<>();


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("1. Crear Radio");
            System.out.println("2. Leer Radio");
            System.out.println("3. Actualizar Radio");
            System.out.println("4. Eliminar Radio");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int choice = entrada.nextInt();
            entrada.nextLine(); 

            switch (choice) {
                case 1:
                    crearRadio(entrada);
                    break;
                case 2:
                    buscarRadio(entrada);
                    break;
                case 3:
                    actualizarRadio(entrada);
                    break;
                case 4:
                    eliminarRadio(entrada);
                    break;
                case 5:
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        entrada.close();
    }

    private static void crearRadio(Scanner entrada) {
        System.out.print("Digite el id de la radio: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Nombre de la radio: ");
        String nombre = entrada.nextLine();
        System.out.print("Frecuencia: ");
        String frecuencia = entrada.nextLine();
        System.out.print("Tipo de Frecuencia: ");
        String tipoFrecuencia = entrada.nextLine();

        Radios radio = new Radios();
        radio.id = id;
        radio.nombre = nombre;
        radio.frecuencia = frecuencia;
        radio.tipo_frecuencia = tipoFrecuencia;

        radios.put(radio.id, radio);
        System.out.println("Radio creada con ID: " + radio.id);
    }

    private static void buscarRadio(Scanner entrada) {
        System.out.print("ID de la radio a leer: ");
        int id = entrada.nextInt();
        entrada.nextLine(); 

        Radios radio = radios.get(id);
        if (radio != null) {
            System.out.println("ID: " + radio.id);
            System.out.println("Nombre: " + radio.nombre);
            System.out.println("Frecuencia: " + radio.frecuencia);
            System.out.println("Tipo de Frecuencia: " + radio.tipo_frecuencia);
        } else {
            System.out.println("Radio no encontrada.");
        }
    }

    private static void actualizarRadio(Scanner entrada) {
        System.out.print("ID de la radio a actualizar: ");
        int id = entrada.nextInt();
        entrada.nextLine(); 

        Radios radio = radios.get(id);
        if (radio != null) {
            System.out.print("Nuevo nombre de la radio: ");
            radio.nombre = entrada.nextLine();
            System.out.print("Nueva frecuencia: ");
            radio.frecuencia = entrada.nextLine();
            System.out.print("Nuevo tipo de Frecuencia: ");
            radio.tipo_frecuencia = entrada.nextLine();

            System.out.println("Radio actualizada.");
        } else {
            System.out.println("Radio no encontrada.");
        }
    }

    private static void eliminarRadio(Scanner entrada) {
        System.out.print("ID de la radio a eliminar: ");
        int id = entrada.nextInt();
        entrada.nextLine(); 

        if (radios.remove(id) != null) {
            System.out.println("Radio eliminada.");
        } else {
            System.out.println("Radio no encontrada.");
        }
    }
}
