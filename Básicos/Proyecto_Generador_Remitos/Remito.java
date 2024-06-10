import java.util.*;
/**
 3°) Crear la clase Remito (número de remito y arrayList<Renglon>)
El constructor debe permitir crear una instancia recibiendo el dato “número” de
remito por parámetros.
El método listarRemito() debe mostrar por pantalla el detalle del Remito de la
siguiente manera: 
Remito Número: 122234
Articulo Cantidad Precio Unitario Total
Manteca 2 $10 $20
Crema 1 $15 $15
Naranja 4 $ 5 $20
Cantidad de artículos: 7

Aclaración:
- un Remito puede tener relacionado muchos renglones.
- cada renglón, tiene asociado un objeto Articulo
- Cada instancia de Articulo tiene el nombre y precio unitario. Estos datos
deben cargarse por teclado y se debe validar que el precio se mayor a cero.
- El método addRenglon() de la clase Remito permite agregar una instancia de
Renglon a la lista
 */
public class Remito {
    private int nroRemito;
    private ArrayList<Renglon> renglones;

    public Remito(int nro){
        this.nroRemito = nro;
        this.renglones = new ArrayList<>();
    }

    public void addRenglon(Renglon renglon){
        if(renglon != null ){
            this.renglones.add(renglon);
            }
    }

    public void listarRemito(){
        int totalArticulos = 0;
        System.out.println("Remito Número: " + this.nroRemito );
        System.out.println("Articulo Cantidad Precio Unitario TOTAL");
        for(Renglon Renglon : renglones){
            
            Articulo articulo = Renglon.getArticulo();
            System.out.println(" " + Renglon.getArticulo().getNombre() + " \t " + Renglon.getCantidad() + " \t " + articulo.getPrecioUnitario() + " \t\t " + articulo.getPrecioUnitario() * Renglon.getCantidad() );
            //System.out.println("Cantidad: " + Renglon.getCantidad());
            //System.out.println("Precio Unitario: " + articulo.getPrecioUnitario());
            //System.out.println("Total: " + articulo.getPrecioUnitario() * Renglon.getCantidad() );
            totalArticulos += Renglon.getCantidad();
        }
        System.out.println("Cantidad total de articulos \t " + totalArticulos );
        
    }
}

