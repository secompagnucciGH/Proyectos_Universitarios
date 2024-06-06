
/**
2°) Crear la clase Renglón (Contiene un dato tipo Articulo y cantidad)
El constructor debe permitir crear una instancia recibiendo los datos por
parámetros (artículo, cantidad).
La cantidad de artículos no debe superar al stock existente.
Ejemplo:
- si la cantidad del remito es de 7 artículos, y el stock es de 10 y, entonces
se pone como cantidad 7 y se actualiza el sotck quedando en 3.
- si la cantidad del remito es de 14 artículos, y el stock es de 10, entonces
se pone como cantidad 4 y se actualiza el stock quedando en 0 (cero).
- Si la cantidad del remito es de 5 artículos, y el stock es de 0 y, entonces
se pone como cantidad 0 y el stock queda en cero.
Cada instancia que se genera debe actualizar el campo sotck. Para eso, cada vez
que se genera una instancia desde el constructor debe ejecutar el método
actualizaStock() de la clase Articulo, enviándole como parámetro la cantidad
correspondiente con signo negativo (Ej. Si la cantidad = 100, se enviará por
parámetro -100)
 */
public class Renglon
{
    private Articulo articulo;
    private int cantidad;
    
    /**
     * Constructor for objects of class Renglon
     */
    public Renglon(Articulo articulo, int cantidad) {
        int stockActual = articulo.getStock();
        this.articulo = articulo;
        if (this.articulo != null){
            if (cantidad < stockActual){
            this.cantidad = cantidad;
            this.articulo.actualizaStock(-this.cantidad);
            } else {
                System.out.println("No tiene suficiente STOCK para el articulo: " + articulo.getNombre());
                System.out.println("La cantidad posible es de :" + stockActual);
            }
        }
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public Articulo getArticulo(){
        return this.articulo;
    }


        
}

