/*
** 3°) Crear la clase Remito (número de remito y arrayList<Renglon>)
El constructor debe permitir crear una instancia de la misma recibiendo el dato “números” de remito por parámetros. 

*/

import java.util.ArrayList;

public class Remito {
    private int numeroRemito;
    private ArrayList<Renglon> listasRenglon;

    public Remito(int numeroRemito) {
        this.numeroRemito = numeroRemito;
        this.listasRenglon = new ArrayList<>(); // Inicializa la lista aquí para evitar el NULL POINTER EXCEP.
    }

    public void AddRenglon(Renglon listarRenglon) {
        this.listasRenglon.add(listarRenglon);
    }

    public void setNumeroRemito(int numeroRemito) {
        this.numeroRemito = numeroRemito;
    }

    public void ListarRemito() {
        double TotalRemito = 0;
        for (Renglon Renglon : listasRenglon) { // aca se determina como se llama el objeto de cada una de las listas,
                                                // por ejemplo, Renglon.
            System.out.println("NUMERO DE REMITO : " + numeroRemito);
            Mercaderia articulo = Renglon.getMercaderia();
            System.out.println("Articulo : " + articulo.getNombre());
            System.out.println("Cantidad : " + Renglon.getCantidad());
            System.out.println("Precio : " + articulo.getPrecio_unit());
            System.out.println("Importe TOTAL : " + articulo.getPrecio_unit() * Renglon.getCantidad());
            TotalRemito += (articulo.getPrecio_unit() * Renglon.getCantidad());
        }

        System.out.println("IMPORTE TOTAL DEL REMITO : " + TotalRemito);
    }

    public int getNumeroRemito() {
        return numeroRemito;
    }
}
