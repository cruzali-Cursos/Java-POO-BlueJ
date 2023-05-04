/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subasta;

/**
 *
 * @author userone
 */
public class Persona {
    
        // instance variables - replace the example below with your own
    private String nombreOfertante;

    /**
     * Crea objeto Persona 
     * @param nombreOfertante Una nueva persona que oferta.
     */
    public Persona(String nombreOfertante)
    {
        // initialise instance variables
        this.nombreOfertante = nombreOfertante;
        System.out.println("Constructor Persona: nombreOfertante: " + nombreOfertante);
    }
    
    public String getNombrePersonaOfertante()
    {
        return nombreOfertante;
    }
    
    
}
