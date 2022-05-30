
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro
{
    // instance variables - replace the example below with your own
    private int x;
    private int edad = 0;
    private String nombre = "Perro";
    private float peso = 1.0f;
    
    
    public int edadHumana() {
        // La edad se multiplica por 7
        return edad * 7;        
    }
    
    public void alimentar (int tipoComida) {
        if (tipoComida == 0) {
            System.out.println("Perro comiendo carte");
        } else {
            System.out.println("Perro comiendo croquetas");
        }        
    }
    
    public String interactuar() {
        return "Guau";
    }
    
    public void imprimeInformacion() {
        System.out.println("Soy perro con edad " + edad + " años y me llamo " + nombre);
    }

    /**
     * Constructor for objects of class Perro
     */
    public Perro()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
