package cuentas;

/**
 *
 * Clase para tratar cuentas corrientes.
 * 
 * @author Pilar
 * @version 1.0
 * @since 2023/02/12
 */
public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
    * Constructor de la clase CCuenta para objetos vacíos.
    */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase CCuenta indicando los parámetros de
     * la cuenta a crear.
     * 
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo disponible
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método para devolver el estado de la cuenta.
     * 
     * @return Devuelve el saldo de la cuenta.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método para ingresar una cantidad en la cuenta.
     * 
     * @param cantidad Parámetro que representa la cantidad a ingresar.
     * @throws Exception Devuelve una excepción en el caso de que la cantidad
     *      introducida sea negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar una cantidad de la cuenta.
     * 
     * @param cantidad Parámetro que representa la cantidad a retirar.
     * @throws Exception Devuelve una excepción en el caso de que la cantidad
     *      introducida sea negativa o igual a 0, o bien que la cantidad introducida 
     *      provoque un descubierto.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Método de encapsulación para acceder al atributo nombre.
     * 
     * @return Devuelve el nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método de encapsulación para modificar el atributo nombre.
     * 
     * @param nombre Nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Encapsulamos los atributos a través de métodos getters and setters.

    /**
     * Método de encapsulación para acceder al atributo cuenta.
     * 
     * @return Devuelve el número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método de encapsulación para modificar el atributo cuenta.
     * 
     * @param cuenta Número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método de encapsulación para acceder al atributo saldo.
     * 
     * @return Devuelve el saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método de encapsulación para modificar el atributo saldo.
     * 
     * @param saldo Saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método de encapsulación para acceder al atributo tipoInteres.
     * 
     * @return Devuelve el tipo de interés de la cuenta.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Método de encapsulación para modificar el atributo tipoInteres.
     * 
     * @param tipoInteres Tipo de interés de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
