
/**
 * Write a description of class VisorDeReloj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VisorDeReloj
{
    // instance variables - replace the example below with your own
    private VisorDeNumeros horas;
    private VisorDeNumeros minutos;
    private String cadVisor;

    

    /**
     * Constructor for objects of class VisorDeReloj
     */
    public VisorDeReloj()
    {
        horas = new VisorDeNumeros(13);
        minutos = new VisorDeNumeros(60);
        // Inicializo las horas en 1 para mostrar la hora en 01 al inicio en cadVisor
        horas.setValor(1);
        actualizarVisor();
    }
    
    public void ticTac()
    {
        minutos.incrementar();
        
        if (minutos.getValor() == 0) {
            horas.incrementar();
            if (horas.getValor() == 0) {
                horas.setValor(1);
            }
            
        }
        actualizarVisor();
    }
    
    
    public void ponerEnHora(int hora, int minuto) {
        horas.setValor(hora);
        minutos.setValor(minuto);
        actualizarVisor();
    }
    
    public String getHora()
    {
        return cadVisor;
    }
    
    public void actualizarVisor(){
        if (Integer.parseInt(horas.getValorDelVisor()) <= 12)
            cadVisor = horas.getValorDelVisor() + ":" + minutos.getValorDelVisor();
        
    }        
}
