import java.util.*;
/*Clase: Factura:
• EL constructor debe recibir por parámetro el número de
factura.
• Realizar los métodos get y set para el campo número de
factura.
• agregarDetalles(Detalles d): debe permitir agregar un
dato tipo detalle a la lista deta.
• listarFactura(): debe permitir listar por pantalla los datos
de la factura.
Mostrando todos los detalles asociados y el precio total de
la misma. Este precio se obtiene de la sumatoria de
multiplicar el Precio Unitario de cada articulo por la
cantidad.
Por cada artículo que se muestre en el detalle deberá informar
por pantalla el nombre del artículo, la cantidad, el precio
unitario y el precio total (precio unitario * cantidad)
 */
public class Facturas {
 private int numeroFactura;
 private ArrayList <Detalles> deta;
 
    public Facturas(int numeroFactura) {
        this.numeroFactura = numeroFactura;
        this.deta = new ArrayList<>();
    }
    
    public void agregarDetalles(Detalles d) {
        deta.add(d);
    }
    
    public void listarFactura() {
        for (Detalles detalle : deta) {
            System.out.println("*********************"+ " Factura Numero: " + this.numeroFactura + "***************");
            Articulos articulo = detalle.getArticulo(); // Accede al artículo asociado a este detalle
            System.out.println("**********************************************");
            System.out.println("NOMBRE ARTICULO: " + articulo.getNombre());
            System.out.println("PRECIO UNIDAD ARTICULO: " + articulo.getPrecioUnit());
            System.out.println("IVA: " + articulo.getIva());
            System.out.println("**********************************************");
        }
    }
}