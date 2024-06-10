
public class PruebaRemito
{
    
    /**
Crear 3 instancias de Articulo: 
iniciar el stock con 100 para todos los artículos.
• Crear 3 instancias de Renglón
• Crear una instancia de Remito
• Agregar los 3 renglones al remito (al ArrayList renglon)
• Ejecutar el método listarRemito()

 */
    public PruebaRemito()
    {
        Articulo art1 = new Articulo("Papa", 100, 20);
        Articulo art2 = new Articulo("Carne", 100, 15);
        Articulo art3 = new Articulo("Agua", 100, 10);

        Renglon ren1 = new Renglon(art1, 25);
        Renglon ren2 = new Renglon(art2, 10);
        Renglon ren3 = new Renglon(art3, 5);

        Remito remi1 = new Remito(1);

        remi1.addRenglon(ren1);
        remi1.addRenglon(ren2);
        remi1.addRenglon(ren3);
        
        remi1.listarRemito();

    }
}
