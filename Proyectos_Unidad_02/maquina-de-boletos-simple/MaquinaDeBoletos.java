/**
 * MaquinaDeBoletos modela una máquina de boletos ingenua
 * que entrega boletos de transporte.
 * El precio del boleto se especifica por via del constructor.
 * Es una máquina ingenua en el sentido de que confía en que 
 * sus usuarios insertarán suficiente dinero antes de imprimir
 * el boleto.
 * Incluso asume que los usuarios entraran cantidades suficientes.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2006.03.30
 * Traducción: Carlos A. Bartó
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
    
    private int estado;

    /**
     * Crea una máquina que suministra boletos de un precio dado.
     * Notar que el precio debe ser mayor que cero, y que no se
     * hacen verificaciones para asegurarlo.
     **/
    public MaquinaDeBoletos(int precioBoleto)
    {
        precio = precioBoleto;
        saldo = 0;
        total = 0;
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
     * Recibe del usuario una cantidad de dinero en centavos. 
     */
    public void insertarDinero(int cantidad)
    {
        saldo = saldo + cantidad;
    }

    /**
     * Imprime un boleto.
     * Actualiza el total de dinero recolectado y 
     * pone el saldo en cero.
     */
    public void imprimirBoleto()
    {
        // Simulata la impresión de un boleto.
        System.out.println("##################");
        System.out.println("# La Línea BlueJ");
        System.out.println("# Boleto");
        System.out.println("# " + precio + " cvos.");
        System.out.println("##################");
        System.out.println();

        // Actualizar el total recolectado con el saldo.
        total = total + saldo;
        // Limpiar el saldo.
        saldo = 0;
    }
}
