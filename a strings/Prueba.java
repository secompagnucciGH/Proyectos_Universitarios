
public class Prueba {

    public static void Prueba() {
        llamarMetodo5("A12xv34c");
        llamarMetodo5("Aa1234");
        llamarMetodo5("123456");
        llamarMetodo5("345Xz*v");
        llamarMetodo5("123x5xJtm");

    }

    private static void llamarMetodo5(String str) {
        EjercicioString1 obEjercicioString1 = new EjercicioString1();
        obEjercicioString1.metodo5(str);
    }
}
