import java.util.*;

/*
 * Clase: Articulo
• EL constructor debe recibir por parámetro, los valores de
todos sus atributos.
• Realizar los métodos get y set para cada campo (nombre y
precio_unit e iva).
 El campo iva podrá tomar valor 10.5 ó 21.
Si el dato remitido no es ninguno de los dos, deberá crear el
objeto con el valor 21. 
*/
public class Articulos {
    private String nombre;
    private double precio_unit;
    private double iva;

    public Articulos(String nombre, double precio_unit, double iva) {
        if (iva != 10.5 && iva != 21) {
            this.iva = 21;
        } else {
            this.iva = iva;
        }

        this.nombre = nombre;
        this.precio_unit = precio_unit;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecioUnit() {
        return this.precio_unit;
    }
    
    public double getIva() {
        return this.iva;
    }
    }




