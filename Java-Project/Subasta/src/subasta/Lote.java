/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subasta;

import subasta.Oferta;
import subasta.Persona;

/**
 *
 * @author userone
 */
public class Lote {
    
        // La mayor oferta actual para este lote.
    private Oferta ofertaMaxima;
    private String descripcionLote;
    private int numeroLote;

    
    //Se omitieron los otros campos y el constructor
    /**
    * Intento de ofertar para este lote. Una oferta
    * exitosa debe tener un valor mayor que cualquier
    * 
    * * oferta existente.
    * @param oferta Una nueva oferta.
    * @return true si es exitosa, falso en caso contrario
    */

    public Lote(int numeroLote, String descripcion) 
    {
        this.numeroLote = numeroLote;
        this.descripcionLote = descripcion;
        System.out.println("Constructor Lote. numeroLote: " + numeroLote + " descripcion: " + descripcion);
    }
    
    public boolean ofertarPara(Oferta nuevaOferta)
    {
        //ofertas.add(nuevaOferta);
        System.out.println("ofertarPara() Valor: " + nuevaOferta.getValor());
        if((ofertaMaxima == null) || (nuevaOferta.getValor() > ofertaMaxima.getValor())) 
        {
            // Esta oferta es mejor que la oferta actual.
            ofertaMaxima = nuevaOferta;
            System.out.println("1. ofertaMaxima: " + ofertaMaxima.getValor() + " nuevaOferta: " + nuevaOferta.getValor());
            return true;
        }
        else {
            System.out.println("2. ofertaMaxima: " + ofertaMaxima.getValor() + " nuevaOferta: " + nuevaOferta.getValor());
            return false;
        }
    }
    
    public Oferta getOfertaMaxima()
    {
        //System.out.println("getOfertaMaxima() ofertaMaxima: " + ofertaMaxima);
        return ofertaMaxima;
    }
    
    public int getNumeroLote()
    {
        //System.out.println("getNumeroLote() numeroLote: " + numeroLote);
        return numeroLote;
    }
    
    public Persona getOfertante()
    {
        return ofertaMaxima.getPersonaOfertante();
    }
    
    //Se omitieron los otros métodos.
    
    
}
