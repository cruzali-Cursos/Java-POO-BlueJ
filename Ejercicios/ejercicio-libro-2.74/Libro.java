
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
    private int paginas;
    private String numeroDeReferencia;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String autorDelLibro, String tituloDelLibro, int paginasDelLibro, String numeroDeReferenciaDelLibro)
    {
        autor = autorDelLibro;
        titulo = tituloDelLibro;
        paginas = paginasDelLibro;
        numeroDeReferencia = numeroDeReferenciaDelLibro;
    }
    
    public void setNumeroDeReferencia(String ref)
    {
        numeroDeReferencia = ref;
    }
    
    public void getNumeroDeReferencia()
    {
        System.out.print("\nEl numero de referencia es: " + numeroDeReferencia);
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getPaginas()
    {
        return paginas;
    }

    public void imprimirAutor()
    {
        System.out.print("\n El autor es: " + autor);
    }
    
    public void imprimirLibro()
    {
        System.out.print("\n El titulo es: " + titulo);
    }
    
    public void imprimePaginas()
    {
        System.out.print("\n Numero de paginas: " + paginas);
    }
    
    public void imprimirDetalles()
    {
        System.out.print("\nDetalles del libro ::: \nAutor: " + autor + "\nTitulo: " + titulo + "\nPaginas: " + paginas);
    }
  
}
