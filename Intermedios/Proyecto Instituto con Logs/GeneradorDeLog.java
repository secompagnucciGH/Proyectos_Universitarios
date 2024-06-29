
/**
 * Write a description of class GeneradorDeLog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneradorDeLog

{
    public GeneradorDeLog() {
        
    }
    
    public void agregarALog(ILogable i) {
        System.out.println(" Agrega un nuevo log ");
        System.out.println("Log - Informacion Inicial: " + i.getInfoInicial() + " - Evento: " +  i.getEventoLogable());
    }
}
