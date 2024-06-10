public class Factura {

  private int numeroFactura;
  private double importe;
  private String nombreCliente;

  public Factura(int numeroFactura, double importe, String nombreCliente) {
    this.numeroFactura = numeroFactura;
    this.importe = importe;
    this.nombreCliente = nombreCliente;
  }

  // Getters
  public int getNumeroFactura() {
    return numeroFactura;
  }

  public double getImporte() {
    return importe;
  }

  public String getNombreCliente() {
    return nombreCliente;
  }

  // Setters
  public void setNumeroFactura(int numeroFactura) {
    this.numeroFactura = numeroFactura;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  public void setNombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;
  }

  public double calcularNeto(int tipoPago) {
    double descuento = calcularDescuento(tipoPago);

    if (descuento == -1) {
      return -1; // Tipo de pago incorrecto
    }

    double neto = importe * (1 - descuento);
    return neto;
  }

  private double calcularDescuento(int tipoPago) {
    switch (tipoPago) {
      case 0: // Contado
        return 0.10; // 10% de descuento
      case 1: // Débito
        return 0.05; // 5% de descuento
      case 2: // Crédito
        return 0.0; // Sin descuento
      case 3: // Billetera virtual
        return 0.30; // 30% de descuento
      default:
        return -1; // Tipo de pago incorrecto
    }
  }
}
