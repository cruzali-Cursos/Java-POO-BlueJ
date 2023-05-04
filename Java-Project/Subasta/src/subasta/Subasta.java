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
public class Subasta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Subasta1 subasta1 = new Subasta1();
        
        subasta1.ingresarLote("lote1");        
        subasta1.ingresarLote("lote2");
        subasta1.ingresarLote("lote3");
        subasta1.ingresarLote("lote4");
        
        Persona ali = new Persona("Ali");
        Persona sara = new Persona("Sara");
        Persona tania = new Persona("Tania");
        
        Oferta oferta1 = new Oferta(ali, 50);        
        Oferta oferta2 = new Oferta(tania, 60);        
        Oferta oferta3 = new Oferta(ali, 150);
        Oferta oferta4 = new Oferta(tania, 200);
        
        Lote lote1 = new Lote(1, "Lote1");
        Lote lote2 = new Lote(2, "Lote2");
        Lote lote3 = new Lote(3, "Lote3");
        Lote lote4 = new Lote(4, "Lote4");
        
        
        subasta1.mostrarLotes();
        
        Oferta ofertaGet = new Oferta(oferta2.getPersonaOfertante(), 999);
        ofertaGet.getPersonaOfertante();
        
        subasta1.ofertarPara(2, oferta3);
        
        
        subasta1.cerrarSubasta();
        
        
        
        
        
        
    }
    
}
