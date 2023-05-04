/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subasta;

import java.util.ArrayList;

/**
* Un modelo simplificado de una subasta.
* La subasta mantiene una lista de lotes, de longitud
arbitraria.
* @author David J. Barnes and Michael Kölling
* @version 2006.03.30
*/

public class Subasta1 {
    
        // La lista de lotes de esta subasta.
    private ArrayList<Lote> lotes;
    // El número que se le dará al próximo lote que
    // ingrese a esta subasta.
    private int numeroDeLoteSiguiente;
    private ArrayList<Persona> personas;
    

    /**
    * Crea una nueva subasta.
    */
    public Subasta1()
    {
        this.lotes = new ArrayList<Lote>();
        this.numeroDeLoteSiguiente = 1;
        System.out.println("Subasta()");
    }
    /**
    * Ingresa un nuevo lote a la subasta.
    * @param descripcion La descripción del lote.
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
            System.out.println("Lote No. " + lote.getNumeroLote());// + " descripción: " + lote.descripcionLote);
    }
    /**
    * Ofertar para un lote.
    * Emite un mensaje que indica si la oferta es
    exitosa o no.
    * @param numeroDeLote El número de lote al que se
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
                System.out.println("La oferta para el lote número " + numeroDeLote + " resultó exitosa.");
            }
            else 
            {
                // Informa cuál es la mayor oferta
                Oferta ofertaMaxima = loteElegido.getOfertaMaxima();
                System.out.println("El lote número: " + numeroDeLote + " ya tiene una oferta de: " + ofertaMaxima.getValor());
            }
        }        
    }*/    
    
    public void ofertarPara(int numeroDeLote, Oferta oferta)
    {
        //personas.add(persona);
        
        Lote loteElegido = getLote(numeroDeLote);
        
        if(loteElegido != null) 
        {
            //boolean exito = loteElegido.ofertarPara(new Oferta(persona, valor));
            boolean exito = loteElegido.ofertarPara(oferta);
            if(exito) 
            {
                System.out.println("La oferta para el lote número " + numeroDeLote + " resultó exitosa.");
            }
            else 
            {
                // Informa cuál es la mayor oferta
                Oferta ofertaMaxima = loteElegido.getOfertaMaxima();
                System.out.println("El lote número: " + numeroDeLote + " ya tiene una oferta de: " + ofertaMaxima.getValor());
            }
        }        
    }
    
    
    /**
    * Devuelve el lote de un determinado número.
    Devuelve null
    * si no existe un lote con este número.
    * @param numeroDeLote El número del lote a
    retornar.
    */
    public Lote getLote(int numeroDeLote)
    {
        if((numeroDeLote >= 1) && (numeroDeLote < numeroDeLoteSiguiente)) 
        {
            // El número parece ser razonable.
            Lote loteElegido = lotes.get(numeroDeLote - 1);
            // Incluye un control confidencial para asegurar que
            // el lote es el correcto
            if(loteElegido.getNumeroLote() != numeroDeLote)
            {
                System.out.println("Error interno: se retornó el lote Nro. " + loteElegido.getNumeroLote() + " en lugar del Nro. " + numeroDeLote);
            }
            System.out.println("getLote()");
            return loteElegido;
        }
        else 
        {
            System.out.println("El lote número: " + numeroDeLote + " no existe.");
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
                //Persona persona1 = lote.getOfertante();
                if (oferta != null) 
                {
                    Persona persona2 = oferta.getPersonaOfertante();   
                    System.out.print(" - Ofertante: " + persona2.getNombrePersonaOfertante());                    
                    System.out.print(" - Valor Oferta: " + oferta.getValor() + " - Vendido");
                } else 
                {
                    System.out.println(" - No vendido");
                }
            }
        }
    }
    
    
}
