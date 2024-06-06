import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String nombre;
    private List<Contactos> contactos;
    private List<Nota> notas;

    public Agenda(String nombre) {
        this.nombre = nombre;
        this.contactos = new ArrayList<>(); // Inicializa la lista de contactos
        this.notas = new ArrayList<>(); // Inicializa la lista de notas
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }
    
    // se agrega el contacto seleccionado
    public void agregarContacto(Contactos contacto) {
        contactos.add(contacto);
    }

    public void listarNotas() {
        System.out.println("*****************************************************************");
        System.out.println("Nombre: " + nombre);

        for (Nota nota : notas) {
            System.out.println("Titulo: " + nota.getTitulo());
            System.out.println("Texto: " + nota.getTexto());
            System.out.println("Mes: " + nota.getMes());
            System.out.println("Día: " + nota.getDia());
            Contactos contacto = nota.getContacto();
            System.out.println("Contacto: " + contacto.getNombre());
            System.out.println("Localidad: " + contacto.getLocalidad());
            System.out.println("Dirección: " + contacto.getDireccion());
            System.out.print("Teléfonos: ");

            String[] telefonos = contacto.getTelefonos();
            for (String telefono : telefonos) {
                if (telefono != null) {
                    System.out.print(telefono + " ");
                }
            }

            System.out.println();
        }

        System.out.println("*****************************************************************");

        System.out.println("*****************************************************************");
    }
}