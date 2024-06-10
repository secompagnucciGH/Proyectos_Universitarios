import java.awt.*;

/**
 * Un tri�ngulo que puede ser manipulado y que se dibuja en un lienzo.
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
     * Crear un nuevo tri�ngulo en la posici�n por defecto con el color por defecto.
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
     * Hacer este tri�ngulo visible. Si ya era visible, no hacer nada.
     */
    public void volverVisible()
    {
        esVisible = true;
        dibujar();
    }
    
    /**
     * Hacer este tri�ngulo invisible. Si ya era invisible, no haga nada.
     */
    public void volverInvisible()
    {
        erase();
        esVisible = false;
    }
    
    /**
     * Mover el tri�ngulo unos pocos p�xeles a la derecha.
     */
    public void moverDerecha()
    {
        moverHorizontal(20);
    }

    /**
     * Mover el tri�ngulo unos pocos p�xeles a la izquierda.
     */
    public void moverIzquierda()
    {
        moverHorizontal(-20);
    }

    /**
     * Mover el tri�ngulo unos pocos p�xeles hacia arriba.
     */
    public void moverArriba()
    {
        moverVertical(-20);
    }

    /**
     * Mover el tri�ngulo unos pocos p�xeles hacia abajo.
     */
    public void moverAbajo()
    {
        moverVertical(20);
    }

    /**
     * Mover el tri�ngulo horizontalmente tantos p�xeles como indica "distancia".
     */
    public void moverHorizontal(int distancia)
    {
        erase();
        posicionX += distancia;
        dibujar();
    }

    /**
     * Mover el tri�ngulo verticalmente tantos p�xeles como indica "distancia".
     */
    public void moverVertical(int distancia)
    {
        erase();
        posicionY += distancia;
        dibujar();
    }

    /**
     * Mover lentamente el tri�ngulo horizontalmente tantos p�xeles como indica "distancia".
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
     * Mover lentamente el tri�ngulo verticalmente tantos p�xeles como indica "distancia".
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
     * Dibujar el tri�ngulo con las especificaciones actuales en pantalla.
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
     * Borrar el tri�ngulo en la pantalla.
     */
    private void erase()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
