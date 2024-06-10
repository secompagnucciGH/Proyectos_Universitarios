
/**
 * Esta clase se utiliza para probar algunos casos de la
 * clase MiInstituto.
 * 
 * @author Sebastian Compagnucci
 * @version (V1)
 */
public class PruebaMiInstituto
{
    /**
     * Constructor de objetos de la clase PruebaMiInstituto
     */
    public PruebaMiInstituto()
    {
        // define e inicializa una variables de tipo "Institucion" 
        MiInstituto i1 = new MiInstituto();

        // define e inicializa tres variables de tipo "Docente" 
        Docente d1 = new Docente();
        Docente d2 = new Docente();
        Docente d3 = new Docente();
        
        // asigna información a los 3 docentes
        d1.setDni(12345678);
        d1.setNombre("Jose");
        d1.setFechaDeIngreso("01-01-2000");
        d1.setFechaDeNacimiento("01-01-1980");
        d1.setSueldoMensual(1234.56);
        d1.setMateria("Lógica y estructura de Datos");
        d2.setDni(11223344);
        d2.setNombre("Mario");
        d2.setFechaDeIngreso("01-01-1990");
        d2.setFechaDeNacimiento("01-01-1970");
        d2.setSueldoMensual(1234.00);
        d2.setMateria("Programación 1");
        d3.setDni(11112222);
        d3.setNombre("Mario");
        d3.setFechaDeIngreso("01-01-1995");
        d3.setFechaDeNacimiento("01-01-1971");
        d3.setSueldoMensual(1235.00);
        d3.setMateria("Programación 2");

        // define e inicializa dos variables de tipo "Directivo" 
        Directivo di1 = new Directivo();
        Directivo di2 = new Directivo();
        
        // asigna información a los 2 directivos
        di1.setDni(12345679);
        di1.setNombre("Analía");
        di1.setFechaDeIngreso("01-01-2001");
        di1.setFechaDeNacimiento("01-01-1981");
        di1.setSueldoMensual(2222.22);
        di1.setCargo("Gerente");
        di2.setDni(11223345);
        di2.setNombre("Roxana");
        di2.setFechaDeIngreso("01-01-1991");
        di2.setFechaDeNacimiento("01-01-1971");
        di2.setSueldoMensual(3333.00);
        di2.setCargo("Director");
        
        // define e inicializa dos variables de tipo "Administrativo" 
        Administrativo a1 = new Administrativo();
        Administrativo a2 = new Administrativo();
        
        // asigna información a los 2 administrativos
        a1.setDni(12345679);
        a1.setNombre("Rafael");
        a1.setFechaDeIngreso("01-01-2002");
        a1.setFechaDeNacimiento("01-01-1982");
        a1.setSueldoMensual(1111.22);
        a1.setHoraEntrada(07);
        a1.setHoraSalida(14);
        a2.setDni(11223345);
        a2.setNombre("Juana");
        a2.setFechaDeIngreso("01-01-1992");
        a2.setFechaDeNacimiento("01-01-1972");
        a2.setSueldoMensual(1111.22);
        a2.setHoraEntrada(14);
        a2.setHoraSalida(21);
        
        // define e inicializa cinco variables de tipo "Estudiante" 
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante();
        Estudiante e3 = new Estudiante();
        Estudiante e4 = new Estudiante();
        Estudiante e5 = new Estudiante();
        
        // asigna información a los 5 estudiantes
        e1.setDni(33333333);
        e1.setNombre("Aldo");
        e1.setFechaDeIngreso("01-01-2017");
        e1.setFechaDeNacimiento("01-01-2000");
        e1.setImporteCuota(888.00);
        e1.setCarrera("Técnico Superior en Desarrollo de Software");
        e1.setCantidadMateriasAprobadas(6);
        e2.setDni(33334444);
        e2.setNombre("Antonella");
        e2.setFechaDeIngreso("01-01-2018");
        e2.setFechaDeNacimiento("02-01-2000");
        e2.setImporteCuota(999.00);
        e2.setCarrera("Técnico Superior en Periodismo");
        e2.setCantidadMateriasAprobadas(0);
        e3.setDni(33331111);
        e3.setNombre("Aldo");
        e3.setFechaDeIngreso("01-01-2016");
        e3.setFechaDeNacimiento("01-01-1995");
        e3.setImporteCuota(999.00);
        e3.setCarrera("Técnico Superior en Periodismo");
        e3.setCantidadMateriasAprobadas(22);
        e4.setDni(33335555);
        e4.setNombre("Marcelo");
        e4.setFechaDeIngreso("01-01-2018");
        e4.setFechaDeNacimiento("03-01-2000");
        e4.setImporteCuota(888.00);
        e4.setCarrera("Técnico Superior en Desarrollo de Software");
        e4.setCantidadMateriasAprobadas(0);
        e5.setDni(33336666);
        e5.setNombre("Marta");
        e5.setFechaDeIngreso("01-01-2017");
        e5.setFechaDeNacimiento("05-01-2000");
        e5.setImporteCuota(888.00);
        e5.setCarrera("Técnico Superior en Desarrollo de Software");
        e5.setCantidadMateriasAprobadas(6);
        
        // invoca al método "agregarDocente" para agregar los 3
        // docentes a la lista
        i1.agregarDocente(d1);
        i1.agregarDocente(d2);
        i1.agregarDocente(d3);

        // invoca al método "agregarDirectivo" para agregar los 2
        // directivos a la lista
        i1.agregarDirectivo(di1);
        i1.agregarDirectivo(di2);

        // invoca al método "agregarAdministrativo" para agregar los 2
        // administrativos a la lista
        i1.agregarAdministrativo(a1);
        i1.agregarAdministrativo(a2);

        // invoca al método "agregarEstudiante" para agregar los 5
        // estudiantes a la lista
        i1.agregarEstudiante(e1);
        i1.agregarEstudiante(e2);
        i1.agregarEstudiante(e3);
        i1.agregarEstudiante(e4);
        i1.agregarEstudiante(e5);
        
        // invoca al método "agregarPersona" para agregar los 5
        // estudiantes, 3 docentes, 2 administrativos y 2
        // directivos a la lista
        i1.agregarPersona(e1);
        i1.agregarPersona(d1);
        i1.agregarPersona(a1);
        i1.agregarPersona(di1);
        i1.agregarPersona(e2);
        i1.agregarPersona(d2);
        i1.agregarPersona(a2);
        i1.agregarPersona(di2);
        i1.agregarPersona(d3);
        i1.agregarPersona(e3);
        i1.agregarPersona(e4);
        i1.agregarPersona(e5);
        
        // invoca al método “imprimirTodosLosDatos” de la clase
        // “Institucion” para listar los datos de las 4 listas.
        i1.imprimirTodosLosDatos();
        
        // invoca al método “imprimirCantidadDePersonasPorRol” de
        // la clase “Institucion” para listar la cantidad de 
        // elementos de cada una de las 4 listas.
        i1.imprimirCantidadDePersonasPorRol();
        
        // invoca al método “imprimirCantidadDeEstudiantesPorMatAprob”
        // de la clase “Institucion” para listar la cantidad de 
        // estudiantes discriminados por la cantidad de materias 
        // probadas que tienen.
        i1.imprimirCantidadDeEstudiantesPorMatAprob();

        // invoca al método “imprimirPersonas” de la clase
        // “Institucion” para listar los datos de la lista "personas".
        i1.imprimirPersonas();
        
    }
}
