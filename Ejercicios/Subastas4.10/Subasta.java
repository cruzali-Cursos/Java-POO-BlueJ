import java.util.ArrayList;
/**
* Un modelo simplificado de una subasta.
* La subasta mantiene una lista de lotes, de longitud
arbitraria.
* @author David J. Barnes and Michael K�lling
* @version 2006.03.30
*/
public class Subasta 
{
    // La lista de lotes de esta subasta.
    private ArrayList<Lote> lotes;
    // El n�mero que se le dar� al pr�ximo lote que
    // ingrese a esta subasta.
    private int numeroDeLoteSiguiente;
    private ArrayList<Persona> personas;
    

    /**
    * Crea una nueva subasta.
    */
    public Subasta()
    {
        this.lotes = new ArrayList<Lote>();
        this.numeroDeLoteSiguiente = 1;
        System.out.println("Subasta()");
    }
    /**
    * Ingresa un nuevo lote a la subasta.
    * @param descripcion La descripci�n del lote.
    */
    public void ingresarLote(String descripcion)
    {
        lotes.add(new Lote(numeroDeLoteSiguiente, descripcion));
        numeroDeLoteSiguiente ++;
        System.out.println("ingresarLote()");
    }
    /**
    * Muestra la lista de todos los lotes de esta subasta.
    */
    public void mostrarLotes()
    {
        for(Lote lote : lotes)
            System.out.println("Lote No. " + lote.getNumeroLote());// + " descripci�n: " + lote.descripcionLote);
    }
    /**
    * Ofertar para un lote.
    * Emite un mensaje que indica si la oferta es
    exitosa o no.
    * @param numeroDeLote El n�mero de lote al que se
    oferta.
    * @param ofertante La persona que hace la
    oferta.
    * @param valor El valor de la oferta.
    */
    /**public void ofertarPara(int numeroDeLote, Persona persona, long valor)
    {
        //personas.add(persona);
        
        Lote loteElegido = getLote(numeroDeLote);
        if(loteElegido != null) 
        {
            Oferta oferta = new Oferta(persona, valor);
            //boolean exito = loteElegido.ofertarPara(new Oferta(persona, valor));
            boolean exito = loteElegido.ofertarPara(oferta);
            if(exito) 
            {
                System.out.println("La oferta para el lote n�mero " + numeroDeLote + " result� exitosa.");
            }
            else 
            {
                // Informa cu�l es la mayor oferta
                Oferta ofertaMaxima = loteElegido.getOfertaMaxima();
                System.out.println("El lote n�mero: " + numeroDeLote + " ya tiene una oferta de: " + ofertaMaxima.getValor());
            }
        }        
    }*/
    
    public void ofertarPara(int numeroDeLote, Oferta oferta)
    {
        //personas.add(persona);
        
        Lote loteElegido = getLote(numeroDeLote);
        if(loteElegido != null) 
        {
            boolean exito = loteElegido.ofertarPara(oferta);
            if(exito) 
            {
                System.out.println("La oferta para el lote n�mero " + numeroDeLote + " result� exitosa.");
            }
            else 
            {
                // Informa cu�l es la mayor oferta
                Oferta ofertaMaxima = loteElegido.getOfertaMaxima();
                System.out.println("El lote n�mero: " + numeroDeLote + " ya tiene una oferta de: " + ofertaMaxima.getValor());
            }
        }        
    }
    
    
    /**
    * Devuelve el lote de un determinado n�mero.
    Devuelve null
    * si no existe un lote con este n�mero.
    * @param numeroDeLote El n�mero del lote a
    retornar.
    */
    public Lote getLote(int numeroDeLote)
    {
        if((numeroDeLote >= 1) && (numeroDeLote < numeroDeLoteSiguiente)) 
        {
            // El n�mero parece ser razonable.
            Lote loteElegido = lotes.get(numeroDeLote - 1);
            // Incluye un control confidencial para asegurar que
            // el lote es el correcto
            if(loteElegido.getNumeroLote() != numeroDeLote)
            {
                System.out.println("Error interno: se retorn� el lote Nro. " + loteElegido.getNumeroLote() + " en lugar del Nro. " + numeroDeLote);
            }
            System.out.println("getLote()");
            return loteElegido;
        }
        else 
        {
            System.out.println("El lote n�mero: " + numeroDeLote + " no existe.");
            return null;
        }
    }
    
    
    public void cerrarSubasta()
    {
        System.out.println("cerrarSubasta()\n");
        
        for (Lote lote: lotes)
        {
            if (lote != null)
            {
                System.out.println("\nLote: " + lote.getNumeroLote());
                Oferta oferta = lote.getOfertaMaxima();
                
                if (oferta != null) 
                {
                    Persona persona2 = oferta.getPersonaOfertante();                
                    System.out.println(" - Ofertante: " + persona2.getNombrePersonaOfertante());
                    System.out.println(" - Valor Oferta: " + oferta.getValor() + " Vendido.");                    
                } else 
                {
                    System.out.println(" - No vendido");
                }                
            }
        }
    }
    
    public ArrayList getNoVendidos()
    {
        ArrayList<Lote> lotesNoVendidos = new ArrayList<Lote>();
        
        for(Lote lote : lotes)
        {
            if (lote != null) 
            {
                Oferta oferta = lote.getOfertaMaxima();
                if (oferta == null)
                {
                    lotesNoVendidos.add(lote);                    
                }
            }
        }
        
        
        for (Lote lote : lotesNoVendidos)
        {
            System.out.println("Lote " + lote.getNumeroLote() + " no vendido.");
        }
        
        return lotesNoVendidos;
        
    }
    
    public void deleteLote(int noLote)
    {
        if (noLote >= 1 && noLote <= lotes.size()) 
        {
            lotes.remove(noLote - 1);
            System.out.println("Lote numero " + noLote + " ah sido eliminado.");
        }
        
    }
    
    
    
}
