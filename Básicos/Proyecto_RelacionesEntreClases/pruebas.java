
public class pruebas
{
    public pruebas () {
        
        Articulos articulo1 = new Articulos("Lapiz", 100, 10.5);
        Detalles detalle1 = new Detalles(articulo1,10);
        
        Facturas factura1 = new Facturas(10);
        
        factura1.agregarDetalles(detalle1);
        
        factura1.listarFactura();
    
    }
    
}
