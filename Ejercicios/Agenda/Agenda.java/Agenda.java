
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
* En esta versi�n, la numeraci�n de las notas comienzan
en 0.
* @author David J. Barnes and Michael K�lling.
* @version 2006.03.30
*/
public class Agenda
{
// Espacio para almacenar un n�mero arbitrario de notas.
    private ArrayList<String> notas;
    /**
     * Realiza cualquier inicializaci�n que se requiera para la agenda.
     * */
     public Agenda()
{
notas = new ArrayList<String>();
}
/**
* Almacena una nota nueva en la agenda.
* @param nota La nota que se almacenar�.
*/
public void guardarNota(String nota)
{
notas.add(nota);
}
/**
* @return El n�mero de notas que tiene actualmente
la agenda.
*/
public int numeroDeNotas()
{
return notas.size();
}
/**
* Muestra una nota.
* @param numeroDeNota El n�mero de la nota que se
mostrar�.
*/
public void mostrarNota(int numeroDeNota)
{
if(numeroDeNota < 0) {
// No es un n�mero de nota v�lido, por lo tanto no se hace nada.
}
else if(numeroDeNota < numeroDeNotas()) {
// Es un n�mero v�lido de nota, por lo tanto se la puede mostrar.
System.out.println(notas.get(numeroDeNota));
}
else {
// No es un n�mero v�lido de nota, por lo tanto no se hace nada.
}
}

public void eliminarNota(int numeroDeNota) 
{
    if (numeroDeNota < numeroDeNotas() && numeroDeNota >= 0)
    {
        notas.remove(numeroDeNota);    
    }
}

}


