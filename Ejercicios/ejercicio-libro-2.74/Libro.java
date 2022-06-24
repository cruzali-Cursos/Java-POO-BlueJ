
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro
{
    // instance variables - replace the example below with your own
    private String autor;
    private String titulo;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String autorDelLibro, String tituloDelLibro)
    {
        autor = autorDelLibro;
        titulo = tituloDelLibro;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }

  
}
