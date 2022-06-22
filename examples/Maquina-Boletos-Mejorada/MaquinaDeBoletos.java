/**
 * Maquina de boletos modela una máquina de boletos que trabaja con tarifa plana.
 * El precio del boleto se especifica a través del constructor.
 * Implementa controles para asegurar que un usuario ingrese
 * sólo cantidades de dinero con sentido y sólo se imprimirá
 * un boleto si el dinero ingresado alcanza.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2006.03.30
 */
public class MaquinaDeBoletos
{
    // El precio de un boleto a partir de esta máquina.
    private int precio;
    // La cantidad de dinero ingresada por el usuario hasta
    // el momento.
    private int saldo;
    // El total de dinero recolectado por ésta máquina.
    private int total;

    /**
     * Crea una máquina que suministra boletos de un precio dado..
     */
    public MaquinaDeBoletos(int precioDelBoleto)
    {
        precio = precioDelBoleto;
        saldo = 0;
        total = 0;
    }
    
    
    /*
     * Segundo constructor, asigna el precio de forma predeterminada.
     
     * Ejercicio 2.42
     */
    
    public MaquinaDeBoletos() {
        precio = 500;
        saldo = 0;
        total = 0;
    }
    
    /*
     * Ejercicio 2.33
     */
    public void mensaje() {
        System.out.println("Por favor, ingrese la cantidad de dinero correcta");
    }
    
    /*
     * Ejercicio 2.34
     */
    public void mostrarPrecio() {
        System.out.println("El precio del boleto es de " + precio + " ctvos.");
    }

    /**
     * Retorna el precio de un boleto.
     */
    public int getPrecio()
    {
        return precio;
    }

    /**
     * Retorna la cantidad de dinero ya insertada para el
     * siguiente boleto
     */
    public int getSaldo()
    {
        return saldo;
    }
    
    /**
     * Retorna la cantidad de dinero que va acumulando la maquina de boletos
     */
    public int getTotal()//no original
    {
        return total;
    }

    /**
     * Recibe del usuario una cantidad de dinero en centavos. 
     * Controla que la cantidad tenga sentido.
     */
 public void insertarDinero(int cantidad)
    {
        if(cantidad >= 0) {
            saldo = saldo + cantidad;
        }
        else {
            System.out.println("Debe ingresar una cantidad positiva: " +
                               cantidad);
        }
        
        return;
    }

    
    /* Asignar el precio al boleto
     * Ejercicio 2.30
     * Ejercicio 2.41
       */
      
      public void asignarPrecioBoleto(int precio1)
      {
          precio = precio1;          
      }
      
    /**
     * Imprime un boleto si la cantidad de dinero ingresada
     * alcanza y disminuye el saldo actual en el precio del
     * boleto. Imprime un mensaje de error si se requiere más
     * dinero.
     */
    public void imprimirBoleto()
    {
        if(saldo >= precio) {
           // Simulata la impresión de un boleto.
           System.out.println("##################");
           System.out.println("# La Línea BlueJ");
           System.out.println("# Boleto");
           System.out.println("# " + precio + " cvos.");
           System.out.println("##################");
           System.out.println();

           // Actualizar el total recolectado con el saldo.
           total = total + precio;
           // Reduce el saldo en el precio del boleto.
           saldo = saldo - precio;
        }
        else {
            System.out.println("Debe ingresar como mínimo: " +
                               (precio - saldo) + " cvos. más.");
                    
        }
    }

    /**
     * Da el vuelto del dinero ingresado cuando es superior al precio
     * El saldo se pone a cero
     * Dinero devuelto al cliente, sobrante resultante despu�s de imprimir los boletos necesarios
     */
    public int reintegrarSaldo()
    {
        int cantidadAReintegrar;
        cantidadAReintegrar = saldo;
        saldo = 0;
        return cantidadAReintegrar;
    }
    
    /** 
     * Retira el saldo total recaudado por la maquina
     * pone a cero el total Ejercicio 2.40
     */
    public void vaciarMaquina()    
    {   total=0;
    }

}
