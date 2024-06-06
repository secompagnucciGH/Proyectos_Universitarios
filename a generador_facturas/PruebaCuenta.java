public class PruebaCuenta {
    public static void main(String[] args) {
        // 1. Crear una instancia de Cuenta con los valores especificados
        Cuenta cuentaP = new Cuenta(1, "Cuenta 1", 0);
        // 2. Mostrar los valores de los atributos de la cuenta por pantalla
        System.out.println("Número de Cuenta: " + cuentaP.getNumeroCuenta());
        System.out.println("Nombre del Cliente: " + cuentaP.getNombreCliente());
        System.out.println("Saldo: " + cuentaP.getSaldo());

        // 3. Depositar en la cuenta $500
        cuentaP.depositar(500);

        // 4. Mostrar el saldo y la cantidad de movimientos
        System.out.println(
                "Saldo: " + cuentaP.getSaldo() + " - Cantidad de movimientos: " + cuentaP.getCantidadMovimientos());

        // 5. Retirar de la cuenta $200
        cuentaP.retirar(200);

        // 6. Mostrar el saldo y la cantidad de movimientos
        System.out.println(
                "Saldo: " + cuentaP.getSaldo() + " - Cantidad de movimientos: " + cuentaP.getCantidadMovimientos());

        // 7. Retirar de la cuenta $400
        cuentaP.retirar(400);

        // 8. Mostrar el saldo y la cantidad de movimientos
        System.out.println(
                "Saldo: " + cuentaP.getSaldo() + " - Cantidad de movimientos: " + cuentaP.getCantidadMovimientos());

        // 9. Modificar el máximo negativo a -1000
        cuentaP.setMaximoNeg(-1000);

        // 10. Retirar de la cuenta $400 nuevamente
        cuentaP.retirar(400);

        // 11. Mostrar el saldo y la cantidad de movimientos
        System.out.println(
                "Saldo: " + cuentaP.getSaldo() + " - Cantidad de movimientos: " + cuentaP.getCantidadMovimientos());
    }
}
