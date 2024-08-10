package model;

import service.GestorLibrosImpl;
import service.GestorUsuariosImpl;

class test {
    public static void main(String[] args) {
        System.out.print("LIBRO FISICO 1 -----------------------------------------------------------------------------------");
        System.out.println("");

        // 1.4 Clase LibroFisico que hereda de Libro por constructor se le pasan los parametros para la creacion.

        Libro lib1 = new LibroFisico("TituloPrueba", "AutorPrueba", "ISBN123PRUEBA",10000);

        lib1.mostrarInfo();

        lib1.setDisponible("disponible");

        lib1.mostrarInfo();

        System.out.print("LIBRO DIGITAL 2 -----------------------------------------------------------------------------------");
        System.out.println("");


        Libro lib2 = new LibroDigital("TituloDIGITALPrueba", "AutorPrueba", "ISBN143214PRUEBA",230.00);

        lib2.mostrarInfo();

        lib2.setDisponible("disponible");

        lib2.mostrarInfo();

        System.out.print(" <<<<>>>> -------------------------------------------------------------------------------------");
        System.out.println("");

        System.out.print("USER ACCIONS ##################################################################################");
        System.out.println("");

        Usuario usr1 = new Usuario("UserDePrueba","email@deprueba",1);

        usr1.mostrarInfo();

        usr1.prestarLibro(lib1);

        usr1.getLibrosPrestados();

        // aca imprimimos la lista de libros prestados por pantalla.
        usr1.getLibrosPrestadosSout();

        System.out.print("USER ACCIONS ##################################################################################");
        System.out.println("");

        GestorUsuariosImpl gestorUsuarios = new GestorUsuariosImpl();
        // buscar id 1
        System.out.println("se espera null : --------------------------------------------------------------");
        gestorUsuarios.buscarUsuario(1);
        // add
        gestorUsuarios.agregarUsuario(usr1);
        System.out.println("hace find con el @ del usuario: -----------------------------------------------");
        gestorUsuarios.buscarUsuario(1);

        gestorUsuarios.eliminarUsuario(1);
        System.out.println("tiene que ser null tras la eliminacion:----------------------------------------");
                gestorUsuarios.buscarUsuario(1);

        System.out.println("---------------------------------------------------------------------");

        GestorLibrosImpl gestorLibros = new GestorLibrosImpl();

        Libro lib444 = new LibroFisico("TituloPrueba", "AutorPrueba", "444",10000);

        gestorLibros.agregarLibro(lib444);

        System.out.println("buscar libro 444.");
        gestorLibros.buscarLibro("444");
        System.out.println("buscar libro 555.");
        gestorLibros.buscarLibro("555");
    }
}
