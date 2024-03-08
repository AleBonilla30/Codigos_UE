package model;

public class Cuenta {
    private String DNI;
    private int pin;
    private double saldoInicial;

    public Cuenta() {
    }

    public Cuenta(String DNI, int pin, double saldoInicial){
        this.DNI = DNI;
        this.pin = pin;
        this.saldoInicial = saldoInicial;
    }

    public void ingresarDinero(int cantidad){
        if (cantidad > 0){
            saldoInicial += cantidad;
            System.out.println("Ingreso realizado con éxito.");
        }else {
            System.out.println("La cantidad ingresada no es valida");
        }
    }

    public void retirarDinero(int cantidad){
        if (cantidad > 0 && cantidad <= saldoInicial){
          saldoInicial -= cantidad;
            System.out.println("Retiro realizado con exito");
        }else {
            System.out.println("La cantidad a retirar es insuficiente");
        }
    }

    public void resumenCuenta(String DNI, int pin){
        System.out.println("------Los datos de la cuenta------");
        System.out.println("Dni del titular: "+DNI);
        System.out.println("Saldo disponible: "+saldoInicial);
    }

}
