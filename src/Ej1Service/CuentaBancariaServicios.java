package Ej1Service;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicios {

    Scanner leer = new Scanner(System.in);
    
    private CuentaBancaria cuenta;

    public CuentaBancaria CrearCuenta() {

        System.out.println("Ingresar el número de cuenta");
        int NumeroCuenta = leer.nextInt();

        System.out.println("Ingresar el número de dni");
        long dniCliente = leer.nextLong();

        System.out.println("Ingresar el saldo actual");
        double SaldoActual = leer.nextDouble();

        return new CuentaBancaria(NumeroCuenta, dniCliente, SaldoActual);
    }
   
    public void Ingresar() {

        System.out.println("Ingrese el monto a ingresar a la cuenta: ");
   
        cuenta.setSaldoActual(cuenta.getSaldoActual() + leer.nextDouble());

        System.out.println("El saldo actual es: "+cuenta.getSaldoActual());
  }

    public void Retirar(){
        
       
        
        System.out.println("Ingrese el monto a retirar: ");
        double monto= leer.nextInt();
        
        if (monto<=cuenta.getSaldoActual()){
            
            cuenta.setSaldoActual(cuenta.getSaldoActual()-monto);
            
            System.out.println("El salario retirado fue de "+monto+" el saldo en su cuenta es de "+cuenta.getSaldoActual());
        }else{
            System.out.println("Fondos insuficientes para retirar el monto ingresado,la cantidad retirada fue de: "+monto);
        }
        
    }
    
    
    
    
}
