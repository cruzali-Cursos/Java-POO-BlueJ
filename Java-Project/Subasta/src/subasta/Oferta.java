/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subasta;

import subasta.Persona;

/**
 *
 * @author userone
 */
public class Oferta {
        // instance variables - replace the example below with your own
    private Persona personaOfertante;
    private long valorOferta;

    /**
     * Constructor for objects of class Oferta
     */
    public Oferta(Persona personaOfertante, long valorOferta)
    {
        this.personaOfertante = personaOfertante;
        this.valorOferta = valorOferta;
        System.out.println("Constructor Oferta. personaOfertante: " +personaOfertante.getNombrePersonaOfertante() + " valorOferta: " + valorOferta);
    }

    public long getValor() 
    {
        //System.out.println("getValor() valorOferta: " + valorOferta);
        return valorOferta;
    }
    
    public Persona getPersonaOfertante()
    {
        return personaOfertante;
    }
    
}
