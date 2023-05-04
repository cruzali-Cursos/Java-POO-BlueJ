
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
/**
* Una clase para mantener una lista arbitrariamente larga
* de notas.
* Las notas se numeran para referencia externa de un
usuario
* humano.
* En esta versión, la numeración de las notas comienzan
en 0.
* @author David J. Barnes and Michael Kölling.
* @version 2006.03.30
*/
public class Agenda
{
// Espacio para almacenar un número arbitrario de notas.
    private ArrayList<String> notas;

    /**
     * Realiza cualquier inicialización que se requiera para la agenda.
     * */
     public Agenda()
     {
         notas = new ArrayList<String>();
     }
/**
* Almacena una nota nueva en la agenda.
* @param nota La nota que se almacenará.
*/
public void guardarNota(String nota)
{
    notas.add(nota);
}
/**
* @return El número de notas que tiene actualmente
la agenda.
*/
public int numeroDeNotas()
{
    System.out.println("Total de notas: " + notas.size());
    return notas.size();
}
/**
* Muestra una nota.
* @param numeroDeNota El número de la nota que se
mostrará.
*/
public void mostrarNota(int numeroDeNota)
{
    if(numeroDeNota <= 0 || numeroDeNota > notas.size()) {
        // No es un número de nota válido, por lo tanto no se hace nada.
        System.out.println("Numero de nota no es valido. Indice: " + numeroDeNota);
    }
    else if(numeroDeNota <= notas.size() && numeroDeNota >= 1) {
        // Es un número válido de nota, por lo tanto se la puede mostrar.
        System.out.println("[" + numeroDeNota + "]" +notas.get(numeroDeNota-1));
    }
    else {
        // No es un número válido de nota, por lo tanto no se hace nada.
    }
}

public void eliminarNota(int numeroDeNota) 
{
    numeroDeNota -= 1;
    if (numeroDeNota < notas.size() && numeroDeNota >= 0)
    {
        notas.remove(numeroDeNota);
        System.out.println("Nota correctamente eliminada.");
    } else {
        System.out.println("Error al intentar eliminar una nota. Indice fuera de rango");
    }
}

public void mostrarTodasLasNotas()
{
    int totalNotas = notas.size();
    if (totalNotas >= 0)
    {
        int i = 0;
        int j = 1;
        while (i < totalNotas)
        {
            System.out.println("[" + j++ + "]: " + notas.get(i++));
        }
    } else {
        System.out.println("No hay notas que mostrar");
    }
}

public String BuscarCadena(String cadena) {
    for(String nota : notas) {
        if (nota.contains(cadena)) {
            System.out.println("Coincidencia: " + nota);
            //return nota;            
        }
    }    
    return null;
}

}


