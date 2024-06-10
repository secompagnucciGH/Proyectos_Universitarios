import java.awt.*;

/**
 * Un cuadrado que puede ser manipulado y que se dibuja en un lienzo.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 *
 * Traductores: Jose Cardilli y Mario Finos
*/

public class Cuadrado
{
    private int tamanio;
    private int posicionX;
    private int posicionY;
    private String color;
    private boolean esVisible;

    /**
     * Crear un nuevo cuadrado en la posición por defecto con el color por defecto.
     */
    public Cuadrado()
    {
        tamanio = 30;
        posicionX = 60;
        posicionY = 50;
        color = "rojo";
        esVisible = false;
    }

    /**
     * Hacer este cuadrado visible. Si ya era visible, no hacer nada.
     */
    public void volverVisible()
    {
        esVisible = true;
        dibujar();
    }
    
    /**
     * Hacer este cuadrado invisible. Si ya era invisible, no haga nada.
     */
    public void volverInvisible()
    {
        erase();
        esVisible = false;
    }
    
    /**
     * Mover el cuadrado unos pocos píxeles a la derecha.
     */
    public void moverDerecha()
    {
        moverHorizontal(20);
    }

    /**
     * Mover el cuadrado unos pocos píxeles a la izquierda.
     */
    public void moverIzquierda()
    {
        moverHorizontal(-20);
    }

    /**
     * Mover el cuadrado unos pocos píxeles hacia arriba.
     */
    public void moverArriba()
    {
        moverVertical(-20);
    }

    /**
     * Mover el cuadrado unos pocos píxeles hacia abajo.
     */
    public void moverAbajo()
    {
        moverVertical(20);
    }

    /**
     * Mover el cuadrado horizontalmente tantos píxeles como indica "distancia".
     */
    public void moverHorizontal(int distancia)
    {
        erase();
        posicionX += distancia;
        dibujar();
    }

    /**
     * Mover el cuadrado verticalmente tantos píxeles como indica "distancia".
     */
    public void moverVertical(int distancia)
    {
        erase();
        posicionY += distancia;
        dibujar();
    }

    /**
     * Mover lentamente el cuadrado horizontalmente tantos píxeles como indica "distancia".
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
     * Mover lentamente el cuadrado verticalmente tantos píxeles como indica "distancia".
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
    public void cambiarTamanio(int nuevoTamanio)
    {
        erase();
        tamanio = nuevoTamanio;
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
     * Dibujar el cuadrado con las especificaciones actuales en pantalla.
     */
    private void dibujar()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                        new Rectangle(posicionX, posicionY, tamanio, tamanio));
            canvas.wait(10);
        }
    }

    /**
     * Borrar el cuadrado en la pantalla.
     */
    private void erase()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
