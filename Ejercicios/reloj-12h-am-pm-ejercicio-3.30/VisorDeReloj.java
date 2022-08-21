
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
        horas = new VisorDeNumeros(24);
        minutos = new VisorDeNumeros(60);
        actualizarVisor();
    }
    
    public void ticTac()
    {
        minutos.incrementar();
        
        if (minutos.getValor() == 0) {
//            horasTmp = horas.getValor();
            horas.incrementar();            
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
        if (Integer.parseInt(horas.getValorDelVisor()) >= 0 && Integer.parseInt(horas.getValorDelVisor()) <= 12)
            cadVisor = (Integer.parseInt(horas.getValorDelVisor()) % 13) + ":" + minutos.getValorDelVisor() + " AM";
         else 
            cadVisor = (Integer.parseInt(horas.getValorDelVisor()) % 13) + ":" + minutos.getValorDelVisor() + " PM";
    }
}
