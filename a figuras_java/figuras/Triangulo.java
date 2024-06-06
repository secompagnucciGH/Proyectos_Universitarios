import java.awt.*;

/**
 * Un triángulo que puede ser manipulado y que se dibuja en un lienzo.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 *
 * Traductores: Jose Cardilli y Mario Finos
*/

public class Triangulo
{
    private int alto;
    private int ancho;
    private int posicionX;
    private int posicionY;
    private String color;
    private boolean esVisible;

    /**
     * Crear un nuevo triángulo en la posición por defecto con el color por defecto.
     */
    public Triangulo()
    {
        alto = 30;
        ancho = 40;
        posicionX = 50;
        posicionY = 15;
        color = "verde";
        esVisible = false;
    }

    /**
     * Hacer este triángulo visible. Si ya era visible, no hacer nada.
     */
    public void volverVisible()
    {
        esVisible = true;
        dibujar();
    }
    
    /**
     * Hacer este triángulo invisible. Si ya era invisible, no haga nada.
     */
    public void volverInvisible()
    {
        erase();
        esVisible = false;
    }
    
    /**
     * Mover el triángulo unos pocos píxeles a la derecha.
     */
    public void moverDerecha()
    {
        moverHorizontal(20);
    }

    /**
     * Mover el triángulo unos pocos píxeles a la izquierda.
     */
    public void moverIzquierda()
    {
        moverHorizontal(-20);
    }

    /**
     * Mover el triángulo unos pocos píxeles hacia arriba.
     */
    public void moverArriba()
    {
        moverVertical(-20);
    }

    /**
     * Mover el triángulo unos pocos píxeles hacia abajo.
     */
    public void moverAbajo()
    {
        moverVertical(20);
    }

    /**
     * Mover el triángulo horizontalmente tantos píxeles como indica "distancia".
     */
    public void moverHorizontal(int distancia)
    {
        erase();
        posicionX += distancia;
        dibujar();
    }

    /**
     * Mover el triángulo verticalmente tantos píxeles como indica "distancia".
     */
    public void moverVertical(int distancia)
    {
        erase();
        posicionY += distancia;
        dibujar();
    }

    /**
     * Mover lentamente el triángulo horizontalmente tantos píxeles como indica "distancia".
     */
    public void moverLentoHorizontal(int distancia)
    {
        int delta;

        if(distancia < 0) 
        {
            delta = -1;
            distancia = -distancia;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distancia; i++)
        {
            posicionX += delta;
            dibujar();
        }
    }

    /**
     * Mover lentamente el triángulo verticalmente tantos píxeles como indica "distancia".
     */
    public void moverLentoVertical(int distancia)
    {
        int delta;

        if(distancia < 0) 
        {
            delta = -1;
            distancia = -distancia;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distancia; i++)
        {
            posicionY += delta;
            dibujar();
        }
    }

    /**
     * Cambiar el tamaño al nuevo tamaño (en píxeles). El tamaño debe ser> = 0.
     */
    public void cambiarTamanio(int nuevoAlto, int nuevoAncho)
    {
        erase();
        alto = nuevoAlto;
        ancho = nuevoAncho;
        dibujar();
    }

    /**
     * Cambiar el color. Los colores validos son "rojo", "amarillo", "azul", "verde",
     * "celeste" and "negro".
     */
    public void cambiarColor(String nuevoColor)
    {
        color = nuevoColor;
        dibujar();
    }

    /**
     * Dibujar el triángulo con las especificaciones actuales en pantalla.
     */
    private void dibujar()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { posicionX, posicionX + (ancho/2), posicionX - (ancho/2) };
            int[] ypoints = { posicionY, posicionY + alto, posicionY + alto };
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }

    /**
     * Borrar el triángulo en la pantalla.
     */
    private void erase()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
