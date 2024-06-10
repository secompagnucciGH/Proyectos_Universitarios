class Persona implements Runnable {
    private String nombre;
    private String tarea;
    private int duracion;

    public Persona(String nombre, String tarea, int duracion) {
        this.nombre = nombre;
        this.tarea = tarea;
        this.duracion = duracion;
    }

    @Override
    public void run() {
        System.out.println(nombre + " empezó a " + tarea);

        try {
            // Simula la tarea tomando tiempo (en milisegundos)
            Thread.sleep(duracion);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nombre + " terminó de " + tarea);
    }
}

public class EjemploHilos extends ThreadState {
    public static void main(String[] args) {
        // Creamos tres instancias de la clase Persona con diferentes tareas y tiempos
        Persona persona1 = new Persona("Persona 1", "caminar", 2000);
        Persona persona2 = new Persona("Persona 2", "correr", 3000);
        Persona persona3 = new Persona("Persona 3", "saltar", 1500);

        // Creamos tres hilos con las instancias de Persona
        Thread hiloPersona1 = new Thread(persona1);
        Thread hiloPersona2 = new Thread(persona2);
        Thread hiloPersona3 = new Thread(persona3);

        // Iniciamos los hilos
        hiloPersona1.start();
        hiloPersona2.start();
        hiloPersona3.start();
    }
}