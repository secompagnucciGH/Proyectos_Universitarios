public class Nota {
    private String titulo;
    private String texto;
    private int mes;
    private int dia;
    private Contactos contacto;

    public Nota(String titulo, String texto, int mes, int dia, Contactos contacto) {
        this.titulo = titulo;
        this.texto = texto;
        this.mes = mes;
        this.dia = dia;
        this.contacto = contacto;
    }

    public Contactos getContacto() {
        return contacto;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getTexto() {
        return texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
