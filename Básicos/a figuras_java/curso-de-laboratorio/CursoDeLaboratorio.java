import java.util.*;

/**
 * La clase CursoDeLaboratorio representa una lista de inscripciones para un curso de laboratorio.
 * Almacena el horario, aula y participantes del laboratorio, tambien el nombre del instructor.
 * 
 * @author Michael Kolling and David Barnes
 * @version 2006.03.30
 *
 * Traductores: Jose Cardilli y Mario Finos
*/
public class CursoDeLaboratorio
{
    private String instructor;
    private String aula;
    private String diaYHora;
    private List<Estudiante> estudiantes;
    private int capacidad;
    
    /**
     * Crea un CursoDeLaboratorio con el maximo numero de inscripciones. Todos los otros
     * detalles son puestos en el valor por defecto.
     */
    public CursoDeLaboratorio(int maximoNumeroDeEstudiantes)
    {
        instructor = "desconocido";
        aula = "desconocida";
        diaYHora = "desconocido";
        estudiantes = new ArrayList<Estudiante>();
        capacidad = maximoNumeroDeEstudiantes;
    }

    /**
     * Agrega un estudiante a este CursoDeLaboratorio.
     */
    public void inscribirEstudiante(Estudiante nuevoEstudiante)
    {
        if(estudiantes.size() == capacidad) {
            System.out.println("El curso esta completo, no puede inscribirse");
        }
        else {
            estudiantes.add(nuevoEstudiante);
        }
    }
    
    /**
     * Retorna el numero de estudiantes actualmente inscriptos en este CursoDeLaboratorio.
     */
    public int numeroDeEstudiantes()
    {
        return estudiantes.size();
    }
    
    /**
     * Asigna un numero de aula a este CursoDeLaboratorio.
     */
    public void ponerAula(String numeroDeAula)
    {
        aula = numeroDeAula;
    }
    
    /**
     * Asigna el horario para este CursoDeLaboratorio. El parametro debe definir el dia
     * y la hora del dia, por ejemplo "Viernes, 10am".
     */
    public void ponerHorario(String diaYHoraCadena)
    {
        diaYHora = diaYHoraCadena;
    }
    
    /**
     * Asigna el nombre del instructor a este CursoDeLaboratorio.
     */
    public void ponerInstructor(String nombreDeInstructor)
    {
        instructor = nombreDeInstructor;
    }
    
    /**
     * Imprime una lista del curso con otros detalles del CursoDeLaboratorio en la terminal
     * estandar.
     */
    public void imprimirLista()
    {
        System.out.println("Curso de laboratorio " + diaYHora);
        System.out.println("Instructor: " + instructor + "   aula: " + aula);
        System.out.println("Lista de la clase:");
        for(Estudiante estudiante : estudiantes) {
            estudiante.imprimir();
        }
        System.out.println("Numero de estudiantes: " + numeroDeEstudiantes());
    }
}
