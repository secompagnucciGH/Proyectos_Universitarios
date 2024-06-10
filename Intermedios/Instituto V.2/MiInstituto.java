import java.util.ArrayList;
/**
 * Esta clase permitirá almacenar listas de las
 * diferentes "personas" que interactúan en la Institución.
 * 
 * @author (Mario Finos) 
 * @version (V1)
 */
public class MiInstituto
{
    // definición de variables de instancia
    // un ArrayList por cada "tipo de persona"
    private ArrayList<Directivo> directivos;
    private ArrayList<Docente> docentes;
    private ArrayList<Administrativo> administrativos;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Persona> personas;

    /**
     * Constructor de objetos de la clase MiInstituto
     */
    public MiInstituto()
    {
        // inicializa las variables de instancia
        directivos = new ArrayList<Directivo>();
        docentes = new ArrayList<Docente>();
        administrativos = new ArrayList<Administrativo>();
        estudiantes = new ArrayList<Estudiante>();
        personas = new ArrayList<Persona>();
    }

    /**
     * Método agregarPersona
     * 
     * @param  Persona  persona La instancia de la clase Persona o 
     *                    cualquiera de sus subclases que se
     *                    desea agregar a la lista
     */
    public void agregarPersona(Persona persona)
    {
        personas.add(persona);
    }

    /**
     * Método agregarDirectivo
     * 
     * @param  Directivo directivo La instancia de la clase
     *                    Directivo que se desea agregar a la lista
     */
    public void agregarDirectivo(Directivo directivo)
    {
        directivos.add(directivo);
    }

    /**
     * Método agregarDocente
     * 
     * @param  Docente  docente    La instancia de la clase
     *                   Docente que se desea agregar a la lista
     */
    public void agregarDocente(Docente docente)
    {
        docentes.add(docente);
    }

    /**
     * Método agregarAdministrativo
     * 
     * @param  Administrativo  administrativo   La instancia de la clase
     *                  Administrativo que se desea agregar a la lista
     */
    public void agregarAdministrativo(Administrativo administrativo)
    {
        administrativos.add(administrativo);
    }

    /**
     * Método agregarEstudiante
     * 
     * @param  Estudiante  estudiante   La instancia de la clase
     *                  Estudiante que se desea agregar a la lista
     */
    public void agregarEstudiante(Estudiante estudiante)
    {
        estudiantes.add(estudiante);
    }

    /**
     * Método imprimirTodosLosDatos
     *          Este método permite imprimir los datos de todas las
     *          personas que interactúan en la institución
     */
    public void imprimirTodosLosDatos()
    {
        System.out.println("===============================================");
        System.out.println("Listado de todas las personas de la Institución");
        System.out.println("===============================================");
        System.out.println("Estudiantes");
        System.out.println("-----------");
        //recorre e imprime los datos de todos los estudiantes
        for (Estudiante estudiante : estudiantes) {
            imprimirDatosPersona(estudiante);
            System.out.println("  Carrera        :" + 
                                estudiante.getCarrera());
            System.out.println("  Cant.Mat.Aprob.:" + 
                                estudiante.getCantidadMateriasAprobadas());
            System.out.println("  Importe Cuota  :" + 
                                estudiante.getImporteCuota());
            System.out.println(estudiante.toString());
            System.out.println("..........................");
        }    
        System.out.println("Administrativos");
        System.out.println("---------------");
        //recorre e imprime los datos de todos los administrativos
        for (Administrativo administrativo : administrativos) {
            imprimirDatosPersona(administrativo);
            imprimirDatosEmpleado(administrativo);
            System.out.println("  Hora de Entrada:" + 
                                administrativo.getHoraEntrada());
            System.out.println("  Hora de Salida :" + 
                                administrativo.getHoraSalida());
            System.out.println(administrativo.toString());
            System.out.println("..........................");
        }    
        System.out.println("Docentes");
        System.out.println("--------");
        //recorre e imprime los datos de todos los docentes
        for (Docente docente : docentes) {
            imprimirDatosPersona(docente);
            imprimirDatosEmpleado(docente);
            System.out.println("  Materia        :" + docente.getMateria());
            System.out.println(docente.toString());
            System.out.println("..........................");
        }    
        System.out.println("Directivos");
        System.out.println("----------");
        //recorre e imprime los datos de todos los directivos
        for (Directivo directivo : directivos) {
            imprimirDatosPersona(directivo);
            imprimirDatosEmpleado(directivo);
            System.out.println("  Cargo          :" + directivo.getCargo());
            System.out.println(directivo.toString());
            System.out.println("..........................");
        }    
    }

    /**
     * Método imprimirPersonas
     *          Este método permite imprimir los datos de todas las
     *          personas que interactúan en la institución
     */
    public void imprimirPersonas()
    {
        System.out.println("===============================================");
        System.out.println("Listado de todas las personas de la Institución");
        System.out.println("===============================================");
        System.out.println("Estudiantes");
        System.out.println("-----------");
        //recorre e imprime los datos de todos los estudiantes
        for (Persona persona : personas) {
            if (persona.queSoy().equals("Estudiante")) {
                System.out.println(persona.toString());
                System.out.println("..........................");
            }    
        }    
        System.out.println("Administrativos");
        System.out.println("---------------");
        //recorre e imprime los datos de todos los administrativos
        for (Persona persona : personas) {
            if (persona.queSoy().equals("Administrativo")) {
                System.out.println(persona.toString());
                System.out.println("..........................");
            }    
        }    
        System.out.println("Docentes");
        System.out.println("--------");
        //recorre e imprime los datos de todos los docentes
        for (Persona persona : personas) {
            if (persona.queSoy().equals("Docente")) {
                System.out.println(persona.toString());
                System.out.println("..........................");
            }    
        }    
        System.out.println("Directivos");
        System.out.println("----------");
        //recorre e imprime los datos de todos los directivos
        for (Persona persona : personas) {
            if (persona.queSoy().equals("Directivo")) {
                System.out.println(persona.toString());
                System.out.println("..........................");
            }    
        }    
    }

    /**
     * Método imprimirCantidadDePersonasPorRol
     *          Este método permite imprimir la cantidad de 
     *          personas que interactúan en la institución según su rol
     */
    public void imprimirCantidadDePersonasPorRol()
    {
        System.out.println("=====================================================");
        System.out.println("Cantidad de personas por rol dentro de la Institución");
        System.out.println("=====================================================");
        System.out.println("Estudiantes       : " + estudiantes.size());
        System.out.println("Administrativos   : " + administrativos.size());
        System.out.println("Docentes          : " + docentes.size());
        System.out.println("Directivos        : " + directivos.size());
    }

    /**
     * Método imprimirCantidadDeEstudiantesPorMatAprob
     *          Este método permite imprimir la cantidad de estudiantes
     *          discriminados por la cantidad de materias aprobadas
     *          que poseen
     */
    public void imprimirCantidadDeEstudiantesPorMatAprob()
    {
        System.out.println("==========================================================");
        System.out.println("Cantidad de estudiantes por cantidad de materias aprobadas");
        System.out.println("==========================================================");
        System.out.println("     Materias aprobadas      Cantidad de estudiantes");
        int cantidades[] = new int[50];
        int x;
        for (Estudiante estudiante : estudiantes) {
            x = estudiante.getCantidadMateriasAprobadas();
            cantidades[x]++;
        }    

        for (x = 0; x < 50; x++ ) {
            if (cantidades[x] > 0) {
                System.out.println("             " + x
                         + "                       " + cantidades[x]);
            }    
        }    
    }

    /**
     * Método imprimirDatosPersona
     *          Este método privado imprime los datos correspondientes
     *          a la clase "Persona" que heredan todas las subclases
     *          que posee
     */
    private void imprimirDatosPersona(Persona persona)
    {
        System.out.println("  Nombre         :" + persona.getNombre());
        System.out.println("  DNI            :" + persona.getDni());
        System.out.println("  Fecha de Nacim.:" + persona.getFechaDeNacimiento());
        System.out.println("  Fecha de Ingr. :" + persona.getFechaDeIngreso());
    }

    /**
     * Método imprimirSueldoMensual
     *          Este método privado imprime los datos correspondientes
     *          a la clase "Empleado" que heredan todas las subclases
     *          que posee
     */
    private void imprimirDatosEmpleado(Empleado empleado)
    {
        System.out.println("  Sueldo Mensual :" + empleado.getSueldoMensual());
    }
}
