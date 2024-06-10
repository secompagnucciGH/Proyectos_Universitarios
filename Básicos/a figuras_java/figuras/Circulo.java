import java.awt.*;
import java.awt.geom.*;

/**
 * Un c�rculo que puede ser manipulado y que se dibuja en un lienzo.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 *
 * Traductores: Jose Cardilli y Mario Finos
*/

public class Circulo
{
    private int diametro;
    private int posicionX;
    private int posicionY;
    private String color;
    private boolean esVisible;
    
    /**
     *  Crear un nuevo c�rculo en la posici�n por defecto con el color por defecto.
     */
    public Circulo()
    {
        diametro = 30;
        posicionX = 20;
        posicionY = 60;
        color = "azul";
        esVisible = false;
    }

    /**
     * Hacer este c�rculo visible. Si ya era visible, no hacer nada.
     */
    public void volverVisible()
    {
        esVisible = true;
        dibujar();
    }
    
    /**
     * Hacer este c�rculo invisible. Si ya era invisible, no haga nada.
     */
    public void volverInvisible()
    {
        erase();
        esVisible = false;
    }
    
    /**
     * Mover el c�rculo unos pocos p�xeles a la derecha.
     */
    public void moverDerecha()
    {
        moverHorizontal(20);
    }

    /**
     * Mover el c�rculo unos pocos p�xeles a la izquierda.
     */
    public void moverIzquierda()
    {
        moverHorizontal(-20);
    }

    /**
     * Mover el c�rculo unos pocos p�xeles hacia arriba.
     */
    public void moverArriba()
    {
        moverVertical(-20);
    }

    /**
     * Mover el c�rculo unos pocos p�xeles hacia abajo.
     */
    public void moverAbajo()
    {
        moverVertical(20);
    }

    /**
     * Mover el c�rculo horizontalmente tantos p�xeles como indica "distancia".
     */
    public void moverHorizontal(int distancia)
    {
        erase();
        posicionX += distancia;
        dibujar();
    }

    /**
     * Mover el c�rculo verticalmente tantos p�xeles como indica "distancia".
     */
    public void moverVertical(int distancia)
    {
        erase();
        posicionY += distancia;
        dibujar();
    }

    /**
     * Mover lentamente el c�rculo horizontalmente tantos p�xeles como indica "distancia".
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
     * Mover lentamente el c�rculo verticalmente tantos p�xeles como indica "distancia".
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
     * Cambiar el tama�o al nuevo tama�o (en p�xeles). El tama�o debe ser> = 0.
     */
    public void cambiarTamanio(int nuevoDiametro)
    {
        erase();
        diametro = nuevoDiametro;
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
     * Dibujar el c�rculo con las especificaciones actuales en pantalla.
     */
    private void dibujar()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(posicionX, posicionY, 
                                                          diametro, diametro));
            canvas.wait(10);
        }
    }

    /**
     * Borrar el c�rculo en la pantalla.
     */
    private void erase()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
