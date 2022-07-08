
/**
 * Write a description of class Calentador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calentador
{
    // instance variables - replace the example below with your own
    private int temperatura;
    private int min;
    private int max;
    private int incremento;

    /**
     * Constructor for objects of class Calentador
     */
    public Calentador(int miMin, int miMax)
    {
        temperatura = 15;
        // initialise instance variables
        min = miMin;
        max = miMax;
        incremento = 5;
    }
    
    public void calentar()
    {
        if ((temperatura + incremento) > max) {
            System.out.println("No se puede subir a mas de " + max);
        } else {
            temperatura += incremento;
            System.out.println("\nSube temperatura: " + temperatura);
        }
        
    }
    
    public void enfriar()
    {
        if ((temperatura - incremento) < min) {
            System.out.println("No se puede bajar a menos de " + min);
        } else {
            temperatura -= incremento;
            System.out.println("\nBaja temperatura: " + temperatura);
        }
        
    }
    
    public int getTemperatura()
    {
        return temperatura;
    }
    
    public void setIncremento(int miIncremento)
    {
        if (miIncremento <= 0) {
            System.out.println("\nSolo se aceptan valores mayores a 0");
        } else {
            incremento = miIncremento;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}
