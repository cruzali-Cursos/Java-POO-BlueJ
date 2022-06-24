
public class Persona
{
    // instance variables - replace the example below with your own
    private int edad;
    private String nombre;

    /**
     * Constructor for objects of class Persona
     */
 
    public Persona(String nombre1, int edad1){
        nombre = nombre1;
        edad = edad1;
    }
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setNombre(String nombre1) {
        nombre = nombre1;
    }
    
    public void setEdad(int edad1) {
        edad = edad1;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void printDetails() {
        System.out.println();
        System.out.println("Detalles de la persona: ");
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
        System.out.println();
    }
}
