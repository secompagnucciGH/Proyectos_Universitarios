public class Articulo {
    private String nombre;
    private Double precio_unit;
    private Double iva;

    public Articulo(String nombre, Double precio_unit, Double iva) {
        this.nombre = nombre;
        this.precio_unit = precio_unit;
        if (iva == 10.5 || iva == 21) {
            this.iva = iva;
        } else {
            this.iva = 21.0; // Valor por defecto si el IVA no es 10.5 ni 21
            System.out.println("ATENCIÓN, EL IVA AHORA FUE ASIGNADO AUTOMÁTICAMENTE EN 21.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio_unit() {
        return precio_unit;
    }

    public void setPrecio_unit(Double precio_unit) {
        this.precio_unit = precio_unit;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        if (iva == 10.5 || iva == 21) {
            this.iva = iva;
        } else {
            this.iva = 21.0;
            System.out.println("ATENCIÓN, EL IVA AHORA FUE ASIGNADO AUTOMÁTICAMENTE EN 21.");
        }
    }
}