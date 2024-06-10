
/**

 */
public class PRUEBA {
    public PRUEBA() {

    }

    public void NewPrueba() {
        System.out.println("PRUEBA ############################################//#endregion");

        Mercaderia merc1 = new Mercaderia("Papa", 200);
        Mercaderia merc2 = new Mercaderia("Arroz", 100);
        Mercaderia merc3 = new Mercaderia("Pepinillo", 250);

        Renglon reng1 = new Renglon(merc1, 2);
        Renglon reng2 = new Renglon(merc2, 1);
        Renglon reng3 = new Renglon(merc3, 2);

        Remito remit1 = new Remito(1);

        remit1.AddRenglon(reng1);
        remit1.AddRenglon(reng2);
        remit1.AddRenglon(reng3);

        remit1.ListarRemito();
    }
}
