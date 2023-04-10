
package Entidades;


public class CuentaBancaria {
    
    private int NumeroCuenta;
    private long dniCliente;
    private double SaldoActual;

    public CuentaBancaria(int NumeroCuenta, long dniCliente, double SaldoActual) {
        this.NumeroCuenta = NumeroCuenta;
        this.dniCliente = dniCliente;
        this.SaldoActual = SaldoActual;
    }

    public CuentaBancaria() {
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

 
    
}
