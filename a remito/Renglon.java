
/**
 * 2°) Crear la clase Renglón (Contiene un dato tipo Mercaderia y cantidad)
 * El constructor debe permitir crear una instancia recibiendo los datos por
 * parámetros.
 * getters y setters
 */
public class Renglon {
    private Mercaderia mercaderia;
    private int cantidad;

    public Renglon(Mercaderia nuevaMercaderia, int cantidadMercaderia) {
        this.mercaderia = nuevaMercaderia;
        this.cantidad = cantidadMercaderia;
    }

    public Mercaderia getMercaderia() {
        return mercaderia;
    }

    public void setMercaderia(Mercaderia mercaderia) {
        this.mercaderia = mercaderia;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
