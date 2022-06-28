
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

    /**
     * Constructor for objects of class Calentador
     */
    public Calentador()
    {
        temperatura = 15;
        // initialise instance variables
    }
    
    public void calentar()
    {
        //
        temperatura = temperatura + 5;
    }
    
    public void engriar()
    {
        //
        temperatura = temperatura - 5;
    }
    
    public int getTemperatura()
    {
        return temperatura;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}
