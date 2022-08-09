
/**
** Muestra un par de d�gitos que pueden ser horas o minutos.-
** Puede mostrar valores desde cero hasta determinado numero. Se puede especificar un l�mite
** al cerar el visor. El rango va de cero (inclusive) hasta el l�mite -1
** @author Michael K�lling and David J. Barnes
** 
** ali.cruz@me.com - 31/07/2022
 */
public class VisorDeNumeros
{
    // instance variables - replace the example below with your own
    private int limite; // Valor m�ximo horas y minutos
    private int valor;  // Aloja la hora o minuto actual    
    
    /**
     * Constructor for objects of class VisorDeNumeros
     * inicializo horas y minutos a cero.
     */
    public VisorDeNumeros(int limiteMaximo)
    {
        limite = limiteMaximo;
        valor = 0;        
        
    }
    
    
    /*
     * Obtengo el valor del visor horas / minutos.
    */
    public int getValor() {
        return valor;
    }
    
    // Asigna el nuevo valor especificado. Si es menor a cero o pasa del l�mite, no hace nada.
    public void setValor(int nuevoValor) {
        if ((nuevoValor >= 0) && (nuevoValor < limite))
            valor = nuevoValor;        
    }
    
       // Devuelve el numero actual del visor, como una cadena de dos d�gitos. Si es un valor menor a 10, se completa con un cero.
    public String getValorDelVisor() {
        if (valor < 10) {
            return "0" + valor;
        } else {
            return valor + "";
        }
    }    
         
    // Incrementa el valor del visor en uno, lo vuelve a cero si se alcanza el l�mite
    public void incrementar() {
        valor = ++valor % limite; 
    }   


}
