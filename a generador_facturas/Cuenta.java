public class Cuenta {

  private int num_cuenta;
  private String nom_cliente;
  private double saldo;
  private int cant_mov = 0;
  private double max_neg;

  public Cuenta(int num_cuenta, String nom_cliente, double saldo) {
    this.num_cuenta = num_cuenta;
    this.nom_cliente = nom_cliente;
    this.saldo = saldo;
  }

  // Métodos de consulta get

  public int getNumeroCuenta() {
    return num_cuenta;
  }

  public String getNombreCliente() {
    return nom_cliente;
  }

  public double getSaldo() {
    return saldo;
  }

  public int getCantidadMovimientos() {
    return cant_mov;
  }

  public double getMaximoNeg() {
    return max_neg;
  }

  // Métodos de modificación set

  public void setNumeroCuenta(int numeroCuenta) {
    this.num_cuenta = numeroCuenta;
  }

  public void setNombreCliente(String nombreCliente) {
    this.nom_cliente = nombreCliente;
  }

  public void setMaximoNeg(double maximoNeg) {
    this.max_neg = maximoNeg;
  }

  public boolean depositar(double valor_deposito) {
    if (valor_deposito > 0) {
      this.saldo += valor_deposito;
      this.cant_mov++;
      return true;
    } else {
      return false;
    }
  }

  public void retirar(double valor_retiro) {
    if (validar_retiro(valor_retiro)) {
      this.saldo -= valor_retiro;
      this.cant_mov++;
      System.out.println("Retiro Exitoso, su nuevo saldo es de: " + this.saldo);
    } else {
      System.out.println("No se puede retirar dinero");
      System.out.println("Fondos insuficientes.");
      System.out.println("Máximo a retirar: $" + this.saldo);
    }
  }

  private boolean validar_retiro(double valor_ret) {
    return valor_ret > 0 && (this.saldo - valor_ret) >= this.max_neg;
  }
}