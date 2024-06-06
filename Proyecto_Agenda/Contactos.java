import java.util.Scanner;

/*
 * clase contactos que recibe por parametro datos del contacto y los almacena en las variables privadas.
 */
public class Contactos {
    private String nombre;
    private String localidad;
    private String direccion;
    String[] telefono = new String[5];

    
    public Contactos(String nombre, String localidad, String direccion, String caracteristica, String numero) {
        // validacion de datos nulos y/o incorrectos
    	this.nombre = (nombre != null && !nombre.trim().isEmpty()) ? nombre.toUpperCase() : "S/D";
        this.localidad = (localidad != null && !localidad.trim().isEmpty()) ? localidad.toUpperCase() : "S/D";
        this.direccion = (direccion != null && !direccion.trim().isEmpty()) ? direccion.toUpperCase() : "S/D";
        
        // como se almacena telefono
        String telefono = caracteristica + "-" + numero;
        
        if (validarCaracteristica(caracteristica) && validarNumero(numero)) {
            this.telefono[0] = telefono;
        } else {
            agregarTelefono();
        }
    }

    public String[] getTelefonos() {
        return telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = (nombre != null && !nombre.trim().isEmpty()) ? nombre.toUpperCase() : "S/D";
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = (localidad != null && !localidad.trim().isEmpty()) ? localidad.toUpperCase() : "S/D";
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = (direccion != null && !direccion.trim().isEmpty()) ? direccion.toUpperCase() : "S/D";
    }

    public int elementoVacio() {
        for (int i = 0; i < telefono.length; i++) {
            if (telefono[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean validarCaracteristica(String c) {
        return c.matches("0\\d{2,4}");
    }

    public boolean validarNumero(String num) {
        return num.matches("[1-9]\\d{4,6}");
    }

    public void agregarTelefono() {
        int indiceVacio = elementoVacio();
        if (indiceVacio != -1) {
            Scanner sc = new Scanner(System.in);
            String caracteristicaTelefonica;
            String numeroTelefonico;

            System.out.println("Hay espacio disponible para guardar el teléfono. A continuación, ingrese...");

            do {
                System.out.println("Ingrese la característica telefónica: ");
                caracteristicaTelefonica = sc.nextLine();
            } while (!validarCaracteristica(caracteristicaTelefonica));

            do {
                System.out.println("Ingrese el número de teléfono: ");
                numeroTelefonico = sc.nextLine();
            } while (!validarNumero(numeroTelefonico));

            telefono[indiceVacio] = caracteristicaTelefonica + "-" + numeroTelefonico;
        } else {
            System.out.println("No existe más lugar para agregar números telefónicos.");
        }
    }

    public void listarTelefonos() {
        boolean todosEnBlanco = true;
        for (String numero : telefono) {
            if (numero != null) {
                todosEnBlanco = false;
            }
        }

        if (todosEnBlanco) {
            System.out.println("No hay números de teléfonos registrados.");
        } else {
            for (int i = 0; i < telefono.length; i++) {
                if (telefono[i] != null) {
                    System.out.println((i + 1) + ". " + telefono[i]);
                }
            }
        }
    }

    public void eliminarTelefono() {
        Scanner sc = new Scanner(System.in);
        boolean todosEnBlanco = true;
        for (String numero : telefono) {
            if (numero != null) {
                todosEnBlanco = false;
                break;
            }
        }

        if (todosEnBlanco) {
            System.out.println("No existen números de teléfonos en la lista.");
        } else {
            listarTelefonos();
            System.out.println("\nIngrese el número de la posición del teléfono que desee eliminar: ");
            int indiceAEliminar = sc.nextInt();

            if (indiceAEliminar >= 1 && indiceAEliminar <= telefono.length) {
                telefono[indiceAEliminar - 1] = null;
                System.out.println("Número eliminado.");
            } else {
                System.err.println("Posición fuera de rango.");
            }
        }
    }

    public void modificarTelefono() {
        Scanner sc = new Scanner(System.in);

        boolean todosEnBlanco = true;
        for (String numero : telefono) {
            if (numero != null) {
                todosEnBlanco = false;
                break;
            }
        }

        if (!todosEnBlanco) {
            listarTelefonos();
            System.out.println("Ingrese el número de la posición a modificar (-1 para cancelar): ");
            int numeroLista = sc.nextInt();

            if (numeroLista >= 1 && numeroLista <= telefono.length) {
                sc.nextLine(); // Limpia el búfer
                System.out.println("Ingrese la nueva característica telefónica: ");
                String nuevaCaracteristica = sc.nextLine();
                if (validarCaracteristica(nuevaCaracteristica)) {
                    System.out.println("Ingrese el nuevo número de teléfono: ");
                    String nuevoNumero = sc.nextLine();
                    if (validarNumero(nuevoNumero)) {
                        telefono[numeroLista - 1] = nuevaCaracteristica + "-" + nuevoNumero;
                        System.out.println("Número modificado.");
                    } else {
                        System.err.println("Número no válido.");
                    }
                } else {
                    System.err.println("Característica telefónica no válida.");
                }
            } else if (numeroLista == -1) {
                return; // Cancela la operación si se ingresa -1
            } else {
                System.err.println("Número de lista fuera de rango.");
            }
        } else {
            System.out.println("No existen números de teléfonos en la lista para modificar.");
        }
    }
}
