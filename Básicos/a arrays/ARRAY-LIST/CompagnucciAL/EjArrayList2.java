import java.util.ArrayList;
import java.util.Scanner;

public class EjArrayList2 {
    private static ArrayList<String> nombre = new ArrayList<>();

    public EjArrayList2() {
        for (int i = 0; i < 5; i++) {
            String elementosIngresadosDefault = ("Elemento " + i);
            nombre.add(elementosIngresadosDefault);
        }
    }

    public void borrarElementos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el indice del elemento a eliminar: ");
        int numeroElementoEliminar = sc.nextInt();

        if (numeroElementoEliminar <= nombre.size()) {
            System.out.println("El Elemento " + nombre.size() + " se eliminó correctamente.");
            nombre.remove(numeroElementoEliminar - 1);
        } else if (numeroElementoEliminar == 100) {
            nombre.clear();
        } else {
            System.out.println("No existe un elemento en la posición ingresada.");
        }
    }

    public void cantidadDeElementos() {
        System.out.println("Cantidad de elementos en el arraylist: " + nombre.size());
    }

    public void consultaElementosPorNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del elemento que desea buscar en la lista: ");
        String nombreElementoBuscar = sc.nextLine();

        if (nombre.indexOf(nombreElementoBuscar) != -1) {
            System.out.println(
                    "El nombre de elemento ingresado se encuentra en el index: \n"
                            + nombre.indexOf(nombreElementoBuscar));
        } else {
            System.out.println("No hay ningun elemento con ese nombre en la lista.");
        }
    }

    public void insertaElemento() {
        Scanner sc = new Scanner(System.in);

        int insertarIndex;
        String insertarTexto;

        // Solicitar el índice de inserción y validar
        do {
            System.out.println("Ingrese el índice del nuevo elemento: ");
            insertarIndex = sc.nextInt();
            if (insertarIndex < 0 || insertarIndex > nombre.size()) {
                System.out.println(
                        "Error, el índice no es válido. Debe ser mayor o igual a 0 y menor a " + nombre.size());
            }
        } while (insertarIndex < 0 || insertarIndex > nombre.size());

        // Limpia el búfer de nueva línea
        sc.nextLine();

        // Solicitar el texto a insertar y validar que no esté vacío
        do {
            System.out.println("Ingrese el texto que quiere ingresar al índice " + insertarIndex + ": ");
            insertarTexto = sc.nextLine();
            if (insertarTexto.isEmpty()) {
                System.out.println("Error, el texto no puede estar vacío.");
            }
        } while (insertarTexto.isEmpty());

        // Insertar el texto en la posición especificada
        nombre.add(insertarIndex, insertarTexto);

        System.out.println("Elemento insertado correctamente en la posición " + insertarIndex);
    }

    public void listaDeElementos() {
        int listaDeElementos = nombre.size();
        System.out.println("La lista de elementos del arrayList es:");

        for (int i = 0; i < listaDeElementos; i++) {
            System.out.print("Index: " + i + ". " + nombre.get(i) + "\n");
        }
    }

    public void modificaElementos() {

        listaDeElementos();

        Scanner sc = new Scanner(System.in);
        int indexModificar;
        System.out.println("Ingrese el index del elemento que quiere modificar");

        indexModificar = sc.nextInt();

        System.out.println("Ahora ingrese el contenido del elemento del nuevo elemento en el index: " + indexModificar);

        sc.nextLine();

        String nuevoElemento = sc.nextLine();

        if (!nuevoElemento.isEmpty()) {
            nombre.add(indexModificar, nuevoElemento);
            System.out.println("El elemento ha sido modificado con éxito por: " + nuevoElemento + "\n");
            listaDeElementos();
        } else {
            System.out
                    .println("No se ha podido realizar la acción solicitada, el nuevo elemento no puede estar vacio.");
        }

    }

}
