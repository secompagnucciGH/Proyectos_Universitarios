package model;


/**
1.1 Clase abstracta Persona
● Atributos:
○ nombre (String)
○ email (String)
● Métodos:
○ Constructor para inicializar nombre y email.
○ Getters para nombre y email.
○ Método abstracto mostrarInfo (sin implementación).
 */
public abstract class Persona
{
    private String nombre;
    private String email;

    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // constructor adicional
    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public abstract void mostrarInfo();

}
