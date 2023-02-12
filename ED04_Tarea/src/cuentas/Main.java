package cuentas;

/**
 *
 * Clase Main para ejecutar el programa.
 * 
 * @author Pilar
 * @version 1.0
 * @since 2023/02/12
 */
public class Main {

    /**
     * Método Main para ejecutar el programa.
     * 
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, 2300);
    }
    
    /**
     * Método para operar con cuentas.
     * 
     * @param cuenta Cuenta con la que se va a operar.
     * @param cantidad Cantidad con la que se va a operar
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual;
        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual );

        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
