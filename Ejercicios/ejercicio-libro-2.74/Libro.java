
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
    private int prestado;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String autorDelLibro, String tituloDelLibro, int paginasDelLibro, String numeroDeReferenciaDelLibro)
    {
        autor = autorDelLibro;
        titulo = tituloDelLibro;
        paginas = paginasDelLibro;
        
        if (numeroDeReferenciaDelLibro.length() == 0)
            numeroDeReferencia = "";
        else 
            numeroDeReferencia = numeroDeReferenciaDelLibro;
    }
    
    public void prestar()
    {
        prestado = prestado + 1;
    }
    
    public int getPrestado()
    {
        return prestado;
    }
    
    public void setNumeroDeReferencia(String ref)
    {
        if (ref.length() >= 3) {
            numeroDeReferencia = ref;
        } else {
            System.out.print("\nEl numero de referencia proporcionado debe ser de 3 o mas digitos");
        }
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
        if (numeroDeReferencia.length() >= 3) {
            System.out.print("\nDetalles del libro ::: \nAutor: " + autor + "\nTitulo: " + titulo + "\nPaginas: " + paginas + "\nReferencia: " + numeroDeReferencia + "\nVeces prestado: " + prestado);
        } else {
            System.out.print("\nDetalles del libro ::: \nAutor: " + autor + "\nTitulo: " + titulo + "\nPaginas: " + paginas + "\nReferencia: ZZZ" + "\nVeces prestado: " + prestado);
        }
        
    }
  
}
