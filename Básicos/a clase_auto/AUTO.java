public class AUTO {

  private String modelo;
  private String marca;
  private String color;
  private int velocidad_marcha;
  private boolean encendido;
  private boolean luces_bajas;
  private boolean luces_altas;
  private int velocidad_maxima;
  private int velocidad;

  // Constructor
  public AUTO(String modelo, String marca, String color) {
    this.modelo = modelo; // Inicializa el atributo 'modelo' con el valor pasado como parámetro.
    this.marca = marca; // Inicializa el atributo 'marca' con el valor pasado como parámetro.
    this.color = color; // Inicializa el atributo 'color' con el valor pasado como parámetro.
    velocidad_marcha = 1; // Inicializa la velocidad de marcha a 1.
    encendido = false; // Inicializa el estado del motor como apagado.
    luces_bajas = false; // Inicializa las luces bajas como apagadas.
    luces_altas = false; // Inicializa las luces altas como apagadas.
    velocidad_maxima = 0; // Inicializa la velocidad máxima a 0.
    velocidad = 0;
  }

  // Métodos de consulta y modificación

  public String getModelo() {
    return modelo; // Devuelve el valor actual del atributo 'modelo'.
  }

  public String getMarca() {
    return marca; // Devuelve el valor actual del atributo 'marca'.
  }

  public String getColor() {
    return color; // Devuelve el valor actual del atributo 'color'.
  }

  public void setVelocidadMaxima(int setvelocidadMaxima) {
    this.velocidad_maxima = setvelocidadMaxima; // Establece la velocidad máxima con el valor pasado como parámetro.
  }

  public void encenderMotor() {
    if (encendido) {
      System.out.println("El motor ya está encendido");
    } else {
      encendido = true; // Enciende el motor (establece 'encendido' en true) si no estaba encendido previamente.
      System.out.println("Motor encendido");
    }
  }

  public void apagarMotor() {
    if (encendido) {
      if (velocidad_marcha != 0 || luces_bajas || luces_altas) {
        System.out.println(
          "No se puede apagar el motor mientras la velocidad no sea 0 o las luces estén encendidas."
        );
      } else {
        encendido = false; // Apaga el motor (establece 'encendido' en false) si ciertas condiciones se cumplen.
        System.out.println("Motor apagado");
      }
    } else {
      System.out.println("El motor ya está apagado");
    }
  }

  public void encenderLucesBajas() {
    luces_altas = false;
    luces_altas = true;
    System.out.println("Luces bajas encendidas.");
  }

  public void encenderLucesAltas() {
    luces_altas = true;
    luces_altas = false;
    System.out.println("Luces altas encendidas.");
  }

  public void apagarLuces() {
    if (luces_altas == false && luces_bajas == false) {
      System.out.println("Las luces ya están apagadas!");
    } else {
      luces_altas = false;
      luces_bajas = false;
      System.out.println("Luces apagadas.");
    }
  }

  /*/
  Controlar:
  • el auto debe estar encendido
  • no puede pasar la velocidad_maxima
  • si baja la velocidad, la velocidad mínima es cero.
*/

  public void cambiarVelocidad(int nuevaVelocidad) {
    if (encendido) {
      if (nuevaVelocidad <= velocidad_maxima && nuevaVelocidad >= 0) {
        System.out.println(
          "La velocidad actual es de: " +
          velocidad_marcha +
          " km/h. La nueva velocidad será de: " +
          nuevaVelocidad +
          " km/h."
        );

        velocidad = nuevaVelocidad; // Actualiza la velocidad  con la nueva velocidad.
      } else {
        System.out.println(
          "• La nueva velocidad no puede superar la velocidad máxima o ser negativa. \n la velocidad maxima actual es de: " +
          velocidad_maxima
        );
      }
    } else {
      System.out.println(
        "• El auto debe estar encendido para cambiar la velocidad."
      );
    }
  }

  /*/
Cambiar la velocidad de marcha
*/

  public void setVelocidadMarcha(int setvelocidad_marcha) {
    if (setvelocidad_marcha >= 0 && setvelocidad_marcha <= 6) {
      velocidad_marcha = setvelocidad_marcha;
    }
  }

  /*/
  Frenar: debe poner la velocidad de marcha en cero
*/
  public void Frenar() {
    if (velocidad_marcha == 0) {
      velocidad = 0;
      System.out.println("Está frenando, pronto la velocidad será 0.");
    } else {
      System.out.println("Debe poner la velocidad de marcha en cero");
    }
  }

  /*/
  9. informeAuto: debe informar el estado general del auto diciendo:
o Si el auto esta apagado, debe informar: “el auto se encuentra apagado” y si
las luces están encendidas, el estado de las luces. “las luces altas/bajas están
encendidas”
o Si el auto esta encuentra encendido: debe informar
▪ La velocidad de marcha
▪ Las luces que se encuentran encendidas: altas, bajas o ningunas
▪ La velocidad máxima del auto 
*/
  public void informeAuto() {
    if (!encendido) { // Si el auto está apagado
      System.out.println("El auto se encuentra apagado.");
      if (luces_altas) {
        System.out.println("Las luces altas están encendidas.");
      } else if (luces_bajas) {
        System.out.println("Las luces bajas están encendidas.");
      } else {
        System.out.println("No hay luces encendidas.");
      }
    } else { // Si el auto está encendido
      System.out.println("El auto está encendido.");
      System.out.println("Velocidad de marcha: " + velocidad_marcha);
      if (luces_altas) {
        System.out.println("Las luces altas están encendidas.");
      } else if (luces_bajas) {
        System.out.println("Las luces bajas están encendidas.");
      } else {
        System.out.println("No hay luces encendidas.");
      }
      System.out.println(
        "Velocidad máxima del auto: " + velocidad_maxima + " km/h."
      );
    }
  }
}
