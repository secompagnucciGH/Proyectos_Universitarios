/**
 * Esta clase representa un cuadro simple. Usted puede dibujar el cuadro usando
 * el metodo dibujar. Pero atento, hay mas: como se trata de un cuadro electronico, el
 * puede ser cambiado. Usted puede cambiar el visor a blano y negro y volver a ponerlo en
 * colores (solamente despues que el fue dibujado, por supuesto).
 *
 * Esta clase fue escrita como un ejemplo sencillo para enseñar Java con BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 *
 * Traductores: Jose Cardilli y Mario Finos
*/

public class Cuadro
{
    private Cuadrado pared;
    private Cuadrado ventana;
    private Triangulo techo;
    private Circulo sol;

    /**
     * Constructor de objetos de la clase Cuadro
     */
    public Cuadro()
    {
        // no hace nada... las variables de la instancia son automaticamente puestas en valor nulo
    }

    /**
     * Dibujar este cuadro.
     */
    public void dibujar()
    {
        pared = new Cuadrado();
        pared.moverVertical(80);
        pared.cambiarTamanio(100);
        pared.volverVisible();
        
        ventana = new Cuadrado();
        ventana.cambiarColor("negro");
        ventana.moverHorizontal(20);
        ventana.moverVertical(100);
        ventana.volverVisible();

        techo = new Triangulo();  
        techo.cambiarTamanio(50, 140);
        techo.moverHorizontal(60);
        techo.moverVertical(70);
        techo.volverVisible();

        sol = new Circulo();
        sol.cambiarColor("amarillo");
        sol.moverHorizontal(180);
        sol.moverVertical(-10);
        sol.cambiarTamanio(60);
        sol.moverLentoVertical(100);
        sol.volverVisible();
        
        
    }

    /**
     * Cambiar este cuadro a blanco y negro en el visor
     */
    public void ponerBlancoYNegro()
    {
        if(pared != null)   // solamente es pintado si existe...
        {
            pared.cambiarColor("negro");
            ventana.cambiarColor("blanco");
            techo.cambiarColor("negro");
            sol.cambiarColor("negro");
        }
    }

    /**
     * Cambiar este cuadro a color en el visor
     */
    public void ponerColor()
    {
        if(pared != null)   // solamente es pintado si existe...
        {
            pared.cambiarColor("rojo");
            ventana.cambiarColor("negro");
            techo.cambiarColor("verde");
            sol.cambiarColor("amarillo");
        }
    }
}
