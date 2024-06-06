public class Prueba {
	
	public static void main(String[] args) {
        // Crear una instancia de Agenda
        Agenda agenda = new Agenda("Agenda de Prueba");

        // Crear 4 instancias de la clase Contactos y agregarlas a la Agenda
        Contactos c1 = new Contactos("Juan Prueba1", "Santa Fe", "25 de mayo 1111", "0341", "111111");
        Contactos c2 = new Contactos("María Prueba2", "Rosario", "San Juan 123", "0341", "222222");
        Contactos c3 = new Contactos("Pedro Prueba3", "Buenos Aires", "Av. Corrientes 456", "011", "333333");
        Contactos c4 = new Contactos("Ana Prueba4", "Córdoba", "Calle 7 789", "0351", "444444");

        agenda.agregarContacto(c1);
        agenda.agregarContacto(c2);
        agenda.agregarContacto(c3);
        agenda.agregarContacto(c4);

        // Crear 4 instancias de la clase Nota y asignar un contacto diferente a cada nota
        Nota nota1 = new Nota("Título Nota 1", "Texto Nota 1", 7, 5, c1);
        Nota nota2 = new Nota("Título Nota 2", "Texto Nota 2", 8, 10, c2);
        Nota nota3 = new Nota("Título Nota 3", "Texto Nota 3", 6, 3, c3);
        Nota nota4 = new Nota("Título Nota 4", "Texto Nota 4", 11, 20, c4);

        // Agregar las notas a la Agenda
        agenda.agregarNota(nota1);
        agenda.agregarNota(nota2);
        agenda.agregarNota(nota3);
        agenda.agregarNota(nota4);

        // Listar las notas de la Agenda
        agenda.listarNotas();
    }
}